
package com.ejemplo.springboot.repository;

import com.ejemplo.springboot.entity.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // con esto digo que esto es mi repositorio
public interface AboutMeRepository extends JpaRepository <AboutMe, Long>{
    
}
