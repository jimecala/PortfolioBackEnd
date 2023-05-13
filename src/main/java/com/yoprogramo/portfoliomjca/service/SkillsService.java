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
    public List<Skills> showSkills() {
        return sklRepo.findAll();
    }

    @Override
    public void newSkill(Skills skl) {
        sklRepo.save(skl);
    }

    @Override
    public void deleteSkill(Long id) {
        sklRepo.deleteById(id);
    }
    
}
