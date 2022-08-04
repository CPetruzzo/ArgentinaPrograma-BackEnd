
package com.ejemplo.springboot.service;

import com.ejemplo.springboot.entity.AboutMe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejemplo.springboot.repository.AboutMeRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class AboutMeService implements IAboutMeService{

    //hay que hacer una inyeccion de dependencias de el respositorio/conexion con jpa 
    @Autowired
    public AboutMeRepository persRepo;
    
    @Override
    public List<AboutMe> verPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(AboutMe pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public AboutMe buscarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }
    
    @Override 
    public void cambiarPersona(AboutMe pers) {
        persRepo.save(pers);
    }
    
}
