/**
 * 
 */
package org.ccba.inertie.Api.model.canniste;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Licence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numero;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private Boolean fiche;
	
	private Boolean frais;
	
	private Boolean certificatMedical;
	
	@Column(columnDefinition = "TEXT")
	private String commentaire;
	
	@ManyToOne
	private Canniste canniste;
	
	@ManyToOne
	private Club club;
}
