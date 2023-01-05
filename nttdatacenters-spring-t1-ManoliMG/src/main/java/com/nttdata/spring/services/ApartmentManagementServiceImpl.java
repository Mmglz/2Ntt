package com.nttdata.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.spring.repository.Apartment;
import com.nttdata.spring.repository.ApartmentRepositoryI;

/**
 * Implementación del servicio de Apartamento.
 * 
 * @author manoli
 *
 */
@Service
public class ApartmentManagementServiceImpl implements ApartmentManagementServiceI {

	/** Repositorio. */
	@Autowired
	private ApartmentRepositoryI apartmentRepo;

	@Override
	public void insertNewApartment(Apartment newApartment) {

		// Verificación de nulidad y existencia.
		if (newApartment != null && newApartment.getIdApartment() == null) {

			// Inserción de un nuevo apartamento.
			apartmentRepo.save(newApartment);
		}
	}

	@Override
	public void updateApartment(Apartment updateApartment) {

		// Verificación de nulidad y existencia.
		if (updateApartment != null && updateApartment.getIdApartment() != null) {

			// Actualización de un apartamento.
			apartmentRepo.save(updateApartment);
		}
	}

	@Override
	public void deleteApartment(Apartment deleteApartment) {

		// Verificación de nulidad y existencia.
		if (deleteApartment != null && deleteApartment.getIdApartment() != null) {

			// Eliminación de un apartamento.
			apartmentRepo.delete(deleteApartment);
			System.out.println("El apartamento con ID " + deleteApartment.getIdApartment() + " ha sido borrado.");
		}
	}
}
