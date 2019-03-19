/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Categorie;
import com.talabat2.talabat2.domain.bean.Restaurant;
import com.talabat2.talabat2.domain.bean.Rue;
import com.talabat2.talabat2.domain.model.dao.RestaurantDao;
import com.talabat2.talabat2.domain.model.service.CategorieService;
import com.talabat2.talabat2.domain.model.service.RestaurantService;
import com.talabat2.talabat2.domain.model.service.RueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RueService rueService;
    @Autowired
    private RestaurantDao restaurantDao;
    @Autowired
    private CategorieService categorieService;

    @Override
    public Restaurant findByReference(String reference) {
        return restaurantDao.findByReference(reference);
    }

    @Override
    public int creerRestaurant(Restaurant restaurant) {
        if (restaurant == null) {
            return -1;
        } else if (restaurant.getCategorie() == null) {
            return -2;
        } else if (restaurant.getRue() == null) {
            return -3;
        } else {
            Restaurant r = findByReference(restaurant.getReference());
            if (r != null) {
                return -4;
            } else {
                restaurantDao.save(restaurant);
                return 1;
            }
        }
    }
//**************getters et setters ***********************//

    public RueService getRueService() {
        return rueService;
    }

    public void setRueService(RueService rueService) {
        this.rueService = rueService;
    }

    public RestaurantDao getRestaurantDao() {
        return restaurantDao;
    }

    public void setRestaurantDao(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
}
