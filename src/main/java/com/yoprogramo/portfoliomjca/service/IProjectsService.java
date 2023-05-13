package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Projects;
import java.util.List;


public interface IProjectsService {
    
    public List<Projects> showProjects ();
    
    public void addProject (Projects proj);
    
    public void deleteProject (Long id);
}
