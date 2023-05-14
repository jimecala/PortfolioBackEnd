package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Skills;
import com.yoprogramo.portfoliomjca.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository sklRepo;

    @Override
    public void newSkill(Skills skl) {
        sklRepo.save(skl);
    }
    
    @Override
    public void editSkill(Skills skl) {
        sklRepo.save(skl);
    }

    @Override
    public void deleteSkill(Long id) {
        sklRepo.deleteById(id);
    }
    
    @Override
    public Skills getSkill() {
        List<Skills> list = sklRepo.findAll();
        if (!list.isEmpty()){
            return list.get(0);
        }else{
            return null;
        }        
    }

    @Override
    public List<Skills> showSkills() {
        return sklRepo.findAll();
    }

    @Override
    public Skills searchSkill(Long id) {
        return sklRepo.findById(id).orElse(null);
    }
    
}