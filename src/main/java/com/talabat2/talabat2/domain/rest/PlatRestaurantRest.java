/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.PlatRestaurant;
import com.talabat2.talabat2.domain.model.service.PlatRestaurantService;
import com.talabat2.talabat2.domain.rest.converter.PlatRestaurantConverter;
import com.talabat2.talabat2.domain.rest.vo.PlatRestaurantVo;
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
@RequestMapping("/platRestaurant")
public class PlatRestaurantRest {

    @Autowired
    private PlatRestaurantService platRestaurantService;

    @PostMapping("/creerPlatRestaurant")
    public int creerPlatRestaurant(@RequestBody PlatRestaurantVo platRestaurantVo) {
        PlatRestaurant platRestaurant = new PlatRestaurantConverter().toItem(platRestaurantVo);
        return platRestaurantService.creerPlatRestaurant(platRestaurant);
    }

    @GetMapping("/findByPlatRestaurantRef/{reference}")
    public PlatRestaurantVo findByReference(@PathVariable String reference) {

        PlatRestaurant platRestaurant = platRestaurantService.findByReference(reference);
        return new PlatRestaurantConverter().toVo(platRestaurant);
    }
    //****************getters et setters *******************//

    public PlatRestaurantService getPlatRestaurantService() {
        return platRestaurantService;
    }

    public void setPlatRestaurantService(PlatRestaurantService platRestaurantService) {
        this.platRestaurantService = platRestaurantService;
    }

}
