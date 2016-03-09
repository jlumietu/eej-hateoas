/**
 * 
 */
package com.eej.hateoas.model;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public interface HateoasLinkGroup {
	
	public abstract void addLink(HateoasLinkType linkType, HateoasHref href);

}
