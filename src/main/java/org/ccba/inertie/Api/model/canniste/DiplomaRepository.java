 /**
 * 
 */
package org.ccba.inertie.Api.model.canniste;

import org.ccba.inertie.Api.model.club.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Awaceb04
 *
 */
@RepositoryRestResource
public interface DiplomaRepository extends JpaRepository<Diploma, Long>  {

}
