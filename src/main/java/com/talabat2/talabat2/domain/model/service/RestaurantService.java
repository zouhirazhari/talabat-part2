/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Restaurant;

/**
 *
 * @author ASUS
 */
public interface RestaurantService {

    public Restaurant findByReference(String reference);

    public int creerRestaurant(Restaurant restaurant);
}
