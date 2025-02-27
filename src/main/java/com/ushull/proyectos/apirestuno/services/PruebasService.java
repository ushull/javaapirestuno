package com.ushull.proyectos.apirestuno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ushull.proyectos.apirestuno.entities.Personas;
import com.ushull.proyectos.apirestuno.repositories.PruebasRepository;

@Service
public class PruebasService {
    @Autowired
    PruebasRepository pruebasrep;

    public List<Personas> listadocompletopersonas(){
        return pruebasrep.findAll();
    }
}
