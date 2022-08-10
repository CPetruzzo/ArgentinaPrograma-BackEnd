//
package com.app.portfolio.service;

import com.app.portfolio.entity.Info;
import com.app.portfolio.repository.InfoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService implements IInfoService {

    @Autowired InfoRepository infoRepo;
    
    @Override
    public List<Info> getInfo() {
        List<Info> informacion = infoRepo.findAll();
        return informacion;
    }

    @Override
    public void saveInfo(Info informacion) {
        infoRepo.save(informacion); 
    }

    @Override
    public void deleteInfo(Long id) {
        infoRepo.deleteById(id);
    }

    @Override
    public Info findInfo(Long id) {
        Info informacion = infoRepo.findById(id).orElse(null);
        return informacion;
    }
    
}
