package com.yoprogramo.portfoliomjca.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Projects implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String type;

    public Projects() {
    }

    public Projects(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    
    
    
}
