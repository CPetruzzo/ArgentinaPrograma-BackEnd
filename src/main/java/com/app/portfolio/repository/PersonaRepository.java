
package com.app.portfolio.repository;

import com.app.portfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // con esto digo que esto es mi repositorio
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
