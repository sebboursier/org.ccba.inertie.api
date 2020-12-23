 /**
 * 
 */
package org.ccba.inertie.Api.model.club;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Awaceb04
 *
 */
@RepositoryRestResource
public interface SessionTagRepository extends JpaRepository<SessionTag, Long>  {

}
