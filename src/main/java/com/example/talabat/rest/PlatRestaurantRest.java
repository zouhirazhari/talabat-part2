/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest;

import com.example.talabat.bean.PlatRestaurant;
import com.example.talabat.service.PlatRestaurantService;
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
    public int creerPlatRestaurant(@RequestBody PlatRestaurant platRestaurant) {
        return platRestaurantService.creerPlatRestaurant(platRestaurant);
    }

    @GetMapping("/findByPlatRestaurantRef/{reference}")
    public PlatRestaurant findByReference(@PathVariable String reference) {
        return platRestaurantService.findByReference(reference);
    }

    public PlatRestaurantService getPlatRestaurantService() {
        return platRestaurantService;
    }

    public void setPlatRestaurantService(PlatRestaurantService platRestaurantService) {
        this.platRestaurantService = platRestaurantService;
    }

}
