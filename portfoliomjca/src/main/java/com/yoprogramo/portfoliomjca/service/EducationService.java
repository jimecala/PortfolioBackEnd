package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Education;
import com.yoprogramo.portfoliomjca.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository eduRepo;
    

    @Override
    public List<Education> showEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void newEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }
    
}
