/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service;

import com.example.talabat.bean.Pays;

/**
 *
 * @author ASUS
 */
public interface PaysService {
    public int creerPays(Pays pays);
       public Pays findByNom(String nomPays);
    
}
