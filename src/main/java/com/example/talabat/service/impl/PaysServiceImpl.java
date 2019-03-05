/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service.impl;

import com.example.talabat.bean.Pays;
import com.example.talabat.dao.PaysDao;
import com.example.talabat.service.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PaysServiceImpl implements PaysService {

    @Autowired
    private PaysDao paysDao;

    public PaysDao getPaysDao() {
        return paysDao;
    }

    public void setPaysDao(PaysDao paysDao) {
        this.paysDao = paysDao;
    }

    @Override
    public int creerPays(Pays pays) {
        Pays p = paysDao.findByNomPays(pays.getNomPays());
        if (p != null) {
            return -1;
        }
        paysDao.save(pays);
        return 1;

    }

    @Override
    public Pays findByNom(String nomPays) {
        return paysDao.findByNomPays(nomPays);
    }

}
