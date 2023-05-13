package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Experience;
import com.yoprogramo.portfoliomjca.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository expRepo;

    @Override
    public List<Experience> showExperience() {
        return expRepo.findAll();
    }

    @Override
    public void newExperience(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }

    
}
