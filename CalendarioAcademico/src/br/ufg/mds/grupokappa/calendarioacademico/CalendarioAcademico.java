/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.mds.grupokappa.calendarioacademico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sofia
 */
public class CalendarioAcademico {
    
    private final List<Evento> listaDeEventos = new ArrayList<>();
    
    public void addEvento (Evento e) {
        listaDeEventos.add(e);
    }

    public List<Evento> getListaDeEventos() {
        return listaDeEventos;
    }
    
}
