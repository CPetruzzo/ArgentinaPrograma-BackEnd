
package com.ejemplo.springboot.security.service;

import com.ejemplo.springboot.security.entity.Usuario;
import com.ejemplo.springboot.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return iUsuarioRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iUsuarioRepo.save(usuario);
    }
}
