/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.model.dao;

import com.talabat2.talabat2.domain.bean.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wadie
 */
@Repository
public interface PaysDao extends JpaRepository<Pays, Long> {

    public Pays findByNomPays(String nomPays);

}
