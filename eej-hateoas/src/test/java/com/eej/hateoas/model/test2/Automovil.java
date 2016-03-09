/**
 * 
 */
package com.eej.hateoas.model.test2;

import com.eej.hateoas.PackageVersion;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public abstract class Automovil implements VehiculoConEjes {

	/**
	 * 
	 */
	private static final long serialVersionUID = PackageVersion.APP_VERSION;
	private int numeroRuedas;
	private int numeroEjes;
	
	/**
	 * 
	 */
	public Automovil() {
		super();
		this.numeroRuedas = 4;
		this.numeroEjes = 2;
	}

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.test2.Vehiculo#getNumeroRuedas()
	 */
	public int getNumeroRuedas() {
		return this.numeroRuedas;
	}

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.test2.Vehiculo#getNumeroMaximoPasajeros()
	 */
	public abstract int getNumeroMaximoPasajeros();

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.test2.Vehiculo#getNombre()
	 */
	public abstract String getNombre();

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.test2.VehiculoConEjes#getNumeroEjes()
	 */
	public int getNumeroEjes() {
		return numeroEjes;
	}

}
