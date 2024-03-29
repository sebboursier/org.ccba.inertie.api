/**
 * 
 */
package org.ccba.inertie.Api.reflexion;

import java.util.List;

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
public class CrudTable {
	
	private String name;
	
	private String routeName;
	
	private List<CrudField> columns;
	
}
