//
//package com.ejemplo.springboot.controller;
//
//import com.ejemplo.springboot.Dto.ExperienciaDto;
//import com.ejemplo.springboot.entity.Experiencia;
//import com.ejemplo.springboot.service.ExperienciaService;
//import java.util.List;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("expLab")
//@CrossOrigin(origins="http://localhost:4200")
//public class ExperienciaController {
//    @Autowired
//    ExperienciaService servExp;
//    
//    public ResponseEntity<List<Experiencia>> list(){
//        List<Experiencia> list = servExp.list();
//        return new ResponseEntity(list,HttpStatus.OK);
//    }
//
//    
////    public ResponseEntity<?> create(@RequestBody ExperienciaDto dtoExp){
//  //      if(StringUtils.isBlank(dtoExp.getCargo()))
//    //        return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
//    //}
//    
//   // pu
//    
//    
//    
//}
