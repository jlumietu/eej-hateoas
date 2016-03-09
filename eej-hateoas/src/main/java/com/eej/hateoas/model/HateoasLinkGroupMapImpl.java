/**
 * 
 */
package com.eej.hateoas.model;

import java.util.HashMap;

import com.eej.hateoas.PackageVersion;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class HateoasLinkGroupMapImpl extends HashMap<HateoasLinkType, HateoasHref> implements
		HateoasLinkGroup {

	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;

	/**
	 * 
	 */
	public void addLink(HateoasLinkType linkType, HateoasHref href) {
		this.put(linkType, href);
	}

}
