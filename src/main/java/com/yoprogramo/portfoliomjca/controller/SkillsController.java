package com.yoprogramo.portfoliomjca.controller;

import com.yoprogramo.portfoliomjca.model.Skills;
import com.yoprogramo.portfoliomjca.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/skills")
@CrossOrigin(origins = "https://portfoliomjca.onrender.com")
public class SkillsController {
    
    @Autowired
    ISkillsService sklServ;
    
    @PostMapping ("/new")
    public void addSkill (@RequestBody Skills skl){
        sklServ.newSkill(skl);
}
    
    @PutMapping ("/edit")
    public void edit(@RequestBody Skills skl){
        sklServ.editSkill(skl);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void deleteSkill (@PathVariable Long id){
        sklServ.deleteSkill(id);
    }
    
    @GetMapping //("/show")
    @ResponseBody
    public List<Skills> showSkills () {
        return sklServ.showSkills();
    }
}
