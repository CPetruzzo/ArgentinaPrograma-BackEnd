
package com.app.portfolio.service;

import com.app.portfolio.entity.Education;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.portfolio.repository.EducationRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class EducationService implements IEducationService{

    //hay que hacer una inyeccion de dependencias de el respositorio/conexion con jpa 
    @Autowired
    public EducationRepository persRepo;
    
    @Override
    public List<Education> verEducacion() {
        return persRepo.findAll();
    }

    @Override
    public void crearEducacion(Education pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarEducacion(int id) {
        persRepo.deleteById(id);
    }

    @Override
    public Education buscarEducacion(int id) {
        return persRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarEducacion(Education pers){
        persRepo.save(pers);
    }
    
}
