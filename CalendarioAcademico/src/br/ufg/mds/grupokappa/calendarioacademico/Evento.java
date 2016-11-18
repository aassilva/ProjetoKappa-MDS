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

    private final String NomeEvento;
    private final Date DataInicio;
    private final Date DataFim;
    private final String TipoEvento;
    private final int Regional;

    public Evento(String NomeEvento, Date DataInicio, Date DataFim,
            String TipoEvento, int Regional) {
        this.NomeEvento = NomeEvento;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
        this.TipoEvento = TipoEvento;
        this.Regional = Regional;
    }

    public String getNomeEvento() {
        return NomeEvento;
    }

    public String getDataInicio() {
        return df.format(DataInicio);
    }

    public String getDataFim() {
        return df.format(DataFim);
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public String getRegional() {
        switch (Regional) {
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
