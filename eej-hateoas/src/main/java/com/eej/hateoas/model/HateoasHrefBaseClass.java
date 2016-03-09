/**
 * 
 */
package com.eej.hateoas.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public abstract class HateoasHrefBaseClass implements HateoasHref{
	
	private String href;

	/**
	 * @param href
	 */
	public HateoasHrefBaseClass(String href) {
		super();
		this.href = href;
	}

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.HateoasHref#getHref()
	 */
	@JsonUnwrapped
	public String getHref() {
		return this.href;
	}

	
}
