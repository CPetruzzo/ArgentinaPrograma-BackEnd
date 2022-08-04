
package com.ejemplo.springboot.Dto;

import javax.validation.constraints.NotBlank;


public class DtoExperiencia {
    
    @NotBlank
    private String cargo;
    
    @NotBlank
    private String lugar;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String f_inicio;
    
    private String f_fin;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String cargo, String lugar, String descripcion, String f_inicio, String f_fin) {
        this.cargo = cargo;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.f_inicio = f_inicio;
        this.f_fin = f_fin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
    }

    public String getF_fin() {
        return f_fin;
    }

    public void setF_fin(String f_fin) {
        this.f_fin = f_fin;
    }

    
}
