/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Rue;

/**
 *
 * @author ASUS
 */
public interface RueService {

    public Rue findByNom(String nomRue);

    public int creerRue(Rue rue);

    public Rue findByNomRueAndRueQuartierNomQuartier(String nomRue, String nomQuartier);

}
