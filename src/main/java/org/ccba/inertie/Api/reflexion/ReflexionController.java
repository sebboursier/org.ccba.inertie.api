package org.ccba.inertie.Api.reflexion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
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
			
			// Name
			crudTable.setName(entity.getSimpleName());
			
			// RouteName
			final CrudTableReflexion crudTableReflexion = entity.getAnnotation(CrudTableReflexion.class);
			if (crudTableReflexion != null) {
				crudTable.setRouteName(crudTableReflexion.routeName());
			}
			
			// Columns
			List<CrudField> columns = new ArrayList<CrudField>();
			for (Field field : entity.getDeclaredFields()) {
				CrudFieldReflexion crudFieldReflexion = field.getAnnotation(CrudFieldReflexion.class);
				if (crudFieldReflexion != null)	{
					CrudField crudField = new CrudField();
					
					crudField.setName(field.getName());
					crudField.setType(crudFieldReflexion.type());
					
					columns.add(crudField);
				}
			}
			crudTable.setColumns(columns);
			
			crudTables.add(crudTable);
		}
		
		return crudTables;
	}
}
