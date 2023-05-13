package com.yoprogramo.portfoliomjca.controller;

import com.yoprogramo.portfoliomjca.model.Persona;
import com.yoprogramo.portfoliomjca.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    IPersonaService persoServ;
      
    @GetMapping ("/show/personas")
    @ResponseBody
    public List<Persona> showPersonas () {
        return persoServ.showPersonas();
    }
    
    @PostMapping ("/new/persona")
    public void addPersona (@RequestBody Persona per) {
       persoServ.newPersona(per);
    }
        
    @DeleteMapping ("/delete/persona/{id}")
    public void deletePersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
    }
    
    
}
