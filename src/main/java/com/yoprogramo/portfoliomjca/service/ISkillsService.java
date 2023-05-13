package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List<Skills> showSkills();
    
    public void newSkill (Skills skl);
    
    public void deleteSkill (Long id);
    
}
