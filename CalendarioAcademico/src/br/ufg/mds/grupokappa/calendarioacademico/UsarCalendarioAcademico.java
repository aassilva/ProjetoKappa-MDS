/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.mds.grupokappa.calendarioacademico;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class UsarCalendarioAcademico {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        CalendarioAcademico ufg = new CalendarioAcademico();

        int op;

        do {
            System.out.println("\n op 1 - Adicionar evento"
                    + "\n op 2 - Exibir Eventos"
                    + "\n op 3 - Sair");
            op = Integer.parseInt(ler.nextLine());

            switch (op) {
                case 1:
                    System.out.println("\nInsira o Nome do evento");
                    String nomeEvento = ler.nextLine();
                    System.out.println("Insira a data de Inicio");
                    String dataInicio = ler.nextLine();
                    System.out.println("Insira a data de encerramento");
                    String dataFim = ler.nextLine();
                    System.out.println("Insira o tipo de evento");
                    String tipoEvento = ler.nextLine();
                    System.out.println("Insira a regional");
                    String regional = ler.nextLine();

                    Evento teste = new Evento(nomeEvento, dataInicio, dataFim, tipoEvento,
                            regional);

                    ufg.addEvento(teste);
                    break;

                case 2:
                    System.out.println("\nEvento(s) Adicionado(s):\n");
                    ufg.getListaDeEventos().stream().forEach((e) -> {
                        exibireventos(e);
                    });
                    break;
                default:
                    System.out.println("Programa encerrado");
                    break;
            }

        } while (op != 3);

        System.exit(0);
    }

    public static void exibireventos(Evento teste) {
        System.out.println("Nome do Evento: " + teste.getNomeEvento());
        System.out.println("-------------------------");
        System.out.println("Data Inicio: " + teste.getDataInicio());
        System.out.println("Data FIm: " + teste.getDataFim());
        System.out.println("Tipo do Evento: " + teste.getTipoEvento());
        System.out.println("Regional: " + teste.getRegional() + "\n");
    }

}
