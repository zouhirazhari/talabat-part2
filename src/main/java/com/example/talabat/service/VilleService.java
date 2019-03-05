/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service;

import com.example.talabat.bean.Pays;
import com.example.talabat.bean.Ville;
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
