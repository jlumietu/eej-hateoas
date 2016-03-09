/**
 * 
 */
package com.eej.hateoas.test;

import com.eej.hateoas.model.HateoasHref;
import com.eej.hateoas.model.HateoasLinkGroup;
import com.eej.hateoas.model.HateoasLinkGroupMapImpl;
import com.eej.hateoas.model.HateoasLinkType;
import com.eej.hateoas.model.HateoasLinkTypeSelf;
import com.eej.hateoas.model.Test1HateoasObject;
import com.eej.hateoas.model.TestHateoasHref;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class Test1 {
	
	public static void main (String args[]){
		Test1HateoasObject testObject = new Test1HateoasObject();
		testObject.setContent("Coche");
		HateoasLinkType linkType = new HateoasLinkTypeSelf();
		HateoasHref href = new TestHateoasHref("http://micasa/me/la/robaron");
		/*HateoasLink<HateoasLinkType, HateoasHref> link = 
				new HateoasLinkBaseMapBased(linkType, href);*/
		HateoasLinkGroup group = new HateoasLinkGroupMapImpl();
		group.addLink(linkType, href);
		testObject.setLink(group);
		
		ObjectMapper mapper = new ObjectMapper();
		
		//Object to JSON in String
		String jsonInString;
		try {
			jsonInString = mapper.writeValueAsString(testObject);
			System.out.println("hateoas json :" + jsonInString);
		} catch (JsonProcessingException e) {
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
