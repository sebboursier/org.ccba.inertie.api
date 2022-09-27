/**
 * 
 */
package org.ccba.inertie.Api.model.club;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ccba.inertie.Api.model.pedagogy.ExerciseTag;
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
@CrudTableReflexion(routeName = "sessions")
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private int number;
	
	private int nbNew;
	
	@ManyToMany
	private Set<SessionTag> tags;
	
	@ManyToOne
	private Club club;
}
