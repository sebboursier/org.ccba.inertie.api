/**
 * 
 */
package org.ccba.inertie.Api.reflexion;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Dakeyras
 *
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface CrudTableReflexion {
	
	String routeName() default "";

}