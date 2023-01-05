package com.nttdata.spring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Persona
 * 
 * @author manoli
 *
 */
@Repository
public interface PersonRepositoryI extends JpaRepository<Person, Long> {

	/**
	 * Método que busca por nombre y apellidos.
	 * 
	 * @param name
	 * @param surnames
	 * @return List<Person>
	 */
	public List<Person> findByNameAndSurnames(final String name, final String surnames);

}
