
package com.ejemplo.springboot.service;

import com.ejemplo.springboot.entity.Skills;
import com.ejemplo.springboot.repository.SkillsRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService implements ISkillsService{

    //hay que hacer una inyeccion de dependencias de el respositorio/conexion con jpa 
    @Autowired
    public SkillsRepository skillRepo;
    
    @Override
    public List<Skills> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(int id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkill(int id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarSkill(Skills skill){
        skillRepo.save(skill);
    }
    
}
