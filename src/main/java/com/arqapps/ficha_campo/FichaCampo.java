package com.arqapps.ficha_campo;

import com.arqapps.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class FichaCampo extends BaseEntity {
    private String muestra;
    private String origenRoca;
    private String unidadGeologica;
    private String contactoGeologico;

    public FichaCampo() { super(); }

    public FichaCampo(String muestra, String origenRoca, String unidadGeologica, String contactoGeologico) {
        this.muestra = muestra;
        this.origenRoca = origenRoca;
        this.unidadGeologica = unidadGeologica;
        this.contactoGeologico = contactoGeologico;
    }

    public String getMuestra() {
        return muestra;
    }

    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }

    public String getOrigenRoca() {
        return origenRoca;
    }

    public void setOrigenRoca(String origenRoca) {
        this.origenRoca = origenRoca;
    }

    public String getUnidadGeologica() {
        return unidadGeologica;
    }

    public void setUnidadGeologica(String unidadGeologica) {
        this.unidadGeologica = unidadGeologica;
    }

    public String getContactoGeologico() {
        return contactoGeologico;
    }

    public void setContactoGeologico(String contactoGeologico) {
        this.contactoGeologico = contactoGeologico;
    }
}