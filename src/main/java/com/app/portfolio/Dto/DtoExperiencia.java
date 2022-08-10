
package com.app.portfolio.Dto;

import javax.validation.constraints.NotBlank;


public class DtoExperiencia {
    
    @NotBlank
    private String cargo;
    
    @NotBlank
    private String lugar;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String fecha_inicio;
    
    private String fecha_fin;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String cargo, String lugar, String descripcion, String fecha_inicio, String fecha_fin) {
        this.cargo = cargo;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
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

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }


    
}
