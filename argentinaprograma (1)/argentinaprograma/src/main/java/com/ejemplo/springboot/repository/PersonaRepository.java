
package com.ejemplo.springboot.repository;

import com.ejemplo.springboot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // con esto digo que esto es mi repositorio
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
