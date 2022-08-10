
package com.app.portfolio.repository;

import com.app.portfolio.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia>findByCargo(String cargo);
    public boolean existsByCargo(String cargo);
}
