/**
 * 
 */
package com.eej.hateoas.model.test2;

import java.io.Serializable;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public interface Vehiculo extends Serializable {
	
	public int getNumeroRuedas();
	
	public int getNumeroMaximoPasajeros();
	
	public String getNombre();

}
