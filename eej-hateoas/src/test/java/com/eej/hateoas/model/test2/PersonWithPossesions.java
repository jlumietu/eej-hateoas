/**
 * 
 */
package com.eej.hateoas.model.test2;

import com.eej.hateoas.PackageVersion;
import com.eej.hateoas.annotations.HateoasEntity;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
@HateoasEntity
public class PersonWithPossesions extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;
	
	private Vehiculo vehiculo;

	/**
	 * 
	 */
	public PersonWithPossesions() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public PersonWithPossesions(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param vehiculo
	 */
	public PersonWithPossesions(String nombre, String apellidos, int edad,
			Vehiculo vehiculo) {
		super(nombre, apellidos, edad);
		this.vehiculo = vehiculo;
	}

	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}	

}
