package com.nttdata.spring.services;

import java.util.List;
import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Product;

/**
 * Implementación de la interfaz Servicio genérico
 * 
 * @author manoli
 *
 */
public class GenericServiceImpl implements GenericServiceI{
	
	@Override
	public Order createOrder(Long idOrder,String addressee, String deliveryAddress, boolean peninsula) {

		// Crea un nuevo pedido.
		return new Order(idOrder,addressee, deliveryAddress, peninsula);
	}

	@Override
	public void addProductToAnOrder(Order order, List<Product> products) {

		// Añade un producto a una lista de productos.
		order.setListProduct(products);
	}

}
