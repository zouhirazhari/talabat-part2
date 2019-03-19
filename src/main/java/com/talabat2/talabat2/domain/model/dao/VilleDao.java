/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.dao;

import com.talabat2.talabat2.domain.bean.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface VilleDao extends JpaRepository<Ville, Long> {

    public Ville findByNomVilleAndPaysNomPays(String nomPays, String nomVille);

    public Ville findBynomVille(String nomVille);

}
