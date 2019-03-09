/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;

import com.talabat2.talabat2.domain.bean.Categorie;
import com.talabat2.talabat2.domain.bean.Restaurant;
import com.talabat2.talabat2.domain.model.service.CategorieService;
import com.talabat2.talabat2.domain.model.service.RestaurantService;
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
@RequestMapping("/ta")
public class CategorieRest {

    @Autowired
    private CategorieService categorieService;
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/findbyref/{reference}")
    public Restaurant findByReference(@PathVariable String reference) {
        return restaurantService.findByReference(reference);
    }

    @PostMapping("/creerRestaurant")
    public int creerRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.creerRestaurant(restaurant);
    }

    @GetMapping("/findByCategorieNom/{nom}")
    public Categorie findByCategorieNom(@PathVariable String nom) {
        return categorieService.findByNom(nom);
    }

    @PostMapping("/creerCategorie")
    public int creerCategorie(@RequestBody Categorie categorie) {
        return categorieService.creerCategorie(categorie);
    }

    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    public RestaurantService getRestaurantService() {
        return restaurantService;
    }

    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

}