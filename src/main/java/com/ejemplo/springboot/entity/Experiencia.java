package com.ejemplo.springboot.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String cargo;
    private String descripcion;
    private int f_inicio;
    private int f_fin;

    public Experiencia() {
    }

    public Experiencia(String cargo, String descripcion, int f_inicio, int f_fin) {
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.f_inicio = f_inicio;
        this.f_fin = f_fin;
    }
    
    
}
