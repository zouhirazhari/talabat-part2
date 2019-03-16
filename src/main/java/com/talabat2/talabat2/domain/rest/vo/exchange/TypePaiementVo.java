/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo.exchange;

import java.util.List;

/**
 *
 * @author wadie
 */
public class TypePaiementVo {
     private Long id;
    private String libelle;
    private List<PaiementVo> paiementVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<PaiementVo> getPaiementVo() {
        return paiementVo;
    }

    public void setPaiementVo(List<PaiementVo> paiementVo) {
        this.paiementVo = paiementVo;
    }
    
    
   
}
