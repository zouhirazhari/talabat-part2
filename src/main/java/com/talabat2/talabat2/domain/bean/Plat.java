/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ASUS
 */
@Entity
public class Plat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String reference_plat;
    @OneToMany(mappedBy = "plat")
    private List<PlatRestaurant> platRestaurants;

    public Plat() {
    }

    public Plat(Long id, String nom, String reference_plat) {
        this.id = id;
        this.nom = nom;
        this.reference_plat = reference_plat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference_plat() {
        return reference_plat;
    }

    public void setReference_plat(String reference_plat) {
        this.reference_plat = reference_plat;
    }

    public List<PlatRestaurant> getPlatRestaurants() {
        return platRestaurants;
    }

    public void setPlatRestaurants(List<PlatRestaurant> platRestaurants) {
        this.platRestaurants = platRestaurants;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plat)) {
            return false;
        }
        Plat other = (Plat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.talabat.bean.Plat[ id=" + id + " ]";
    }

}
