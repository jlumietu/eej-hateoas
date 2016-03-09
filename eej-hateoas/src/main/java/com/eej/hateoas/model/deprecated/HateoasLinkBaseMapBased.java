package com.eej.hateoas.model.deprecated;

import java.util.HashMap;
import java.util.Map;

import com.eej.hateoas.PackageVersion;
import com.eej.hateoas.model.HateoasHref;
import com.eej.hateoas.model.HateoasLinkType;

@Deprecated
public class HateoasLinkBaseMapBased extends HashMap<HateoasLinkType, HateoasHref> implements HateoasLink<HateoasLinkType, HateoasHref>{

	/**
	 * @param linkType
	 * @param linkRef
	 */
	public HateoasLinkBaseMapBased(HateoasLinkType linkType, HateoasHref linkRef) {
		super();
		this.put(linkType, linkRef);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;

	public HateoasLinkType getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public HateoasHref getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public HateoasHref setValue(HateoasHref value) {
		// TODO Auto-generated method stub
		return null;
	}

	public java.util.Map.Entry<HateoasLinkType, HateoasHref> getLink() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
