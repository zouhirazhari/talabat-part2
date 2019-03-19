/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.dao;

import com.talabat2.talabat2.domain.bean.Quartier;
import com.talabat2.talabat2.domain.bean.Ville;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wadie
 */
@Repository
public interface QuartierDao extends JpaRepository<Quartier, Long> {

   public List<Quartier> findByVille(Ville ville);

    public Quartier findByNomQuartier(String nomQuartier);

}
