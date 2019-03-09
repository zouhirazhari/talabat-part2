/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.bean;

import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ASUS
 */
@Entity
public class Ville implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomVille;
    @ManyToOne
    private Pays pays;
    @OneToMany(mappedBy = "ville")
    private List<Quartier> quartiers;

    public Ville() {
    }

    public Ville(Long id, String nomVille, Pays pays, List<Quartier> quartiers) {
        this.id = id;
        this.nomVille = nomVille;
        this.pays = pays;
        this.quartiers = quartiers;
    }

    public List<Quartier> getQuartiers() {
        return quartiers;
    }

    public void setQuartiers(List<Quartier> quartiers) {
        this.quartiers = quartiers;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public Pays getPays() {
        return pays;
    }

    @JsonSetter
    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.talabat.bean.Ville[ id=" + id + " ]";
    }

}
