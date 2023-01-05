package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Product;

/**
 * Implementación para Ceuta, Melilla y Canarias de la interfaz Servicio de pedido
 * 
 * @author manoli
 *
 */
@Service("peninsulaNoService")
public class OrderServiceNoPeninsulaImpl extends GenericServiceImpl implements OrderServiceI {

	@Override
	public void breakdownOrder(Order order) {
		
		String breakdown = order.toString();		
		
		double totalPrice = calculateTotalPrice(order);
		
		// Imprime el pedido con su lista de productos y el precio total del pedido.
		System.out.printf("%s%nEl importe total del pedido es de %.2f€%n", breakdown, totalPrice);
	}

	@Override
	public double calculateTotalPrice(Order order) {
		
		double pricePVP;
		double totalPrice = 0.0;

		// Aplica el IPSI(4%) a cada producto de la lista y los suma, retornando el precio total del pedido.
		for (Product product : order.getListProduct()) {
			pricePVP = product.getTaxFreePrice() * 1.04;
			product.setPvpPrice(pricePVP);
			totalPrice += pricePVP;
		}
		return totalPrice;
	}
}
