
package com.ejemplo.springboot.service;

import com.ejemplo.springboot.entity.AboutMe;
import java.util.List;

public interface IAboutMeService {
    // no se implementan porque es solo una interfaz
    public List<AboutMe> verPersonas();
    
    public void crearPersona(AboutMe pers);
    
    public void borrarPersona(Long id);
    
    public AboutMe buscarPersona(Long id); 
    
    public void cambiarPersona(AboutMe pers);
}
