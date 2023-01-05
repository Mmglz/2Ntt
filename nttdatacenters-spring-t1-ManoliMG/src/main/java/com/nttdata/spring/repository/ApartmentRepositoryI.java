package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Apartamento
 * 
 * @author manoli
 *
 */
@Repository
public interface ApartmentRepositoryI extends JpaRepository<Apartment, Long> {

}
