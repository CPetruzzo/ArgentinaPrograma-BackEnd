
package com.app.portfolio.controller;

import com.app.portfolio.Dto.DtoExperiencia;
import com.app.portfolio.entity.Experiencia;
import com.app.portfolio.security.controller.Mensaje;
import com.app.portfolio.service.ExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins="http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService servExp;
    
    @GetMapping("/list")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = servExp.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoExperiencia dtoExp){
        if (StringUtils.isBlank(dtoExp.getCargo()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(servExp.existsByCargo(dtoExp.getCargo()))
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);

        Experiencia experiencia =  new Experiencia (
                dtoExp.getCargo(), 
                dtoExp.getLugar(),
                dtoExp.getDescripcion(), 
                dtoExp.getFecha_fin(), 
                dtoExp.getFecha_inicio()); 
        servExp.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/edit/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody DtoExperiencia dtoExp){
        
        //VALIDACIONES
        
        if (!servExp.existsById(id))
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        
        if (servExp.existsByCargo(dtoExp.getCargo()) && servExp.getByCargo(dtoExp.getCargo()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        
        if (StringUtils.isBlank(dtoExp.getCargo()))
            return new ResponseEntity(new Mensaje("El cargo es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = servExp.getOne(id).get();
        experiencia.setCargo(dtoExp.getCargo());
        experiencia.setLugar(dtoExp.getLugar());
        experiencia.setDescripcion(dtoExp.getDescripcion());
        experiencia.setFecha_inicio(dtoExp.getFecha_inicio());
        experiencia.setFecha_fin(dtoExp.getFecha_fin());
        
        servExp.save(experiencia);
        return new ResponseEntity(new Mensaje("La experiencia fue actualizada con éxito"), HttpStatus.OK);
        
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") int id){
        
        //VALIDACIONES
        
        if (!servExp.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        servExp.delete(id);
        
        return new ResponseEntity(new Mensaje("El valor fue eliminado"), HttpStatus.OK);
        
    }
            
       
}
