package com.nttdata.spring.services;

import com.nttdata.spring.repository.Floor;

/**
 * Interfaz del servicio de Planta
 * 
 * @author manoli
 *
 */
public interface FloorManagementServiceI {

	/**
	 * Inserta una nueva planta.
	 * 
	 * @param newFloor
	 */
	public void insertNewFloor(final Floor newFloor);

	/**
	 * Actualiza una planta existente.
	 * 
	 * @param updateFloor
	 */
	public void updateFloor(final Floor updateFloor);

	/**
	 * Elimina una planta existente.
	 * 
	 * @param deleteFloor
	 */
	public void deleteFloor(final Floor deleteFloor);

}
