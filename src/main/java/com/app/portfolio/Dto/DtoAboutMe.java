
package com.ejemplo.springboot.Dto;

import javax.validation.constraints.NotBlank;


public class DtoAboutMe {

@NotBlank
private String descripcion;

    public DtoAboutMe() {
    }

    public DtoAboutMe(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
}
