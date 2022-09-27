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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ccba.inertie.Api.model.club.Club;
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
@CrudTableReflexion(routeName = "cannistes")
public class Canniste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String lastName;
	
	private String firstName;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;
	
	private String birthPlace;
	
	private String address;
	
	private String postalcode;
	
	private String city;
	
	private String email;
	
	private String phoneNumber;
	
	private Boolean sexe;
	
	@OneToMany(mappedBy = "canniste")
	private Set<License> licenses;
}
