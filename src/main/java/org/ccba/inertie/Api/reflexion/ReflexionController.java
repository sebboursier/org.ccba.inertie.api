package org.ccba.inertie.Api.reflexion;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import org.ccba.inertie.Api.model.club.Club;
import org.reflections.Reflections;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Awaceb04
 *
 */
@RestController
@CrossOrigin
public class ReflexionController {

	@GetMapping("/reflexion")
	public Set<CrudTable> getCrudTables() {
		Reflections reflections = new Reflections("org.ccba.inertie.Api.model");
		Set<Class<?>> entities = reflections.getTypesAnnotatedWith(Entity.class);		
		
		Set<CrudTable> crudTables = new HashSet<CrudTable>();
		for (Class<?> entity : entities) {
			CrudTable crudTable = new CrudTable();
			
			crudTable.setNom(entity.getSimpleName());
			
			crudTables.add(crudTable);
		}
		
		return crudTables;
	}
}
