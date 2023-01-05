package com.nttdata.spring.repository;

/**
 * Clase Producto
 * 
 * @author manoli
 *
 */
public class Product {
	
	/** ID de producto. **/
	protected Long idProduct;
	
	/** Nombre del producto. **/
	protected String name;
	
	/** Precio PVP del producto. **/
	protected double pvpPrice;
	
	/** Precio sin impuestos del producto. **/
	protected double taxFreePrice;
	
	/**
	 * Método constructor.
	 * 
	 * @param idProduct
	 * @param name
	 * @param taxFreePrice
	 */
	public Product(Long idProduct, String name, double taxFreePrice) {
		this.idProduct = idProduct;
		this.name = name;
		this.taxFreePrice = taxFreePrice;
	}

	/**
	 * @return the idProduct
	 */
	public Long getIdProduct() {
		return idProduct;
	}

	/**
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pvpPrice
	 */
	public double getPvpPrice() {
		return pvpPrice;
	}

	/**
	 * @param pvpPrice the pvpPrice to set
	 */
	public void setPvpPrice(double pvpPrice) {
		this.pvpPrice = pvpPrice;
	}

	/**
	 * @return the taxFreePrice
	 */
	public double getTaxFreePrice() {
		return taxFreePrice;
	}

	/**
	 * @param taxFreePrice the taxFreePrice to set
	 */
	public void setTaxFreePrice(double taxFreePrice) {
		this.taxFreePrice = taxFreePrice;
	}

	@Override
	public String toString() {
		return "\nProduct: idProduct=" + idProduct + "\nname=" + name + "\ntaxFreePrice=" + taxFreePrice + "€";
	}
}
