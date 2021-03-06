/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.Plat;
import com.talabat2.talabat2.domain.model.service.PlatService;
import com.talabat2.talabat2.domain.rest.converter.PlatConverter;
import com.talabat2.talabat2.domain.rest.vo.PlatVo;
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
@RequestMapping("/plat")
public class PlatRest {
    
    @Autowired
    private PlatService platService;
    
    @PostMapping("/creerPlat")
    public int creerPlat(@RequestBody PlatVo platvo) {
        Plat plat = new PlatConverter().toItem(platvo);
        return platService.creerPlat(plat);
    }
    
    @GetMapping("/findPlatbynom/{nom}")
    public PlatVo findByNom(@PathVariable String nom) {
        Plat plat = platService.findByNom(nom);
        return new PlatConverter().toVo(plat);
    }
    
//***************getters et setters ******************//
    public PlatService getPlatService() {
        return platService;
    }
    
    public void setPlatService(PlatService platService) {
        this.platService = platService;
    }
    
}
