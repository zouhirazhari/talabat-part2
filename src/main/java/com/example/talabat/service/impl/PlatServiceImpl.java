/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service.impl;

import com.example.talabat.bean.Plat;
import com.example.talabat.dao.PlatDao;
import com.example.talabat.service.PlatService;
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

    public PlatDao getPlatDao() {
        return platDao;
    }

    public void setPlatDao(PlatDao platDao) {
        this.platDao = platDao;
    }

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

}
