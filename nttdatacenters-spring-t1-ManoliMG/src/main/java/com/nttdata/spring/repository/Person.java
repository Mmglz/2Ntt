package com.nttdata.spring.repository;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Clase Persona
 * 
 * @author manoli
 *
 */
@Entity
@Table(name = "PERSON")
public class Person extends AbstractEntity implements Serializable {

	/** Serial version. */
	private static final long serialVersionUID = 1L;

	/** ID de persona. */
	private Long idPerson;

	/** Nombre de la persona. */
	private String name;

	/** Apellidos de la persona. */
	private String surnames;

	/** DNI de la persona. */
	private String dni;

	/** Apartamento asociado (FK). */
	private Apartment apartment;

	/**
	 * @return the idPerson
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSON_ID")
	public Long getIdPerson() {
		return idPerson;
	}

	/**
	 * @param idPerson the idPerson to set
	 */
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NAME")
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
	 * @return the surnames
	 */
	@Column(name = "SURNAMES")
	public String getSurnames() {
		return surnames;
	}

	/**
	 * @param surnames the surnames to set
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	/**
	 * @return the dni
	 */
	@Column(name = "DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the apartmentId
	 */
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "ID_APARTMENT")
	public Apartment getApartment() {
		return this.apartment;
	}

	/**
	 * @param apartmentId the apartmentId to set
	 */
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	@Override
	public String toString() {
		return "Person: idPerson=" + idPerson + ", name=" + name + ", surnames=" + surnames + ", dni=" + dni
				+ ", apartment=" + getApartment().getLetterApartment();
	}

	@Override
	@Transient
	public Long getId() {
		return this.idPerson;
	}
}
