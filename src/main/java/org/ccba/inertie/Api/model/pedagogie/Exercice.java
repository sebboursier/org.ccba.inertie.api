/**
 * 
 */
package org.ccba.inertie.Api.model.pedagogie;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

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
public class Exercice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private String nom;
	
	@Enumerated(EnumType.STRING)
	private ExerciceType type;
	
	@Column(columnDefinition = "TEXT")
	private String description;

	@ManyToMany
	private Set<ExerciceTag> tags;
}
