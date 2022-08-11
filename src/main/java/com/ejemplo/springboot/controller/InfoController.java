
package com.ejemplo.springboot.controller;

import com.ejemplo.springboot.entity.Info;
import com.ejemplo.springboot.service.InfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/info/")
@CrossOrigin(origins="https://porfolio-cf060.web.app")

public class InfoController {
    @Autowired 
    private InfoService infoServ;
    
    @GetMapping("getInfo/")
    public List<Info> getInfo(){
        return infoServ.getInfo();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("createInfo/")
    public String createInfo(@RequestBody Info informacion){
        infoServ.saveInfo(informacion);
        return "La persona fue creada correctamente";
    }
    
    @GetMapping("getInfo/{id}")
    public Info buscarInfo(@PathVariable Long id){
        return infoServ.findInfo(id);
    }

    @PreAuthorize("hasRole('ADMIN')")   
    @DeleteMapping("borrar/{id}/")
    public String borrarInfo(@PathVariable Long id){
        infoServ.deleteInfo(id);
        return "La persona fue eliminada correctamente";
    }
    
    // URL: PUERTO/editar/4/nombre&apellido&img
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("editar/{id}")
    public Info editarInfo(@PathVariable Long id, 
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("apellido") String nuevoApellido,
                            @RequestParam("img") String nuevaImg){
        Info informacion  = infoServ.findInfo(id);

        informacion.setNombre(nuevoNombre);
        informacion.setApellido(nuevoApellido);
        informacion.setImg(nuevaImg);
        
        infoServ.saveInfo(informacion);
        return informacion;
    }
}
