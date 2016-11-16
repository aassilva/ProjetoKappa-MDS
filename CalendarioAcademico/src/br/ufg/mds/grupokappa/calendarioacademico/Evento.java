/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.mds.grupokappa.calendarioacademico;

/**
 *
 * @author sofia
 */
public class Evento {

    private final String NomeEvento;
    private final String DataInicio;
    private final String DataFim;
    private final String TipoEvento;
    private final String Regional;

    public Evento(String NomeEvento, String DataInicio, String DataFim, 
            String TipoEvento, String Regional) {
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
        return DataInicio;
    }

    public String getDataFim() {
        return DataFim;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public String getRegional() {
        return Regional;
    }
    
    

}
