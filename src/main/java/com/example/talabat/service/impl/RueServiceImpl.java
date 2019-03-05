/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service.impl;

import com.example.talabat.bean.Quartier;
import com.example.talabat.bean.Rue;
import com.example.talabat.dao.RueDao;
import com.example.talabat.service.QuartierService;
import com.example.talabat.service.RueService;
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
    private QuartierService quartierService;

    public RueDao getRueDao() {
        return rueDao;
    }

    public void setRueDao(RueDao rueDao) {
        this.rueDao = rueDao;
    }

    public QuartierService getQuartierService() {
        return quartierService;
    }

    public void setQuartierService(QuartierService quartierService) {
        this.quartierService = quartierService;
    }

    @Override
    public Rue findByNom(String nom) {
        return rueDao.findByNomRue(nom);
    }

    @Override
    public int creerRue(Rue rue) {
        if (rue == null) {
            return -1;
        } else if (rue.getQuartier() == null) {
            return -2;
        } else {
            Rue r = rueDao.findByNomRueAndQuartierNomQuartier(rue.getNomRue(),rue.getQuartier().getNomQuartier());
            if (r != null) {
                return -3;
            } else {
                Quartier q = quartierService.findByNomQuartierAndQuartierVilleNomVille(rue.getQuartier().getNomQuartier(),rue.getQuartier().getVille().getNomVille());
                if (q == null) {
                    return -4;
                } else {
                    r = new Rue();
                    r.setQuartier(q);
                    r.setNomRue(rue.getNomRue());
                    rueDao.save(r);
                    return 1;
                }

            }

        }
    }

    @Override
    public Rue findByNomRueAndRueQuartierNomQuartier(String rue, String quartier) {
        return rueDao.findByNomRueAndQuartierNomQuartier(rue, quartier);
    }

}
