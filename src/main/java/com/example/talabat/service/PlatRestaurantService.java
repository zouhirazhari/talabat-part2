/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service;

import com.example.talabat.bean.PlatRestaurant;
import com.example.talabat.bean.Restaurant;

/**
 *
 * @author ASUS
 */
public interface PlatRestaurantService {
    public int creerPlatRestaurant(PlatRestaurant platRestaurant);
    public PlatRestaurant findByReference(String reference);
    
}
