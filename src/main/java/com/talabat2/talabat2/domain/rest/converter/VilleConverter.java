/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.Ville;
import com.talabat2.talabat2.domain.rest.vo.VilleVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class VilleConverter extends AbstractConverter<Ville, VilleVo> {
    
    @Override
    public Ville toItem(VilleVo vo) {
        if (vo == null) {
            return null;
        } else {
            Ville ville = new Ville();
            ville.setId(vo.getId());
            ville.setNomVille(vo.getNomVille());
           // ville.setPays(new PaysConverter().toItem(vo.getPaysVo()));
            ville.setQuartiers(new QuartierConverter().toItem(vo.getQuartiersVo()));
            return ville;
        }
        
    }
    
    @Override
    public VilleVo toVo(Ville ville) {
        if (ville == null) {
            return null;
        } else {
            VilleVo villeVo = new VilleVo();
            villeVo.setId(ville.getId());
            villeVo.setNomVille(ville.getNomVille());
            //villeVo.setPaysVo(new PaysConverter().toVo(ville.getPays()));
            villeVo.setQuartiersVo(new QuartierConverter().toVo(ville.getQuartiers()));
            return villeVo;
            
        }
        
    }
    
}
