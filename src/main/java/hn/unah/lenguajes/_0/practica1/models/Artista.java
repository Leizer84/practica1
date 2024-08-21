package hn.unah.lenguajes._0.practica1.models;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Artista {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "codigoArtista")
        private long codigoArtista;

        @Column(name = "nombreArtistico")
        private String nombreArtistico;

        private String Nombre;

        private String Apellido;
        
        @Column(name = "fechaNacimiento")
        private Date fechaNacimiento;

        private long codigoContacto;
}
