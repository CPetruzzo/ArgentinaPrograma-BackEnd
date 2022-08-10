
package com.app.portfolio.service;

import com.app.portfolio.entity.AboutMe;
import java.util.List;

public interface IAboutMeService {
    
    public List<AboutMe> verPersonas();
    
    public void crearPersona(AboutMe pers);
    
    public void borrarPersona(Long id);
    
    public AboutMe buscarPersona(Long id); 
    
    public void cambiarPersona(AboutMe pers);
    
    public boolean existsById(Long id);
}
