/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest;

import com.example.talabat.bean.Quartier;
import com.example.talabat.bean.Rue;
import com.example.talabat.service.QuartierService;
import com.example.talabat.service.RueService;
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
@RequestMapping("/rue")
public class RueRest {

    @GetMapping("/rue/{nomRue}/quartier/{nomQuartier}")
    public Rue findByNomRueAndRueQuartierNomQuartier(@PathVariable String nomRue, @PathVariable String nomQuartier) {
        return rueService.findByNomRueAndRueQuartierNomQuartier(nomRue, nomQuartier);
    }
    @Autowired
    private RueService rueService;

    public RueService getReRueService() {
        return rueService;
    }

    public void setReRueService(RueService reRueService) {
        this.rueService = reRueService;
    }

    @GetMapping("/findByNom/{nom}")
    public Rue findByNom(@PathVariable String nom) {
        return rueService.findByNom(nom);
    }

    @PostMapping("/creerRue")
    public int creerRue(@RequestBody Rue rue) {
        return rueService.creerRue(rue);
    }

}
