/**
 * 
 */
package org.ccba.inertie.Api.model.pedagogy;

import org.ccba.inertie.Api.model.club.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Awaceb04
 *
 */
@RepositoryRestResource
public interface ExerciseRepository extends JpaRepository<Exercise, Long>  {

}
