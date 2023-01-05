package com.nttdata.spring.services;

import java.util.List;
import com.nttdata.spring.repository.Person;

/**
 * Interfaz del servicio de Persona
 * 
 * @author manoli
 *
 */
public interface PersonManagementServiceI {

	/**
	 * Inserta una nueva persona.
	 * 
	 * @param newPerson
	 */
	public void insertNewPerson(final Person newPerson);

	/**
	 * Actualiza una persona existente.
	 * 
	 * @param updatePerson
	 */
	public void updatePerson(final Person updatePerson);

	/**
	 * Elimina una persona existente.
	 * 
	 * @param deletePerson
	 */
	public void deletePerson(final Person deletePerson);

	/**
	 * Obtiene todas las personas existentes.
	 * 
	 * @return List<Person>
	 */
	public List<Person> searchAll();

	/**
	 * Obtiene una persona por su nombre y apellidos.
	 * 
	 * @param name
	 * @param surnames
	 * @return List <Person>
	 */
	public List<Person> searchByNameAndSurnames(String name, String surnames);

}
