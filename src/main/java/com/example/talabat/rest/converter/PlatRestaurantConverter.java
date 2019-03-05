/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest.converter;

import com.example.talabat.bean.PlatRestaurant;
import com.example.talabat.rest.vo.PlatRestaurantVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class PlatRestaurantConverter extends AbstractConverter<PlatRestaurant, PlatRestaurantVo>{

    @Override
    public PlatRestaurant toItem(PlatRestaurantVo vo) {
        if(vo == null) {
            return null;
            }
        else {
            PlatRestaurant pr = new PlatRestaurant();
            pr.setId(vo.getId());
//            pr.set
            
            return pr;
            
        }
        
    }

    @Override
    public PlatRestaurantVo toVo(PlatRestaurant item) {
        return null;
    }
    
    
}
