/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo;

import com.talabat2.talabat2.domain.bean.Pays;

/**
 *
 * @author ASUS
 */
 public class VilleVo {

    private Long id;
    private String nomVille;
    private PaysVo paysVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public PaysVo getPaysVo() {
        return paysVo;
    }

    public void setPaysVo(PaysVo paysVo) {
        this.paysVo = paysVo;
    }
    
    

}
