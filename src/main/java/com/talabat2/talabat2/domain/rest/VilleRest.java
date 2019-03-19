/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.Ville;
import com.talabat2.talabat2.domain.model.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wadie
 */

@RestController
@RequestMapping("/ville")

public class VilleRest {
    @Autowired
    private VilleService villeService;

    public VilleService getVilleService() {
        return villeService;
    }

    public void setVilleService(VilleService villeService) {
        this.villeService = villeService;
    }
    @PostMapping("/")
    public int creerVille(@RequestBody Ville ville) {
        return villeService.creerVille(ville);
    }


    public Ville findBynom(String nom) {
        return villeService.findBynomVille(nom);
    }
    
    
    
    
}
