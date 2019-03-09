/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.model.service.QuartierService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/quartier")
public class QuartierRest {
    
    @Autowired
    private QuartierService quartierService;

    @GetMapping("/f/{nomVille}")
    public List<Quartier> findByVilleNom(@PathVariable String nomVille) {
        return quartierService.findByVilleNom(nomVille);
    }
//    @GetMapping("/find/{nom}")
//    public Quartier findByNom(@PathVariable String nom) {
//        return quartierService.findByNom(nom);
//    }
//    
    @PostMapping("/creerQuartier")
    public int creerQuartier(@RequestBody Quartier quartier) {
        return quartierService.creerQuartier(quartier);
    }
    @GetMapping("/nq/{nomQuartier}/nv/{nomVille}")
    public Quartier findByNomQuartierAndVilleNomVille(@PathVariable String nomQuartier,@PathVariable String nomVille) {
        return quartierService.findByNomQuartierAndQuartierVilleNomVille(nomQuartier, nomVille);
    }
  

    public QuartierService getQuartierService() {
        return quartierService;
    }

    public void setQuartierService(QuartierService quartierService) {
        this.quartierService = quartierService;
    }
    
}
