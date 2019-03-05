/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.service;

import com.example.talabat.bean.Quartier;
import com.example.talabat.dao.QuartierDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ASUS
 */
public interface QuartierService {

    public List<Quartier> findByVilleNom(String nomVille);
//    public Quartier findByNom(String nom);

    public int creerQuartier(Quartier quartier);

    public Quartier findByNomQuartierAndQuartierVilleNomVille(String nomQuartier, String nomVille);

}
