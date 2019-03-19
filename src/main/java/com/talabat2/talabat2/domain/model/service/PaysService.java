/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Pays;

/**
 *
 * @author ASUS
 */
public interface PaysService {

    public int creerPays(Pays pays);

    public Pays findByNom(String nomPays);

}
