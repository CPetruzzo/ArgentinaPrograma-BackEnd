
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {
    
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody // devolvelo en el cuerpo de la respuesta
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
  
    
    /*//creacion de la lista
    List<Persona> listaPersonas = new ArrayList();
    
    
    @GetMapping("/hola/{nombre}/{apellido}/{edad}") // cuando alguien entre a la app/hola se va a disparar
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad){
        return "Hola Mundo "+ nombre + " apellido: " + apellido + " edad: " + edad ;
    }
    // si no se les dice nada lo que asumen todos los navegadores es que hay que usar Get
    // para hacer post hay que hacer cosas ----> postman
    
    @GetMapping("/chau")
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido,
                             @RequestParam int edad){
        return "Chau Mundo " + nombre + edad + apellido;
    }
    
    // con request param es mas facil para no tener que poner /asas/asadas/dfgdf
    
    //el post lo vamos a usar para dar altas, o agregar elementos dentro de una lista
    */
}
