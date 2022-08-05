
package com.ejemplo.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class AboutMe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;
    
    public AboutMe(){
    }

    public AboutMe(String descripcion) {
        this.descripcion = descripcion;
    }
     
    
    
}
