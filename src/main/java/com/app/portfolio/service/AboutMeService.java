
package com.app.portfolio.service;

import com.app.portfolio.entity.AboutMe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.portfolio.repository.AboutMeRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class AboutMeService implements IAboutMeService{

    //hay que hacer una inyeccion de dependencias de el respositorio/conexion con jpa 
    @Autowired
    public AboutMeRepository aboutmeRepo;
    
    @Override
    public List<AboutMe> verPersonas() {
        return aboutmeRepo.findAll();
    }

    @Override
    public void crearPersona(AboutMe pers) {
        aboutmeRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        aboutmeRepo.deleteById(id);
    }

    @Override
    public AboutMe buscarPersona(Long id) {
        return aboutmeRepo.findById(id).orElse(null);
    }
    
    @Override 
    public void cambiarPersona(AboutMe pers) {
        aboutmeRepo.save(pers);
    }
    
    @Override
    public boolean existsById(Long id){
        return aboutmeRepo.existsById(id);
    }
    
}
