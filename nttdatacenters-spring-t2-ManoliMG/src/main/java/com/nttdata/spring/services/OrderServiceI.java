package com.nttdata.spring.services;

import com.nttdata.spring.repository.Order;

/**
 * Interfaz del servicio de pedido
 * 
 * @author manoli
 *
 */
public interface OrderServiceI {
	
	/**
	 * Método que desglosa el pedido.
	 * 
	 * @param order
	 */
	public void breakdownOrder(Order order);
	
	/**
	 * Método que calcula el precio total del pedido.
	 * 
	 * @param order
	 */
	public double calculateTotalPrice(Order order);

}
