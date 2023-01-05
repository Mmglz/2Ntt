package com.nttdata.spring.repository;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Clase Planta
 * 
 * @author manoli
 *
 */
@Entity
@Table(name = "FLOOR")
public class Floor extends AbstractEntity implements Serializable {

	/** Serial Version. */
	private static final long serialVersionUID = 1L;

	/** ID de la planta. */
	private Long idFloor;

	/** Número de la planta. */
	private int number;

	/** Lista de apartamentos relacionados. */
	private List<Apartment> apartmentsList;

	/**
	 * @return the idFloor
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FLOOR_ID")
	public Long getIdFloor() {
		return idFloor;
	}

	/**
	 * @param idFloor the idFloor to set
	 */
	public void setIdFloor(Long idFloor) {
		this.idFloor = idFloor;
	}

	/**
	 * @return the number
	 */
	@Column(name = "NUMBER")
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the apartments
	 */
	@OneToMany(mappedBy = "floor", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	public List<Apartment> getApartmentsList() {
		return apartmentsList;
	}

	/**
	 * @param apartments the apartments to set
	 */
	public void setApartmentsList(List<Apartment> apartmentsList) {
		this.apartmentsList = apartmentsList;
	}

	@Override
	public String toString() {
		return "Floor [idFloor=" + idFloor + ", number=" + number + ", apartments=" + apartmentsList + "]";
	}

	@Override
	@Transient
	public Long getId() {
		return this.idFloor;
	}
}
