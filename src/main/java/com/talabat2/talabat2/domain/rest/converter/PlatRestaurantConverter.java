/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.PlatRestaurant;
import com.talabat2.talabat2.commun.util.DateUtil;
import com.talabat2.talabat2.domain.rest.vo.PlatRestaurantVo;
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
            pr.setReference(vo.getReference());
           // pr.setPlat(new PlatConverter().toItem(vo.getPlatVo()));
            pr.setDate(DateUtil.parse(vo.getDate()));
            //pr.setRestaurant(new RestaurantConverter().toItem(vo.getRestaurantVo()));
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
          //  prVo.setPlatVo(new PlatConverter().toVo(pr.getPlat()));
            prVo.setReference(pr.getReference());
          //  prVo.setRestaurantVo(new RestaurantConverter().toVo(pr.getRestaurant()));
            return prVo;
            
        }
        
    }
    
}
