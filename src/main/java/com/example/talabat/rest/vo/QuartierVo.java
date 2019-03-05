/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.talabat.rest.vo;

/**
 *
 * @author ASUS
 */
public class QuartierVo {

    private Long id;
    private String nomQuartier;
    private VilleVo villeVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomQuartier() {
        return nomQuartier;
    }

    public void setNomQuartier(String nomQuartier) {
        this.nomQuartier = nomQuartier;
    }

    public VilleVo getVilleVo() {
        return villeVo;
    }

    public void setVilleVo(VilleVo villeVo) {
        this.villeVo = villeVo;
    }

}
