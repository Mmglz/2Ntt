package com.nttdata.spring.services;

import com.nttdata.spring.repository.Apartment;

/**
 * Interfaz del servicio de Apartamento
 * 
 * @author manoli
 *
 */
public interface ApartmentManagementServiceI {

	/**
	 * Inserta un nuevo apartamento.
	 * 
	 * @param newApartment
	 */
	public void insertNewApartment(final Apartment newApartment);

	/**
	 * Actualiza un apartamento existente.
	 * 
	 * @param updateApartment
	 */
	public void updateApartment(final Apartment updateApartment);

	/**
	 * Elimina un apartamento existente.
	 * 
	 * @param deleteApartment
	 */
	public void deleteApartment(final Apartment deleteApartment);

}
