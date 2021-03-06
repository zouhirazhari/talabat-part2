/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Categorie;
import com.talabat2.talabat2.domain.model.dao.CategorieDao;
import com.talabat2.talabat2.domain.model.service.CategorieService;
import com.talabat2.talabat2.domain.model.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieDao categorieDao;

    @Autowired
    private RestaurantService restaurantService;

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

    @Override
    public Categorie findByNom(String nom) {
        return categorieDao.findByNom(nom);
    }

    //********************getters et setters *******************//
    public CategorieDao getCategorieDao() {
        return categorieDao;
    }

    public void setCategorieDao(CategorieDao categorieDao) {
        this.categorieDao = categorieDao;
    }

    public RestaurantService getRestaurantService() {
        return restaurantService;
    }

    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

}
