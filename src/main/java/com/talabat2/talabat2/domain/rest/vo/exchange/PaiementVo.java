/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo.exchange;

import java.util.Date;

/**
 *
 * @author wadie
 */
public class PaiementVo {
    private Long id;
    private String reference;
    private String montant;
    private Date date_de_paiment;
    private TypePaiementVo typePaiementVo;
    private CommandeVo commandeVo;

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

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Date getDate_de_paiment() {
        return date_de_paiment;
    }

    public void setDate_de_paiment(Date date_de_paiment) {
        this.date_de_paiment = date_de_paiment;
    }

    public TypePaiementVo getTypePaiementVo() {
        return typePaiementVo;
    }

    public void setTypePaiementVo(TypePaiementVo typePaiementVo) {
        this.typePaiementVo = typePaiementVo;
    }

    public CommandeVo getCommandeVo() {
        return commandeVo;
    }

    public void setCommandeVo(CommandeVo commandeVo) {
        this.commandeVo = commandeVo;
    }


    
}
