/**
 * 
 */
package org.ccba.inertie.Api.reflexion;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Dakeyras
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class CrudField {
	
	private String name;
	
	private CrudFieldType type;
}
