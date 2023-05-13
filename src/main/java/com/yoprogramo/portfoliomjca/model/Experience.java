package com.yoprogramo.portfoliomjca.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experience implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String employer;
    private String isCurrent;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    private Date startDate;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    private Date endDate;

    public Experience() {
    }

    public Experience(Long id, String employer, String isCurrent, Date startDate, Date endDate) {
        this.id = id;
        this.employer = employer;
        this.isCurrent = isCurrent;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    
    
    
    
}
