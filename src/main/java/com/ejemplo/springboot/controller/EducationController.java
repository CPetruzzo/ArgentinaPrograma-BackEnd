
package com.ejemplo.springboot.controller;

// esto va a ser el pivot
import com.ejemplo.springboot.model.Persona;
import com.ejemplo.springboot.service.IPersonaService;
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

@RestController
@RequestMapping("/acercade")
@CrossOrigin(origins="http://localhost:4200")
public class Controller {
    
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente!";
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody // devolvelo en el cuerpo de la respuesta
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public String borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @GetMapping("/perfil/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
}
