package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Projects;
import com.yoprogramo.portfoliomjca.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService{
    
    @Autowired
    public ProjectsRepository projRepo;

    @Override
    public List<Projects> showProjects () {
        return projRepo.findAll();
    }

    @Override
    public void addProject(Projects proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProject(Long id) {
        projRepo.deleteById(id);
    }
    
}
