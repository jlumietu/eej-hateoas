/**
 * 
 */
package com.eej.hateoas.model.deprecated;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.eej.hateoas.PackageVersion;
import com.eej.hateoas.model.HateoasHref;
import com.eej.hateoas.model.HateoasLinkType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
@Deprecated
public class HateoasLinkBaseClass<K,V> implements HateoasLink<HateoasLinkType, HateoasHref> {

	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;

	private Entry<HateoasLinkType,HateoasHref> entry;
	
	/**
	 * @param linkType
	 * @param linkRef
	 */
	public HateoasLinkBaseClass(HateoasLinkType linkType, HateoasHref linkRef) {
		super();
		 Map<HateoasLinkType, HateoasHref> theMap = new HashMap<HateoasLinkType, HateoasHref>();
		 theMap.put(linkType, linkRef);
		 this.entry = theMap.entrySet().iterator().next();
	}

	@JsonIgnore
	public HateoasLinkType getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@JsonIgnore
	public HateoasHref getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public HateoasHref setValue(HateoasHref value) {
		// TODO Auto-generated method stub
		return null;
	}


	public  Entry<HateoasLinkType, HateoasHref> getLink() {
		// TODO Auto-generated method stub
		System.out.println("Entry: " + entry.getClass().getName());
		return entry;
	}

	

}
