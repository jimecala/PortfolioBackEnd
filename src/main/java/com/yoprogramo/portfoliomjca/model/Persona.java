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
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String position;
    private String introduction;
    private String img;
    private String email;

    public Persona() {    }

    public Persona(Long id, String name, String position, String introduction, String img, String email) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.introduction = introduction;
        this.img = img;
        this.email = email;
    }

    
    
    
}



