/**
 * 
 */
package com.eej.hateoas.model.test2;

/**
 * @author Mikel Ibiricu Alfaro - jlumietu@gmail.com
 *
 */
public class Turismo extends Automovil implements VehiculoConEjes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numeroMaximoPasajeros;

	private String turismo = "Turismo";
	
	/**
	 * @param numeroMaximoPasajeros
	 * @param turismo
	 */
	public Turismo(int numeroMaximoPasajeros) {
		super();
		this.numeroMaximoPasajeros = numeroMaximoPasajeros;
	}

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.test2.Automovil#getNumeroMaximoPasajeros()
	 */
	@Override
	public int getNumeroMaximoPasajeros() {
		return this.numeroMaximoPasajeros;
	}

	/* (non-Javadoc)
	 * @see com.eej.hateoas.model.test2.Automovil#getNombre()
	 */
	@Override
	public String getNombre() {
		return this.turismo;
	}

}
