package com.yoprogramo.portfoliomjca.controller;

import com.yoprogramo.portfoliomjca.model.Persona;
import com.yoprogramo.portfoliomjca.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/datos-personales")
@CrossOrigin(origins = "https://portfoliomjca.onrender.com")
public class PersonaController {
    
    @Autowired
    IPersonaService persoServ;
      
    @PostMapping ("/new")
    public void addPersona (@RequestBody Persona per) {
       persoServ.newPersona(per);
    }
    
    @PutMapping ("/edit")
    public void edit(@RequestBody Persona per){
        persoServ.editPersona(per);
    }
        
    @DeleteMapping ("/delete/{id}")
    public void deletePersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
    }
    
    @GetMapping ("/show")
    @ResponseBody
    public List<Persona> showPersonas () {
        return persoServ.showPersonas();
    }
    
    
}
