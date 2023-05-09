package com.yoprogramo.portfoliomjca.controller;

import com.yoprogramo.portfoliomjca.model.Experience;
import com.yoprogramo.portfoliomjca.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {
    @Autowired
    IExperienceService expServ;
    
    @GetMapping ("/show/experience")
    @ResponseBody
    public List<Experience> showExperience () {
        return expServ.showExperience();
    }
    
    @PostMapping ("/new/experience")
    public void addExperience (@RequestBody Experience per) {
       expServ.newExperience(per);
    }
        
    @DeleteMapping ("/delete/{id}")
    public void deleteExperience(@PathVariable Long id) {
        expServ.deleteExperience(id);
    }
    
}
