package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public void newPersona (Persona per);
    
    public void editPersona (Persona per);
    
    public void deletePersona (Long id);
    
    public Persona getPersona();
    
    public List<Persona> showPersonas ();
    
    public Persona searchPersona (Long id);
    
}
