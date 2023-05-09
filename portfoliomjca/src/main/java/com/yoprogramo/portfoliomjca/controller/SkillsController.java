package com.yoprogramo.portfoliomjca.controller;

import com.yoprogramo.portfoliomjca.model.Skills;
import com.yoprogramo.portfoliomjca.service.ISkillsService;
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
public class SkillsController {
    @Autowired
    ISkillsService sklServ;
    
    @GetMapping ("/show/skills")
    @ResponseBody
    public List<Skills> showSkills () {
        return sklServ.showSkills();
    }
    
    @PostMapping ("/new/skill")
    public void addSkill (@RequestBody Skills skl){
        sklServ.newSkill(skl);
}
    @DeleteMapping ("/delete/{id}")
    public void deleteSkill (@PathVariable Long id){
        sklServ.deleteSkill(id);
    }
}
