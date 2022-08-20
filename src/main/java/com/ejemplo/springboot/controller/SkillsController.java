
package com.ejemplo.springboot.controller;

import com.ejemplo.springboot.entity.Skills;
import com.ejemplo.springboot.service.ISkillsService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins="https://porfolio-cf060.web.app")
public class SkillsController {
    
    @Autowired
    private ISkillsService skillServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearSkill(@RequestBody Skills skill){
        skillServ.crearSkill(skill);
    }
    
    @GetMapping("/ver")
    @ResponseBody // devolvelo en el cuerpo de la respuesta
    public List<Skills> verSkills(){
        return skillServ.verSkills();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarSkill(@PathVariable int id){
        skillServ.borrarSkill(id);
    }
    
    @GetMapping("/ver/{id}")
    public Skills buscarSkill(@PathVariable int id){
        return skillServ.buscarSkill(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public Skills modificarSkill(@PathVariable int id,
                                    @RequestParam String img,
                                    @RequestParam String skill, 
                                    @RequestParam String descripcion,
                                    @RequestParam int percent){    
        
        Skills skills  = skillServ.buscarSkill(id);

        skills.setImg(img);
        skills.setSkill(skill);
        skills.setDescripcion(descripcion);
        skills.setPercent(percent);
        
        skillServ.modificarSkill(skills);
        return skills;
    }
            
    
}
