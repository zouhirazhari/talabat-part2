/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Plat;

/**
 *
 * @author ASUS
 */
public interface PlatService {

    public int creerPlat(Plat plat);

    public Plat findByNom(String nom);

}
