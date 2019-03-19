/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.bean.Ville;
import com.talabat2.talabat2.domain.model.dao.QuartierDao;
import com.talabat2.talabat2.domain.model.service.QuartierService;
import com.talabat2.talabat2.domain.model.service.VilleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class QuartierServiceImpl implements QuartierService {

    @Autowired
    private QuartierDao quartierDao;
    @Autowired
    private VilleService villeService;

    @Override
    public int creerQuartier(Quartier quartier) {
        Quartier q = quartierDao.findByNomQuartier(quartier.getNomQuartier());
        if (quartier == null) {
            return -1;
        } else if (q != null) {
            return -2;

        } else if (q.getVille() == quartier.getVille()) {
            return -3;
        } else {
            quartierDao.save(q);
            return 1;
        }
    }

    @Override
    public Quartier findByNomRue(String nomRue) {
        return quartierDao.findByNomQuartier(nomRue);
    }

    @Override
    public List<Quartier> findByVilleNom(Ville ville) {
        return quartierDao.findByVille(ville);
    }

    //**************getters et setters *******************//
    public QuartierDao getQuartierDao() {
        return quartierDao;
    }

    public void setQuartierDao(QuartierDao quartierDao) {
        this.quartierDao = quartierDao;
    }

    public VilleService getVilleService() {
        return villeService;
    }

    public void setVilleService(VilleService villeService) {
        this.villeService = villeService;
    }
}
