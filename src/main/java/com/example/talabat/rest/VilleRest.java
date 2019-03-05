/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest;

import com.example.talabat.bean.Pays;
import com.example.talabat.bean.Ville;
import com.example.talabat.service.VilleService;
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
    @GetMapping("/findByNomVilleAndPaysNomPays/{nomPays}/nv/{nomVille}")
    public Ville findByNomVilleAndVillePaysNomPays(@PathVariable String nomPays, @PathVariable String nomVille) {
        return villeService.findByNomVilleAndVillePaysNomPays(nomPays,nomVille);
    }

//    public Ville findBynom(String nom) {
//        return villeService.findBynom(nom);
//    }
//    
    
    
    
}
