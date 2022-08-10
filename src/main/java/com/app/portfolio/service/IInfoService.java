
package com.app.portfolio.service;

import com.app.portfolio.entity.Info;
import java.util.List;

public interface IInfoService {

    // Para traer una lista de tipo Info
    public List<Info> getInfo();
    
    // Para guardar una nueva Info
    public void saveInfo (Info informacion);
    
    // Para borrar una informacion
    public void deleteInfo (Long id);
    
    // Para encontrar una Info
    public Info findInfo(Long id); 
    
}
