
package com.ejemplo.springboot.service;

import com.ejemplo.springboot.model.Persona;
import java.util.List;

public interface IPersonaService {
    // no se implementan porque es solo una interfaz
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona pers);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id); 
}
