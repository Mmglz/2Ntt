package com.nttdata.spring;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Product;
import com.nttdata.spring.services.GenericServiceI;
import com.nttdata.spring.services.OrderServiceI;

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

	/** Servicio general del pedido */
	@Autowired
	private GenericServiceI genericOrder;

	/** Servicio para pedidos a la Península. */
	@Autowired
	@Qualifier("peninsulaService")
	private OrderServiceI ordersPeninsula;

	/** Servicio para pedidos fuera de la Península. */
	@Autowired
	@Qualifier("peninsulaNoService")
	private OrderServiceI ordersNoPeninsula;

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

		LOG.info("Inicio generación de productos y pedidos.");
		
		// Creación de productos.
		Product pr1 = new Product(121L, "Ordernador", 800.26);
		Product pr2 = new Product(846L, "Iphone 20", 1999);
		Product pr3 = new Product(943L, "Auriculares", 15);
		Product pr4 = new Product(403L, "Teclado gamer", 88.54);
		Product pr5 = new Product(621L, "Ratón", 10.8);
		Product pr6 = new Product(743L, "PlayStation 8", 600.5);

		// Creación de listas de productos.
		List<Product> lista1 = new ArrayList<>();
		List<Product> lista2 = new ArrayList<>();
		List<Product> lista3 = new ArrayList<>();

		// Añadido de productos a las listas.
		lista1.add(pr1);
		lista1.add(pr2);

		lista2.add(pr3);
		lista2.add(pr4);
		lista2.add(pr5);

		lista3.add(pr1);
		lista3.add(pr2);
		lista3.add(pr3);
		lista3.add(pr4);
		lista3.add(pr5);
		lista3.add(pr6);

		// Creación de pedidos.
		Order pedido1 = genericOrder.createOrder(01L, "Helena", "Huelva", true);
		Order pedido2 = genericOrder.createOrder(02L, "Antonio", "Ceuta", false);
		Order pedido3 = genericOrder.createOrder(03L, "Laura", "Almeria", true);
		Order pedido4 = genericOrder.createOrder(04L, "Rubén", "Barcelona", true);

		// Añadido de las listas de productos a pedidos.
		genericOrder.addProductToAnOrder(pedido1, lista1);
		genericOrder.addProductToAnOrder(pedido2, lista1);
		genericOrder.addProductToAnOrder(pedido3, lista2);
		genericOrder.addProductToAnOrder(pedido4, lista3);
		
		LOG.info("Fin inserciones de productos y pedidos");

		LOG.info("Inicio del desglose de pedidos.");

		// Desgolse de los pedidos.
		System.out.println("--------------------Pedido 1---------------------");

		ordersPeninsula.breakdownOrder(pedido1);

		System.out.println("\n--------------------Pedido 2--------------------");

		ordersNoPeninsula.breakdownOrder(pedido2);

		System.out.println("\n--------------------Pedido 3---------------------");

		ordersPeninsula.breakdownOrder(pedido3);
		
		System.out.println("\n--------------------Pedido 4---------------------");
		
		ordersPeninsula.breakdownOrder(pedido4);
		
		LOG.info("Fin del desglose de pedidos.");
		
		LOG.info("TRAZA FIN");
	}
}
