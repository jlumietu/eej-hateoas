/**
 * 
 */
package com.eej.hateoas.model;

import java.io.Serializable;

import com.eej.hateoas.PackageVersion;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class HateoasObject implements Serializable, Hateoasable {

	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;
	
	@JsonUnwrapped
	private Object content;
	
	private HateoasLinkGroup link;

	/**
	 * @return the content
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Object content) {
		this.content = content;
	}

	/**
	 * @return the link
	 */
	public HateoasLinkGroup getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(HateoasLinkGroup link) {
		this.link = link;
	}
	
	

}
