package com.ushull.proyectos.apirestuno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ushull.proyectos.apirestuno.entities.Personas;

public interface PruebasRepository extends JpaRepository<Personas, Integer> {
    
}
