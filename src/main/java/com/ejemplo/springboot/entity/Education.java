
package com.ejemplo.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
// con lombok no necesito poner todos los getter y setters de todas las cosas
// nos ahorra una baaaanda de codigo y tiempo

@Getter @Setter
@Entity

public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String lugar;
    private int fecha_inicio;
    private int fecha_fin;
    
    public Education(){
    }

    public Education(String titulo, String lugar, int fecha_inicio, int fecha_fin) {
        this.titulo = titulo;
        this.lugar = lugar;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    
     
    
    
}
