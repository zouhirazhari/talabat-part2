/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest.converter;

import com.example.talabat.bean.Quartier;
import com.example.talabat.rest.vo.QuartierVo;
import com.sun.javafx.geom.Quat4f;

/**
 *
 * @author ASUS
 */
public class QuartierConverter extends AbstractConverter<Quartier, QuartierVo> {

    @Override
    public Quartier toItem(QuartierVo quartierVo) {
        if (quartierVo == null) {
            return null;
        } else {
            Quartier quartier = new Quartier();
            quartier.setId(quartierVo.getId());
            quartier.setNomQuartier(quartierVo.getNomQuartier());
            quartier.setVille(new VilleConverter().toItem(quartierVo.getVilleVo()) );
            return quartier;
        }
    }

    @Override
    public QuartierVo toVo(Quartier quartier) {
        if (quartier == null) {
            return null;
        }
        else {
            QuartierVo quartierVo = new QuartierVo();
            quartierVo.setId(quartier.getId());
            quartierVo.setNomQuartier(quartier.getNomQuartier());
            quartierVo.setVilleVo(new VilleConverter().toVo(quartier.getVille()));
            return quartierVo;
            
        }

    }

}
