package com.nttdata.spring;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nttdata.spring.repository.Apartment;
import com.nttdata.spring.repository.Floor;
import com.nttdata.spring.repository.Person;
import com.nttdata.spring.services.ApartmentManagementServiceI;
import com.nttdata.spring.services.FloorManagementServiceI;
import com.nttdata.spring.services.PersonManagementServiceI;

/**
 * Clase principal
 * 
 * @author manoli
 *
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

	/** LOGGER **/
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	@Autowired
	FloorManagementServiceI floorService;

	@Autowired
	ApartmentManagementServiceI apartmentService;

	@Autowired
	PersonManagementServiceI personService;

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOG.info("TRAZA DE INICIO");

		LOG.info("Inicio generación e inserción de plantas");

		// Generación de plantas.
		final Floor floor1 = new Floor();
		floor1.setNumber(3);

		// Inserción de plantas.
		floorService.insertNewFloor(floor1);

		LOG.info("Fin generación e inserción de plantas");

		LOG.info("Inicio generación e inserción de apartamentos");

		// Generación de apartamentos.
		final Apartment apartment1 = new Apartment();
		apartment1.setLetterApartment('E');
		apartment1.setFloor(floor1);

		// Inserción de apartamentos.
		apartmentService.insertNewApartment(apartment1);

		LOG.info("Fin generación e inserción de apartamentos");

		LOG.info("Inicio generación e inserción de personas");

		// Generación de personas.
		final Person person1 = new Person();
		person1.setName("Paula");
		person1.setSurnames("Botello Roman");
		person1.setDni("48516941T");
		person1.setApartment(apartment1);

		// Inserción de personas.
		personService.insertNewPerson(person1);

		LOG.info("Fin generación e inserción de personas");

		LOG.info("Inicio de consultas de las personas");

		// Consulta de una persona por nombre y apellidos.
		System.out.println("Consulta de clientes por nombre y apellidos");

		final List<Person> result1 = personService.searchByNameAndSurnames("Pablo", "Camacho Delgado");
		for (final Person p : result1) {
			System.out.println(p.toString());
		}

		final List<Person> result2 = personService.searchByNameAndSurnames("Jose", "Mejias Roldan");
		for (final Person p : result2) {
			System.out.println(p.toString());
		}

		// Consulta todas las personas.
		System.out.println("\nConsulta de todos clientes");

		final List<Person> allPerson = personService.searchAll();
		for (final Person p : allPerson) {
			System.out.println(p.toString() + "\n");
		}

		LOG.info("Fin de consultas de las personas");

		LOG.info("TRAZA FIN");
	}
}
