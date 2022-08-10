
package com.ejemplo.springboot.repository;

import com.ejemplo.springboot.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {
    
}
