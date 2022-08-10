
package com.app.portfolio.repository;

import com.app.portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // con esto digo que esto es mi repositorio
public interface EducationRepository extends JpaRepository <Education, Integer>{
    
}
