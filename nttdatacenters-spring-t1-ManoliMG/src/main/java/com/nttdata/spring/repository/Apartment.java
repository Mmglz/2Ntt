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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Clase Apartamento
 * 
 * @author manoli
 *
 */
@Entity
@Table(name = "APARTMENT")
public class Apartment extends AbstractEntity implements Serializable {

	/** Serial Version. */
	private static final long serialVersionUID = 1L;

	/** ID del apartamento. */
	private Long idApartment;

	/** Letra del apartamento. */
	private Character letterApartment;

	/** Lista de personas asociadas. */
	private List<Person> personList;

	/** Planta asociada (FK) */
	private Floor floor;

	/**
	 * @return the idApartment
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "APARTMENT_ID")
	public Long getIdApartment() {
		return idApartment;
	}

	/**
	 * @param idApartment the idApartment to set
	 */
	public void setIdApartment(Long idApartment) {
		this.idApartment = idApartment;
	}

	/**
	 * @return the letterApartment
	 */
	@Column(name = "LETTER")
	public Character getLetterApartment() {
		return letterApartment;
	}

	/**
	 * @param letterApartment the letterApartment to set
	 */
	public void setLetterApartment(Character letterApartment) {
		this.letterApartment = letterApartment;
	}

	/**
	 * @return the person
	 */
	@OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Person> getPersonList() {
		return personList;
	}

	/**
	 * @param person the person to set
	 */
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	/**
	 * @return the floor
	 */
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "ID_FLOOR")
	public Floor getFloor() {
		return this.floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "Apartment [idApartment=" + idApartment + ", letterApartment=" + letterApartment + ", personList="
				+ personList + ", floor=" + floor + "]";
	}

	@Override
	@Transient
	public Long getId() {
		return this.idApartment;
	}
}
