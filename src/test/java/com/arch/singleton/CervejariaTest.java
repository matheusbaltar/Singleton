package com.arch.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CervejariaTest {

    @Test
    public void DeveretornarNomeCervejaria(){
        Cervejaria.getInstance().setNomeCervejaria("Brew Berg");
        assertEquals("Brew Berg", Cervejaria.getInstance().getNomeCervejaria());
    }

    @Test
    public void DeveRetornarloteAtual(){
        Cervejaria.getInstance().setLoteAtual("b0431");
        assertEquals("b0431", Cervejaria.getInstance().getLoteAtual());
    }

    @Test
    public void DeveRetornarResponsavelTecnico(){
        Cervejaria.getInstance().setResponsavelTecnico("Matheus Baltar");
        assertEquals("Matheus Baltar", Cervejaria.getInstance().getResponsavelTecnico());
    }
}
