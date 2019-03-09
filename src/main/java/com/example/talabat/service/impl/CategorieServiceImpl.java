/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service.impl;

import com.example.talabat.bean.Categorie;
import com.example.talabat.bean.Restaurant;
import com.example.talabat.dao.CategorieDao;
import com.example.talabat.service.CategorieService;
import com.example.talabat.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieDao categorieDao;

    @Autowired
    private RestaurantService restaurantService;
    

    public RestaurantService getRestaurantService() {
        return restaurantService;
    }

    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Override
    public int creerCategorie(Categorie categorie) {
        Categorie c = findByNom(categorie.getNom());

        if (c != null) {
            return -1;

        } else {

            categorieDao.save(categorie);

            return 1;
        }

    }

    public CategorieDao getCategorieDao() {
        return categorieDao;
    }

    public void setCategorieDao(CategorieDao categorieDao) {
        this.categorieDao = categorieDao;
    }

    @Override
    public Categorie findByNom(String nom) {
       // return categorieDao.findByNom(nom);
       return null;

    }

}
