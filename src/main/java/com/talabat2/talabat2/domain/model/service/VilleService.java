/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Pays;
import com.talabat2.talabat2.domain.bean.Ville;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface VilleService  {
    public int creerVille(Ville ville);
    public  Ville findByNomVilleAndVillePaysNomPays(String nomPays , String nomVille);
//    public Ville findBynom(String nom);

    
    
}
