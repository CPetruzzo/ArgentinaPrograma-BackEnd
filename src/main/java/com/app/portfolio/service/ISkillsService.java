
package com.app.portfolio.service;

import com.app.portfolio.entity.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List<Skills> verSkills();

    public void crearSkill(Skills skill);

    public void borrarSkill(int id);
    
    public Skills buscarSkill(int id);
    
    public void modificarSkill(Skills skill);
    
}
