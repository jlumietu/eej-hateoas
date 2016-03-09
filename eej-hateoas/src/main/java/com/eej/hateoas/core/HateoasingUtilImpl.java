/**
 * 
 */
package com.eej.hateoas.core;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eej.hateoas.annotations.HateoasEntity;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class HateoasingUtilImpl implements HateoasingUtil {

	/* (non-Javadoc)
	 * @see com.eej.hateoas.core.HateoasingUtil#hateoaseIt(java.lang.Object)
	 */
	public Object hateoaseIt(Object o) {
		System.out.println("Object o class " + o.getClass().getName() + " -> " + o.getClass().isAnnotationPresent(HateoasEntity.class));
		if(o.getClass().isAnnotationPresent(HateoasEntity.class)){
			System.out.println("HateoasEntity");
			Class<? extends Object> c = o.getClass();
			Map<String, Object> objectsMap = new HashMap<String, Object>();
			List<Field> listaCampos = new ArrayList<Field>();
			for(Field f : c.getFields()){
				listaCampos.add(f);
			}
			for(Field f : c.getDeclaredFields()){
				listaCampos.add(f);
			}
			for(Field f : listaCampos){
				f.setAccessible(true);
				Class<? extends Object> inner = f.getDeclaringClass();
				System.out.println("Field " + f.getName() + " of class " + inner.getName());
				Object content = null;
				try {
					content = f.get(o);
					System.out.println("content " + content.toString() + " of class " + content.getClass().getName() + " primitive = " + content.getClass().isPrimitive());
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*if(content != null){
					content.getClass().isPrimitive()
				}*/
			}			
		}
		return o;
	}

}
