/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest.converter;

import com.example.talabat.bean.Restaurant;
import com.example.talabat.common.util.NumberUtil;
import com.example.talabat.rest.vo.RestaurantVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class RestaurantConverter extends AbstractConverter<Restaurant, RestaurantVo> {

    @Override
    public Restaurant toItem(RestaurantVo restauVo) {
        if (restauVo == null) {
            return null;
        } else {
            Restaurant restau = new Restaurant();
            restau.setAdresse(restauVo.getAdresse());
            restau.setId(restauVo.getId());
            restau.setNom(restauVo.getNom());
            restau.setReference(restauVo.getReference());
            restau.setCategorie(new CategorieConverter().toItem(restauVo.getCategorieVo()));
            restau.setRue(new RueConverter().toItem(restauVo.getRueVo()));
            restau.setNum(NumberUtil.toInteger(restauVo.getNum()));
            return restau;
        }

    }

    @Override
    public RestaurantVo toVo(Restaurant restau) {
        if (restau == null) {
            return null;
        } else {
            RestaurantVo restauVo = new RestaurantVo();
            restauVo.setAdresse(restau.getAdresse());
            restauVo.setId(restau.getId());
            restauVo.setNom(restau.getNom());
            restauVo.setReference(restau.getReference());
            restauVo.setCategorieVo(new CategorieConverter().toVo(restau.getCategorie()));
            restauVo.setRueVo(new RueConverter().toVo(restau.getRue()));
            restauVo.setNum(restau.getNum() + "");
            return restauVo;

        }

    }

}
