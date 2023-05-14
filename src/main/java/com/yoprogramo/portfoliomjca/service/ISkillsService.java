package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public void newSkill (Skills skl);
    
    public void editSkill (Skills skl);
    
    public void deleteSkill (Long id);
    
    public List<Skills> showSkills();
    
    public Skills searchSkill (Long id);
}
