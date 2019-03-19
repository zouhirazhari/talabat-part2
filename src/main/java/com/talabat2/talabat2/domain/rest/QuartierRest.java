/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.bean.Ville;
import com.talabat2.talabat2.domain.model.service.QuartierService;
import com.talabat2.talabat2.domain.rest.converter.QuartierConverter;
import com.talabat2.talabat2.domain.rest.vo.QuartierVo;
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
    public List<QuartierVo> findByVilleNom(@PathVariable Ville ville) {
        List<Quartier> Quartiers = quartierService.findByVilleNom(ville);
        return new QuartierConverter().toVo(Quartiers);
    }

    @GetMapping("/find/{nom}")
    public QuartierVo findByNom(@PathVariable String nom) {
        Quartier quartier = null;
        // quartierService.findByNom(nom);
        return new QuartierConverter().toVo(quartier);
    }

    @PostMapping("/creerQuartier")
    public int creerQuartier(@RequestBody QuartierVo quartierVo) {
        Quartier quartier = new QuartierConverter().toItem(quartierVo);
        return quartierService.creerQuartier(quartier);
    }

    //************getters et setters ***************///
    public QuartierService getQuartierService() {
        return quartierService;
    }

    public void setQuartierService(QuartierService quartierService) {
        this.quartierService = quartierService;
    }

}
