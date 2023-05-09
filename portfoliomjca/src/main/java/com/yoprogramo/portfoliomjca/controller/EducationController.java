package com.yoprogramo.portfoliomjca.controller;

import com.yoprogramo.portfoliomjca.model.Education;
import com.yoprogramo.portfoliomjca.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    IEducationService eduServ;
    
    @GetMapping ("/show/education")
    @ResponseBody
    public List<Education> showEducation () {
        return eduServ.showEducation();
    }  
        
    @PostMapping ("/new/education")
    public void addEducation (@RequestBody Education edu) {
       eduServ.newEducation(edu);
    }
        
    @DeleteMapping ("/delete/{id}")
    public void deleteEducation(@PathVariable Long id) {
        eduServ.deleteEducation(id);
    }
    
    
}
