/**
 * 
 */
package com.eej.hateoas.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public interface HateoasHref {
	
	@JsonUnwrapped
	public abstract String getHref();

}
