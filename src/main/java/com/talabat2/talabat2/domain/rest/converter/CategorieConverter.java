/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.Categorie;
import com.talabat2.talabat2.domain.rest.vo.CategorieVo;

/**
 *
 * @author ASUS
 */
public class CategorieConverter extends AbstractConverter<Categorie, CategorieVo> {

    @Override
    public Categorie toItem(CategorieVo categorievo) {
        if (categorievo == null) {
            return null;
        } else {
            Categorie categorie = new Categorie();
            categorie.setId(categorievo.getId());
            categorie.setNom(categorievo.getNom());
            return categorie;
        }

    }

    @Override
    public CategorieVo toVo(Categorie categorie) {
        if (categorie == null) {
            return null;
        } else {
            CategorieVo categorieVo = new CategorieVo();
            categorieVo.setId(categorie.getId());
            categorieVo.setNom(categorie.getNom());
            return categorieVo;

        }

    }

}
