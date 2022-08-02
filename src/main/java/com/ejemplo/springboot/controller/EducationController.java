
package com.ejemplo.springboot.controller;

// esto va a ser el pivot
import com.ejemplo.springboot.entity.Education;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ejemplo.springboot.service.IEducationService;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins="http://localhost:4200")
public class EducationController {
    
    
    @Autowired
    private IEducationService persoServ;
    
    @PostMapping("/new/educacion")
    public String agregarEducacion(@RequestBody Education pers){
        persoServ.crearEducacion(pers);
        return "La educacion fue creada correctamente!";
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody // devolvelo en el cuerpo de la respuesta
    public List<Education> verEducacion(){
        return persoServ.verEducacion();
    }
    
    @DeleteMapping("/delete/{id}")
    public String borrarEducacion(@PathVariable int id){
        persoServ.borrarEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @GetMapping("/educacion/{id}")
    public Education buscarEducacion(@PathVariable int id){
        return persoServ.buscarEducacion(id);
    }
    
}
