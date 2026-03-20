package com.dania.pm;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro, Integer> {
	
	List<Registro> findByNombre(String nombre);
}