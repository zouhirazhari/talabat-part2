/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.Pays;
import com.talabat2.talabat2.domain.rest.vo.PaysVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class PaysConverter extends AbstractConverter<Pays, PaysVo> {

    @Override
    public Pays toItem(PaysVo vo) {
        if (vo == null) {
            return null;
        } else {
            Pays pays = new Pays();
            pays.setId(vo.getId());
            pays.setNomPays(vo.getNomPays());
            return pays;
        }
    }

    @Override
    public PaysVo toVo(Pays pays) {
        if (pays == null) {
            return null;
        } else {
            PaysVo vo = new PaysVo();
            vo.setId(pays.getId());
            vo.setNomPays(pays.getNomPays());
            return vo;

        }
    }

}
