package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Experience;
import java.util.List;

public interface IExperienceService {
    
    public List<Experience> showExperience ();
    
    public void newExperience (Experience exp);
    
    public void deleteExperience (Long id);
    
}
