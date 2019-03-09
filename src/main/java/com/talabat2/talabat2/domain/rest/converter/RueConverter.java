/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.Rue;
import com.talabat2.talabat2.domain.rest.vo.RueVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class RueConverter extends AbstractConverter<Rue, RueVo> {

    @Override
    public Rue toItem(RueVo rueVo) {
        if (rueVo == null) {
            return null;
        } else {
            Rue rue = new Rue();
            rue.setId(rueVo.getId());
            rue.setNomRue(rueVo.getNomRue());
          //  rue.setQuartier(new QuartierConverter().toItem(rueVo.getQuartierVo()));
            return rue;

        }

    }

    @Override
    public RueVo toVo(Rue rue) {
        if (rue == null) {
            return null;
        } else {
            RueVo rueVo = new RueVo();
            rueVo.setId(rue.getId());
            rueVo.setNomRue(rueVo.getNomRue());
           // rueVo.setQuartierVo(new QuartierConverter().toVo(rue.getQuartier()));
            return rueVo;
        }
    }

}
