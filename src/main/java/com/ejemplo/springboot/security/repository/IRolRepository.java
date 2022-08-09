
package com.ejemplo.springboot.security.repository;

import com.ejemplo.springboot.security.entity.Rol;
import com.ejemplo.springboot.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
