package com.yoprogramo.portfoliomjca.service;

import com.yoprogramo.portfoliomjca.model.Persona;
import com.yoprogramo.portfoliomjca.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public void newPersona(Persona per) {
        persoRepo.save(per);
    }
    
    @Override
    public void editPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }
    
    @Override
    public Persona getPersona() {
        List<Persona> list = persoRepo.findAll();
        if (!list.isEmpty()){
            return list.get(0);
        }else{
            return null;
        }        
    }
    
    @Override
    public List<Persona> showPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public Persona searchPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    

}
