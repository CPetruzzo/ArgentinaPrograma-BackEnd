
package com.ejemplo.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Skills {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String img;
    private String skill;
    private String descripcion;

    public Skills() {
    }

    public Skills(String img, String skill, String descripcion) {
        this.img = img;
        this.skill = skill;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
