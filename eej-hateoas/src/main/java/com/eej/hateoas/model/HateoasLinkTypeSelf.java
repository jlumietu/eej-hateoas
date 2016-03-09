/**
 * 
 */
package com.eej.hateoas.model;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class HateoasLinkTypeSelf implements HateoasLinkType {
	
	private String linkType = "self";

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.HateoasLinkType#getLinkType()
	 */
	public String getLinkType() {
		return this.linkType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.linkType.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.linkType.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HateoasLinkType){
			return this.linkType.equals(((HateoasLinkType) obj).getLinkType());
		}
		return false;
	}
	
	
	
	

}
