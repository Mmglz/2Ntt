package com.nttdata.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.spring.repository.Floor;
import com.nttdata.spring.repository.FloorRepositoryI;

/**
 * Implementación del servicio de Planta
 * 
 * @author manoli
 *
 */
@Service
public class FloorManagementServiceImpl implements FloorManagementServiceI {

	/** Repositorio. */
	@Autowired
	private FloorRepositoryI floorRepo;

	@Override
	public void insertNewFloor(Floor newFloor) {

		// Verificación de nulidad y existencia.
		if (newFloor != null && newFloor.getIdFloor() == null) {

			// Inserción de una nueva planta.
			floorRepo.save(newFloor);
		}
	}

	@Override
	public void updateFloor(Floor updateFloor) {

		// Verificación de nulidad y existencia.
		if (updateFloor != null && updateFloor.getIdFloor() != null) {

			// Actualización de una planta.
			floorRepo.save(updateFloor);
		}
	}

	@Override
	public void deleteFloor(Floor deleteFloor) {

		// Verificación de nulidad y existencia.
		if (deleteFloor != null && deleteFloor.getIdFloor() != null) {

			// Eliminación de una planta.
			floorRepo.delete(deleteFloor);
			System.out.println("La planta con ID " + deleteFloor.getIdFloor() + " ha sido borrada.");
		}
	}

}
