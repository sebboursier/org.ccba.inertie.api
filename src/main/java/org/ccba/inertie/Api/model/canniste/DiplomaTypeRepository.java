 /**
 * 
 */
package org.ccba.inertie.Api.model.canniste;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Awaceb04
 *
 */
@RepositoryRestResource
public interface DiplomaTypeRepository extends JpaRepository<DiplomaType, Long>  {

}
