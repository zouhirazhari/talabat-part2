/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.Pays;
import com.talabat2.talabat2.domain.bean.Ville;
import com.talabat2.talabat2.domain.model.dao.VilleDao;
import com.talabat2.talabat2.domain.model.service.PaysService;
import com.talabat2.talabat2.domain.model.service.VilleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class VilleServiceImpl implements VilleService {

    @Autowired
    private VilleDao villeDao;
    @Autowired
    private PaysService paysService;

    public VilleDao getVilleDao() {
        return villeDao;
    }

    public void setVilleDao(VilleDao villeDao) {
        this.villeDao = villeDao;
    }

    public PaysService getPaysService() {
        return paysService;
    }

    public void setPaysService(PaysService paysService) {
        this.paysService = paysService;
    }

    @Override
    public int creerVille(Ville ville) {
        if (ville == null) {
            return -1;
        } else if (ville.getPays() == null) {
            return -2;
        } else {
            Ville v = villeDao.findByNomVilleAndPaysNomPays(ville.getNomVille(), ville.getPays().getNomPays());
            if (v != null) {
                return -3;
            } else {
                Pays pays = paysService.findByNom(ville.getPays().getNomPays());
                if (pays == null) {
                    return -4;
                } else {
                    v = new Ville();
                    v.setNomVille(ville.getNomVille());
                    v.setPays(pays);
                    villeDao.save(v);
                    return 1;
                }
            }
        }

    }

//    @Override
//    public Ville findBynom(String nom) {
//        return villeDao.findBynom(nom);
//    }
//
//    @Override
//    public Ville findBy(Pays pays, Ville ville) {
//        return villeDao.findByPaysNom(pays,ville);
//    }
    @Override
    public Ville findByNomVilleAndVillePaysNomPays(String nomPays, String nomVille) {
        return villeDao.findByNomVilleAndPaysNomPays(nomPays, nomVille);
    }

}
