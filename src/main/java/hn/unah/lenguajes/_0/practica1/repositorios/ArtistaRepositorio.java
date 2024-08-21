package hn.unah.lenguajes._0.practica1.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes._0.practica1.models.Artista;

public interface ArtistaRepositorio extends JpaRepository<Artista, Long> {
    
    public List<Artista> nombre(String nombre);

}
