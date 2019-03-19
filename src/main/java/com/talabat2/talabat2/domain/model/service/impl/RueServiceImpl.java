/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.bean.Rue;
import com.talabat2.talabat2.domain.model.dao.QuartierDao;
import com.talabat2.talabat2.domain.model.dao.RueDao;
import com.talabat2.talabat2.domain.model.service.RueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class RueServiceImpl implements RueService {

    @Autowired
    private RueDao rueDao;
    @Autowired
    private QuartierDao quartierDao;

    public QuartierDao getQuartierDao() {
        return quartierDao;
    }

    public void setQuartierDao(QuartierDao quartierDao) {
        this.quartierDao = quartierDao;
    }

    public RueDao getRueDao() {
        return rueDao;
    }

    public void setRueDao(RueDao rueDao) {
        this.rueDao = rueDao;
    }

    @Override
    public Rue findByNom(String nom) {
        return rueDao.findByNomRue(nom);
    }

    @Override
    public int creerRue(Rue rue) {
        Rue r = rueDao.findByNomRue(rue.getNomRue());
        Quartier q = quartierDao.findByNomQuartier(r.getQuartier().getNomQuartier());

        if (rue == null) {
            return -1;
        } else if (q != null) {
            return -2;
        } else {
            rueDao.save(r);
            return 1;
        }
    }
}
