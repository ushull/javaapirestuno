package com.ushull.proyectos.apirestuno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ushull.proyectos.apirestuno.entities.Personas;
import com.ushull.proyectos.apirestuno.services.PruebasService;

@RestController
public class ApisController {
    @Autowired
    PruebasService pruebasservicio;

    //Metodo para obtener los datos de personas
    @RequestMapping("/api/personas")
    public List<Personas> listadocompletopersonas(){
        return pruebasservicio.listadocompletopersonas();
    }
}
