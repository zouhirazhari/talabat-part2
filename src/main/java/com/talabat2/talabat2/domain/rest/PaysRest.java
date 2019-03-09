/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.Pays;
import com.talabat2.talabat2.domain.model.service.PaysService;
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
@RequestMapping("/pays")
public class PaysRest {
    @Autowired
    private PaysService paysService;
   
    @PostMapping("/creerpays")
    public int creerPays(@RequestBody Pays pays) {
        return paysService.creerPays(pays);
    }
    @GetMapping("/findbynom/{nomPays}")
    public Pays findByNom(@PathVariable String nomPays) {
        return paysService.findByNom(nomPays);
    }

    public PaysService getPaysService() {
        return paysService;
    }

    public void setPaysService(PaysService paysService) {
        this.paysService = paysService;
    }
    
}
