/**
 * 
 */
package org.ccba.inertie.Api.reflexion;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Dakeyras
 *
 */
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface CrudFieldReflexion {
	
	CrudFieldType type() default CrudFieldType.STRING;

}