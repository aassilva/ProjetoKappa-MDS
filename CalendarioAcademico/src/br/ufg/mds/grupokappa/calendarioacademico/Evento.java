/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.mds.grupokappa.calendarioacademico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sofia
 */
public class Evento {

    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    private final String nomeEvento;
    private final Date dataInicio;
    private final Date dataFim;
    private final String descricaoEvento;
    private final int regional;

    public Evento(String nomeEvento, Date dataInicio, Date dataFim, 
            String descricaoEvento, int regional) {
        this.nomeEvento = nomeEvento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricaoEvento = descricaoEvento;
        this.regional = regional;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDataInicio() {
        return df.format(dataInicio);
    }

    public String getDataFim() {
        return df.format(dataFim);
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public String getRegional() {
        switch (regional) {
            case 1:
                return "Goiânia";
            case 2:
                return "Catalão";
            case 3:
                return "Goiás";
            case 4:
                return "Jataí";
            default:
                return null;
        }
    }

}
