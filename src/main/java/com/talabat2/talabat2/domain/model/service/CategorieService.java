/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Categorie;

/**
 *
 * @author ASUS
 */
public interface CategorieService {

    public Categorie findByNom(String nom);

    public int creerCategorie(Categorie categorie);

}
