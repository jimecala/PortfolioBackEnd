package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> showEducation ();
    
    public void newEducation (Education edu);
    
    public void deleteEducation (Long id);
    
}
