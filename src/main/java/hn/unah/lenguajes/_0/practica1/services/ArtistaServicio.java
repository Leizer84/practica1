package hn.unah.lenguajes._0.practica1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes._0.practica1.models.Artista;
import hn.unah.lenguajes._0.practica1.repositorios.ArtistaRepositorio;

@Service
public class ArtistaServicio {

    @Autowired
    private ArtistaRepositorio artistaRepositorio;
    
    
    public List<Artista> obtenerTodos(){
        return this.artistaRepositorio.findAll();
    }
}
