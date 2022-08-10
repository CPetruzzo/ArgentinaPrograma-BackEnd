
package com.app.portfolio.service;

import com.app.portfolio.entity.Persona;
import java.util.List;

public interface IPersonaService {
    // no se implementan porque es solo una interfaz
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona pers);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id); 
}
