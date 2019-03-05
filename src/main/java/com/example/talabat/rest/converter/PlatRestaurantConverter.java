/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest.converter;

import com.example.talabat.bean.PlatRestaurant;
import com.example.talabat.common.util.DateUtil;
import com.example.talabat.rest.vo.PlatRestaurantVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class PlatRestaurantConverter extends AbstractConverter<PlatRestaurant, PlatRestaurantVo> {

    @Override
    public PlatRestaurant toItem(PlatRestaurantVo vo) {
        if (vo == null) {
            return null;
        } else {
            PlatRestaurant pr = new PlatRestaurant();
            pr.setId(vo.getId());
            pr.setId(vo.getId());
            pr.setReference(vo.getReference());
            pr.setPlat(new PlatConverter().toItem(vo.getPlatVo()));
            pr.setDate(DateUtil.parse(vo.getDate()));
            return pr;

        }

    }

    @Override
    public PlatRestaurantVo toVo(PlatRestaurant pr) {
        if (pr == null) {
            return null;
        } else {
            PlatRestaurantVo prVo = new PlatRestaurantVo();
            prVo.setId(pr.getId());
            prVo.setDate(DateUtil.formateDate(pr.getDate()));
            prVo.setPlatVo(new PlatConverter().toVo(pr.getPlat()));
            prVo.setReference(pr.getReference());
            prVo.setRestaurantVo(new RestaurantConverter().toVo(pr.getRestaurant()));
            return prVo;

        }

    }

}
