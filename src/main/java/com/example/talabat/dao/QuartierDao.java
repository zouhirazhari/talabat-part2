/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.dao;

import com.example.talabat.bean.Quartier;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface QuartierDao extends JpaRepository<Quartier, Long> {

    public List<Quartier> findByVilleNomVille(String nomVille);

    public Quartier findByNomQuartierAndVilleNomVille(String nomQuartier, String nomVille);
//    public Quartier findByNom(String nom);

}
