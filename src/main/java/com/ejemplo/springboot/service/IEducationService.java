
package com.ejemplo.springboot.service;

import com.ejemplo.springboot.entity.Education;
import java.util.List;

public interface IEducationService {
    // no se implementan porque es solo una interfaz
    public List<Education> verEducacion();
    
    public void crearEducacion(Education pers);
    
    public void borrarEducacion(int id);
    
    public Education buscarEducacion(int id); 
    
    
}
