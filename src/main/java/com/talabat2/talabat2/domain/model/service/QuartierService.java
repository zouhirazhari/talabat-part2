/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.service;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.bean.Ville;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface QuartierService {

    public List<Quartier> findByVilleNom(Ville ville);

    public int creerQuartier(Quartier quartier);

    public Quartier findByNomRue(String nomRue);

}
