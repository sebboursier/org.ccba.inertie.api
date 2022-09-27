/**
 * 
 */
package org.ccba.inertie.Api.model.canniste;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.ccba.inertie.Api.reflexion.CrudFieldReflexion;
import org.ccba.inertie.Api.reflexion.CrudFieldType;
import org.ccba.inertie.Api.reflexion.CrudTableReflexion;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Awaceb04
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@CrudTableReflexion(routeName = "diplomaTypes")
public class DiplomaType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	@CrudFieldReflexion
	private String name;
	
	@CrudFieldReflexion
	private String description;
	
	@ManyToMany
	@CrudFieldReflexion(type = CrudFieldType.TO_MANY)
	private Set<DiplomaType> requiredDiplomas;
	
	@OneToMany(mappedBy = "diplomaType")
	private Set<Diploma> deliveredDiplomas;
}
