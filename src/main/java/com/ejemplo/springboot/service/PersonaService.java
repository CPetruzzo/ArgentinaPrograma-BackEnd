
package com.ejemplo.springboot.service;

import com.ejemplo.springboot.model.Persona;
import com.ejemplo.springboot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    //hay que hacer una inyeccion de dependencias de el respositorio/conexion con jpa 
    @Autowired
    public PersonaRepository persRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }
    
    
}
