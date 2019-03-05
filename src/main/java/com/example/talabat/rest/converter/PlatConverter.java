/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest.converter;

import com.example.talabat.bean.Plat;
import com.example.talabat.rest.vo.PlatVo;

/**
 *
 * @author ASUS
 */
public class PlatConverter extends AbstractConverter<Plat, PlatVo> {

    @Override
    public Plat toItem(PlatVo platvo) {
        if (platvo == null) {
            return null;
        } else {
            Plat plat = new Plat();
            plat.setId(platvo.getId());
            plat.setNom(platvo.getNom());
            return plat;
        }

    }

    @Override
    public PlatVo toVo(Plat plat) {
        if (plat == null) {
            return null;
        } else {
            PlatVo platVo = new PlatVo();
            platVo.setId(plat.getId());
            platVo.setNom(plat.getNom());
            return platVo;
        }

    }

}
