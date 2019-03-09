/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.rest.vo.QuartierVo;

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
            quartier.setVille(new VilleConverter().toItem(quartierVo.getVilleVo()));
            quartier.setRues(new RueConverter().toItem(quartierVo.getRuesVo()));
            return quartier;
        }
    }
    
    @Override
    public QuartierVo toVo(Quartier quartier) {
        if (quartier == null) {
            return null;
        } else {
            QuartierVo quartierVo = new QuartierVo();
            quartierVo.setId(quartier.getId());
            quartierVo.setNomQuartier(quartier.getNomQuartier());
            quartierVo.setVilleVo(new VilleConverter().toVo(quartier.getVille()));
            quartierVo.setRuesVo(new RueConverter().toVo(quartier.getRues()));
            return quartierVo;
            
        }
        
    }
    
}
