/**
 * 
 */
package org.ccba.inertie.Api.model.canniste;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@CrudTableReflexion(routeName = "diplomas")
public class Diploma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Canniste canniste;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@ManyToOne
	private DiplomaType diplomaType;
}
