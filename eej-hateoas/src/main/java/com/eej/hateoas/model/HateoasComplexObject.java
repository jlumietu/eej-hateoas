/**
 * 
 */
package com.eej.hateoas.model;

import java.util.HashMap;
import java.util.Map;

import com.eej.hateoas.PackageVersion;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class HateoasComplexObject extends HateoasObject implements Hateoasable {

	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;
	
	@JsonUnwrapped
	private Map<String, Object> objects;
	
	public synchronized void addObject(String name, Object o){
		if(objects == null){
			objects = new HashMap<String, Object>(); 
		}
		objects.put(name, o);
	}

	/**
	 * @return the objects
	 */
	public Map<String, Object> getObjects() {
		return objects;
	}

	/**
	 * @param objects the objects to set
	 */
	public void setObjects(Map<String, Object> objects) {
		this.objects = objects;
	}	
	
	

}
