package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Product;

/**
 * Interfaz de servicio genérico
 * 
 * @author manoli
 *
 */
public interface GenericServiceI {
	
	/**
	 * Método que crea un pedido.
	 * 
	 * @param orderId
	 * @param addressee
	 * @param deliveryAddress
	 * @param noPeninsula
	 */
	public Order createOrder(Long idOrder, String addressee, String deliveryAddress, boolean peninsula);
	
	/**
	 * Método que añade un producto a un pedido.
	 * 
	 * @param order
	 * @param product
	 */
	public void addProductToAnOrder(Order order, List<Product> products);
}
