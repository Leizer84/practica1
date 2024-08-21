package hn.unah.lenguajes._0.practica1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes._0.practica1.models.Artista;
import hn.unah.lenguajes._0.practica1.services.ArtistaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {
    
    @Autowired
    private ArtistaServicio artistaServicio;

    @GetMapping("/obtener/todos")
    public List<Artista> obtenerTodos(){
        return this.artistaServicio.obtenerTodos();
    }

}
