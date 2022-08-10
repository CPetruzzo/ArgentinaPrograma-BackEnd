//
package com.ejemplo.springboot.repository;

import com.ejemplo.springboot.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {
    
}
