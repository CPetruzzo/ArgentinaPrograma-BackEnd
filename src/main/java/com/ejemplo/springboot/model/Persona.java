
package com.ejemplo.springboot.model;

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

public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    
    public Persona(){
    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
     
    
    
}
