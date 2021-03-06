/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Plat;
import com.talabat2.talabat2.domain.model.dao.PlatDao;
import com.talabat2.talabat2.domain.model.service.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PlatServiceImpl implements PlatService {

    @Autowired
    private PlatDao platDao;

    @Override
    public int creerPlat(Plat plat) {
        if (plat == null) {
            return -1;
        } else {
            Plat p = platDao.findByNom(plat.getNom());
            if (p != null) {
                return -2;
            } else {
                p = new Plat();
                p.setNom(plat.getNom());
                platDao.save(p);
                return 1;
            }
        }
    }

    @Override
    public Plat findByNom(String nom) {
        return platDao.findByNom(nom);
    }

    //****************getters et setters *****************//
    public PlatDao getPlatDao() {
        return platDao;
    }

    public void setPlatDao(PlatDao platDao) {
        this.platDao = platDao;
    }

}
