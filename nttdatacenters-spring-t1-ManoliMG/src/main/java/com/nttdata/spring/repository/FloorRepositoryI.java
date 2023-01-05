package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Planta
 * 
 * @author manoli
 *
 */
@Repository
public interface FloorRepositoryI extends JpaRepository<Floor, Long> {

}
