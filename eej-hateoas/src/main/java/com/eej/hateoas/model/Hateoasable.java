/**
 * 
 */
package com.eej.hateoas.model;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public interface Hateoasable {
	
	public Object getContent();

	/**
	 * @param content the content to set
	 */
	public void setContent(Object content);

	/**
	 * @return the link
	 */
	public HateoasLinkGroup getLink();

	/**
	 * @param link the link to set
	 */
	public void setLink(HateoasLinkGroup link);

}
