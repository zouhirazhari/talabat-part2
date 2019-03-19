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
import com.talabat2.talabat2.domain.rest.converter.CategorieConverter;
import com.talabat2.talabat2.domain.rest.converter.RestaurantConverter;
import com.talabat2.talabat2.domain.rest.vo.CategorieVo;
import com.talabat2.talabat2.domain.rest.vo.RestaurantVo;
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
    public RestaurantVo findByReference(@PathVariable String reference) {
        Restaurant restaurant = restaurantService.findByReference(reference);
        return new RestaurantConverter().toVo(restaurant);
    }

    @PostMapping("/creerRestaurant")
    public int creerRestaurant(@RequestBody RestaurantVo restaurantVo) {
        Restaurant restaurant = new RestaurantConverter().toItem(restaurantVo);
        return restaurantService.creerRestaurant(restaurant);
    }

    @GetMapping("/findByCategorieNom/{nom}")
    public CategorieVo findByCategorieNom(@PathVariable String nom) {
        Categorie categorie = categorieService.findByNom(nom);
        return new CategorieConverter().toVo(categorie);
    }

    @PostMapping("/creerCategorie")
    public int creerCategorie(@RequestBody CategorieVo categorieVo) {
        Categorie categorie=new CategorieConverter().toItem(categorieVo);
        return categorieService.creerCategorie(categorie);
    }
    //*****************getters et setters ************************************//
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
