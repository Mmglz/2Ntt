package com.nttdata.spring.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.spring.repository.Person;
import com.nttdata.spring.repository.PersonRepositoryI;

/**
 * Implementación del servicio de Persona
 * 
 * @author manoli
 *
 */
@Service
public class PersonManagementServiceImpl implements PersonManagementServiceI {

	/** Repositorio. */
	@Autowired
	private PersonRepositoryI personRepo;

	@Override
	public void insertNewPerson(Person newPerson) {

		// Verificación de nulidad y existencia.
		if (newPerson != null && newPerson.getIdPerson() == null) {

			// Inserción de una nueva persona.
			personRepo.save(newPerson);
		}
	}

	@Override
	public void updatePerson(Person updatePerson) {

		// Verificación de nulidad y existencia.
		if (updatePerson != null && updatePerson.getIdPerson() != null) {

			// Actualización de una persona.
			personRepo.save(updatePerson);
		}
	}

	@Override
	public void deletePerson(Person deletePerson) {

		// Verificación de nulidad y existencia.
		if (deletePerson != null && deletePerson.getIdPerson() != null) {

			// Eliminación de una persona.
			personRepo.delete(deletePerson);
			System.out.println("La persona con ID " + deletePerson.getIdPerson() + " ha sido borrada.");
		}
	}

	@Override
	public List<Person> searchAll() {

		return personRepo.findAll();
	}

	@Override
	public List<Person> searchByNameAndSurnames(String name, String surnames) {

		List<Person> personList = new ArrayList<>();

		// Verificación de nulidad.
		if (name != null && surnames != null) {

			// Obtención del cliente por nombre y apellidos.
			personList = personRepo.findByNameAndSurnames(name, surnames);
		}

		return personList;
	}

}
