
package com.app.portfolio.service;

import com.app.portfolio.entity.Experiencia;
import java.util.List;
import java.util.Optional;

public interface IExperienciaService {
    
    public List<Experiencia> list();
    
    public Optional<Experiencia> getOne(int id);
    
    public Optional<Experiencia> getByCargo(String cargo);
    
    public void save(Experiencia exp);
    
    public void delete(int id);
    
    public boolean existsById(int id);
    
    public boolean existsByCargo(String cargo);
    
    
}
