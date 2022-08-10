
package com.app.portfolio.service;

import com.app.portfolio.entity.Experiencia;
import com.app.portfolio.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    @Autowired
    ExperienciaRepository expRepo;
    
    public List<Experiencia> list(){
        return expRepo.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return expRepo.findById(id);
    }
    
    public Optional<Experiencia> getByCargo(String cargo){
        return expRepo.findByCargo(cargo);
    }
    
    public void save(Experiencia exp){
        expRepo.save(exp);
    }
    
    public void delete(int id){
        expRepo.deleteById(id);
    }
    
    public boolean existsById(int id){
        return expRepo.existsById(id);
    }
    
    public boolean existsByCargo(String cargo){
        return expRepo.existsByCargo(cargo);
    }
    
    
}
