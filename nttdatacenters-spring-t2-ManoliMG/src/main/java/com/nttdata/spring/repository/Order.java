package com.nttdata.spring.repository;

import java.util.List;

/**
 * Clase Pedido
 * 
 * @author manoli
 *
 */
public class Order {

	/** ID de pedido. **/
	protected Long idOrder;

	/** Destinatario del pedido. **/
	protected String addressee;

	/** Dirección de entrega del pedido. **/
	protected String deliveryAddress;

	/** ID de pedido. **/
	protected boolean peninsula;

	/** Lista de productos. **/
	protected List<Product> listProduct;

	/**
	 * Método constructor.
	 * 
	 * @param addressee
	 * @param deliveryAddress
	 * @param peninsula
	 */
	public Order(Long idOrder, String addressee, String deliveryAddress, boolean noPeninsula) {
		this.idOrder = idOrder;
		this.addressee = addressee;
		this.deliveryAddress = deliveryAddress;
		this.peninsula = noPeninsula;
	}

	/**
	 * @return the idOrder
	 */
	public Long getIdOrder() {
		return idOrder;
	}

	/**
	 * @param idOrder the idOrder to set
	 */
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	/**
	 * @return the addressee
	 */
	public String getAddressee() {
		return addressee;
	}

	/**
	 * @param addressee the addressee to set
	 */
	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @return the peninsula
	 */
	public boolean isPeninsula() {
		return peninsula;
	}

	/**
	 * @param peninsula the peninsula to set
	 */
	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	/**
	 * @return the listProduct
	 */
	public List<Product> getListProduct() {
		return listProduct;
	}

	/**
	 * @param listProduct the listProduct to set
	 */
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	@Override
	public String toString() {
		return "Order: idOrder=" + idOrder + "\naddressee=" + addressee + "\ndeliveryAddress=" + deliveryAddress
				+ "\npeninsula=" + peninsula + "\nlistProduct:" + listProduct;
	}
}
