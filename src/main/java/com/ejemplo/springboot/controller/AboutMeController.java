
package com.ejemplo.springboot.controller;

// esto va a ser el pivot
import com.ejemplo.springboot.entity.AboutMe;
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
import com.ejemplo.springboot.service.IAboutMeService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/acercade/")
@CrossOrigin(origins="https://porfolio-cf060.web.app")
public class AboutMeController {
    
    
    @Autowired
    private IAboutMeService aboutmeServ;
        
    @GetMapping("ver/personas")
    @ResponseBody // devolvelo en el cuerpo de la respuesta
    public List<AboutMe> verPersonas(){
        return aboutmeServ.verPersonas();
    }
    
    @GetMapping("perfil/{id}")
    public AboutMe buscarPersona(@PathVariable Long id){
        return aboutmeServ.buscarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("new/persona")
    public String agregarPersona(@RequestBody AboutMe pers){
        aboutmeServ.crearPersona(pers);
        return "La persona fue creada correctamente!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("delete/{id}")
    public String borrarPersona(@PathVariable Long id){
        aboutmeServ.borrarPersona(id);
        return "La persona "+ id +" fue eliminada correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("modificar/{id}")
    public AboutMe modificarPersona(@PathVariable Long id,
                                    @RequestParam ("descripcion") String nuevaDescripcion){    
        
        AboutMe pers  = aboutmeServ.buscarPersona(id);

        pers.setDescripcion(nuevaDescripcion);
        
        aboutmeServ.cambiarPersona(pers);
        return pers;
    }
    
}
