package com.nttdata.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.nttdata.spring.repository.Customer;
import com.nttdata.spring.services.CustomerManagementServiceI;

/**
 * Clase controlador de Cliente.
 * 
 * @author manoli
 *
 */
@RestController
@RequestMapping("/home")
public class CustomerController {

	@Autowired
	CustomerManagementServiceI customerService;

	/**
	 * Muestra todos los clientes
	 * 
	 * @return List<Customer>
	 */
	@GetMapping
	public List<Customer> customersList() {
		return customerService.searchAll();
	}

	/**
	 * Añade un nuevo cliente
	 * 
	 * @param newCustomer
	 */
	@PostMapping("/insertNewCustomer")
	public void insertCustomer(@ModelAttribute("customer") Customer newCustomer) {
		customerService.insertNewCustomer(newCustomer);
	}

	/**
	 * Busca un cliente por nombre y apellidos
	 * 
	 * @param name
	 * @param firstSurname
	 * @param secondSurname
	 * @return Customer
	 */
	@PostMapping("/searchByNameAndSurnames")
	public @ResponseBody List<Customer> searchByNameAndSurnames(@RequestParam String name,
			@RequestParam String firstSurname, @RequestParam String secondSurname) {
		return customerService.searchByNameAndSurnames(name, firstSurname, secondSurname);
	}
}