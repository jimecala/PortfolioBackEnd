package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Experience;
import com.yoprogramo.be_mjca.service.IExperienceService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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
@Transactional
@RequestMapping(path = "/api/experience")
@CrossOrigin(origins = "https://portfoliomjca-frontend.web.app")
public class ExperienceController {
    
    @Autowired
    IExperienceService expServ;
    
    @GetMapping
    @ResponseBody
    public List<Experience> getExp () {
        return expServ.getExp();
    }
    
    @GetMapping("/{id}")
    public Experience searchExp(@PathVariable Long id){
        return expServ.searchExp(id);
    }
    
    @PostMapping ("/new")
    public void newExp (@RequestBody Experience exp) {
       expServ.saveExp(exp);       
    }
    
    @PutMapping ("/edit/{id}")
    public Experience editExp(@PathVariable Long id,
                   @RequestParam ("position") String newPosition,
                   @RequestParam ("employer") String newEmployer){
        Experience exp = expServ.searchExp(id);
        
        exp.setPosition(newPosition);
        exp.setEmployer(newEmployer);
        
        expServ.saveExp(exp);
        
        return exp;
    }                 
      
    @DeleteMapping ("/delete/{id}")
    public void deleteExp (@PathVariable Long id){
        expServ.deleteExp(id);
    }
    
}
