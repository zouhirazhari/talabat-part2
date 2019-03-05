/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.dao;

import com.example.talabat.bean.Pays;
import com.example.talabat.bean.Ville;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface VilleDao extends JpaRepository<Ville, Long> {

    public Ville findByNomVilleAndPaysNomPays(String nomPays, String nomVille);
//     public Ville findBynom(String nomVille); 

}
