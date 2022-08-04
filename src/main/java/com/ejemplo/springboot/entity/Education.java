
package com.ejemplo.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// con lombok no necesito poner todos los getter y setters de todas las cosas
// nos ahorra una baaaanda de codigo y tiempo

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(int fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(int fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    
    
     
    
    
}
