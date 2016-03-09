/**
 * 
 */
package com.eej.hateoas.test;

import com.eej.hateoas.core.HateoasingUtil;
import com.eej.hateoas.core.HateoasingUtilImpl;
import com.eej.hateoas.model.HateoasComplexObject;
import com.eej.hateoas.model.HateoasHref;
import com.eej.hateoas.model.HateoasLinkGroup;
import com.eej.hateoas.model.HateoasLinkGroupMapImpl;
import com.eej.hateoas.model.HateoasLinkType;
import com.eej.hateoas.model.HateoasLinkTypeBase;
import com.eej.hateoas.model.HateoasLinkTypeSelf;
import com.eej.hateoas.model.HateoasObject;
import com.eej.hateoas.model.Hateoasable;
import com.eej.hateoas.model.TestHateoasHref;
import com.eej.hateoas.model.test2.Person;
import com.eej.hateoas.model.test2.PersonWithPossesions;
import com.eej.hateoas.model.test2.Turismo;
import com.eej.hateoas.model.test2.Vehiculo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class Test5_HateoasingUtil {
	
	public static void main (String args[]){
		Hateoasable hateoasable = new HateoasComplexObject(); 
		Vehiculo coche = new Turismo(5);
		Person persona = new Person("Mikel", "Ibiricu Alfaro", 35);
		hateoasable.setContent(persona);
		((HateoasComplexObject)hateoasable).addObject(coche.getNombre(), coche);
		HateoasLinkType linkType = new HateoasLinkTypeSelf();
		HateoasHref href = new TestHateoasHref("http://micasa/me/la/robaron");
		/*HateoasLink<HateoasLinkType, HateoasHref> link = 
				new HateoasLinkBaseMapBased(linkType, href);*/
		HateoasLinkGroup group = new HateoasLinkGroupMapImpl();
		group.addLink(linkType, href);
		group.addLink(new HateoasLinkTypeBase("other"), new TestHateoasHref("http://otra/url"));
		hateoasable.setLink(group);
		
		ObjectMapper mapper = new ObjectMapper();
		
		//Object to JSON in String
		String jsonInString;
		try {
			jsonInString = mapper.writeValueAsString(hateoasable);
			System.out.println("hateoas json :" + jsonInString);
		} catch (JsonProcessingException e) {
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
		
		Person persona2 = new PersonWithPossesions("Mikel", "Ibiricu Alfaro", 35, coche);
		HateoasingUtil util = new HateoasingUtilImpl();
		util.hateoaseIt(persona2);
		
	}

}
