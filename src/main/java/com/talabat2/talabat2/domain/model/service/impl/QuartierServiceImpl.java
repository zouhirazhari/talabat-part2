/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.bean.Ville;
import com.talabat2.talabat2.domain.model.dao.QuartierDao;
import com.talabat2.talabat2.domain.model.dao.VilleDao;
import com.talabat2.talabat2.domain.model.service.QuartierService;
import com.talabat2.talabat2.domain.model.service.VilleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class QuartierServiceImpl implements QuartierService {

    @Autowired
    private QuartierDao quartierDao;
    @Autowired
    private VilleService villeService;

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

    @Override
    public List<Quartier> findByVilleNom(String nomVille) {
        return quartierDao.findByVilleNomVille(nomVille);
    }

//    @Override
//    public Quartier findByNom(String nom) {
//        return quartierDao.findByNom(nom);
//    }
    @Override
    public int creerQuartier(Quartier quartier) {
        if (quartier == null) {
            return -1;
        } else if (quartier.getVille() == null) {
            return -2;

        } else {
            Quartier q = quartierDao.findByNomQuartierAndVilleNomVille(quartier.getNomQuartier(), quartier.getVille().getNomVille());
            if (q != null) {
                return -3;
            } else {
                Ville v = villeService.findByNomVilleAndVillePaysNomPays(quartier.getVille().getNomVille(), quartier.getVille().getPays().getNomPays());
                if (v == null) {
                    return -4;
                } else {
                    q = new Quartier();
                    q.setNomQuartier(quartier.getNomQuartier());
                    q.setVille(v);
                    quartierDao.save(q);
                    return 1;
                }

            }
        }

    }

    @Override
    public Quartier findByNomQuartierAndQuartierVilleNomVille(String nomQuartier, String nomVille) {
        return quartierDao.findByNomQuartierAndVilleNomVille(nomQuartier, nomVille);
    }

}