
package com.app.portfolio.service;

import com.app.portfolio.entity.Education;
import java.util.List;

public interface IEducationService {
    // no se implementan porque es solo una interfaz
    public List<Education> verEducacion();
    
    public void crearEducacion(Education pers);
    
    public void borrarEducacion(int id);
    
    public Education buscarEducacion(int id); 
    
    public void modificarEducacion(Education pers);
    
    
}
