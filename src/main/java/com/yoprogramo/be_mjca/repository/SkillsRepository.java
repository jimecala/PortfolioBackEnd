package com.yoprogramo.be_mjca.repository;

import com.yoprogramo.be_mjca.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long>{
    
}
