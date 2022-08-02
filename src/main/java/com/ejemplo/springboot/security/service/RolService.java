
package com.ejemplo.springboot.security.service;

import com.ejemplo.springboot.security.entity.Rol;
import com.ejemplo.springboot.security.enums.RolNombre;
import com.ejemplo.springboot.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepo.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        iRolRepo.save(rol);
    }
    
}
