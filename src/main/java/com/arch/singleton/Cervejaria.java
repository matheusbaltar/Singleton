package com.arch.singleton;

public class Cervejaria {

    private static Cervejaria instance = new Cervejaria();
    private Cervejaria() {}
    public static Cervejaria getInstance() {
        return instance;
    }

    private String nomeCervejaria;
    private String loteAtual;
    private String responsavelTecnico;

    public String getNomeCervejaria() {
        return nomeCervejaria;
    }
    public void setNomeCervejaria(String nomeCervejaria) {
        this.nomeCervejaria = nomeCervejaria;
    }

    public String getLoteAtual() {
        return loteAtual;
    }
    public void setLoteAtual(String loteAtual) {
        this.loteAtual = loteAtual;
    }

    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }
    public void setResponsavelTecnico(String responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }
}
