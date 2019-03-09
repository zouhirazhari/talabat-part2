/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Plat;
import com.talabat2.talabat2.domain.bean.PlatRestaurant;
import com.talabat2.talabat2.domain.bean.Restaurant;
import com.talabat2.talabat2.domain.model.dao.PlatRestaurantDao;
import com.talabat2.talabat2.domain.model.service.PlatRestaurantService;
import com.talabat2.talabat2.domain.model.service.PlatService;
import com.talabat2.talabat2.domain.model.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PlatRestaurantServiceImpl implements PlatRestaurantService {

    @Autowired
    private PlatRestaurantDao platRestaurantDao;
    @Autowired
    private PlatService platService;
    @Autowired
    private RestaurantService restaurantService;

    public PlatRestaurantDao getPlatRestaurantDao() {
        return platRestaurantDao;
    }

    public void setPlatRestaurantDao(PlatRestaurantDao platRestaurantDao) {
        this.platRestaurantDao = platRestaurantDao;
    }

    public PlatService getPlatService() {
        return platService;
    }

    public void setPlatService(PlatService platService) {
        this.platService = platService;
    }

    public RestaurantService getRestaurantService() {
        return restaurantService;
    }

    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Override
    public int creerPlatRestaurant(PlatRestaurant platRestaurant) {
        if (platRestaurant == null) {
            return -1;
        } else if (platRestaurant.getRestaurant() == null) {
            return -2;
        } else if (platRestaurant.getPlat() == null) {
            return -3;
        } else if (platRestaurant.getDate() == null) {
            return -4;
        } else {
            Plat p = platService.findByNom(platRestaurant.getPlat().getNom());
            Restaurant r = restaurantService.findByReference(platRestaurant.getRestaurant().getReference());

            PlatRestaurant pr = platRestaurantDao.findByReference(platRestaurant.getReference());
            if (pr != null) {
                return -5;
            } else {
                platRestaurant.setPlat(p);
                platRestaurant.setRestaurant(r);
                platRestaurantDao.save(platRestaurant);
                return 1;

            }
        }
    }

    @Override
    public PlatRestaurant findByReference(String reference) {
        return platRestaurantDao.findByReference(reference);
    }

}
