/**
 * 
 */
package com.eej.hateoas.model.deprecated;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
@Deprecated
public interface HateoasLink<K,V> extends Map.Entry<K,V>, Serializable{
	
	/*public abstract HateoasLinkType getHateoasLinkType();
	
	public abstract HateoasHref getHateoasHref();*/
	
	public abstract Map.Entry<K,V> getLink();
	
	

}
