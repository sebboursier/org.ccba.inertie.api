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
public class Canniste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDeNaissance;
	
	private String lieuDeNaissance;
	
	private String adresse;
	
	private String codePostal;
	
	private String ville;
	
	private String mail;
	
	private String telephone;
	
	private Boolean sexe;
	
	@OneToMany(mappedBy = "canniste")
	private Set<Licence> Licences;
}
