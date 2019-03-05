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
public class RestaurantVo {

    private Long id;
    private String reference;
    private String nom;
    private String adresse;
    private String num;

    private CategorieVo categorieVo;
    private RueVo rueVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public CategorieVo getCategorieVo() {
        return categorieVo;
    }

    public void setCategorieVo(CategorieVo categorieVo) {
        this.categorieVo = categorieVo;
    }

    public RueVo getRueVo() {
        return rueVo;
    }

    public void setRueVo(RueVo rueVo) {
        this.rueVo = rueVo;
    }

}
