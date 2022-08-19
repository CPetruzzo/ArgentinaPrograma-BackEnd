
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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins="https://porfolio-cf060.web.app")
public class EducationController {
    
    
    @Autowired
    private IEducationService persoServ;
    
    @PreAuthorize("hasRole('ADMIN')")
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
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String borrarEducacion(@PathVariable int id){
        persoServ.borrarEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @GetMapping("/educacion/{id}")
    public Education buscarEducacion(@PathVariable int id){
        return persoServ.buscarEducacion(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public Education modificarPersona(@PathVariable int id,
                                    @RequestParam String titulo,
    @RequestParam String lugar, @RequestParam String fecha_inicio, @RequestParam String fecha_fin){    
        
        Education education  = persoServ.buscarEducacion(id);

        education.setTitulo(titulo);
        education.setLugar(lugar);
        education.setFecha_inicio(fecha_inicio);
        education.setFecha_fin(fecha_fin);
        
        persoServ.modificarEducacion(education);
        return education;
    }
            
}
