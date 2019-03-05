/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.dao;

import com.example.talabat.bean.Rue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface RueDao extends JpaRepository<Rue, Long> {

    public Rue findByNomRue(String nomRue);

    public Rue findByNomRueAndQuartierNomQuartier(String nomRue, String nomQuartier);

}
