/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.mds.grupokappa.calendarioacademico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class UsarCalendarioAcademico {

    /**
     * @param args the command line arguments
     */
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
                    String nomeEvento = lerString("Insira o Nome do evento:");

                    Date dataInicio = lerDate("Insira a data de início: "
                            + "(FORMATO: DD/MM/AAAA)");

                    Date dataFim = lerDate("Insira a data de encerramento "
                            + "(FORMATO: DD/MM/AAAA):");

                    while (dataFim.compareTo(dataInicio) < 0) {
                        System.out.println("A data de encerramento não pode ser"
                                + " anterior à data de início");
                        dataFim = lerDate("Insira a data de encerramento: "
                                + "(FORMATO: DD/MM/AAAA)");
                    }

                    int regional = 0;
                    boolean flag = false;

                    while (!flag) {
                        opcoesRegionais();
                        try {
                            regional = Integer.parseInt(ler.nextLine());
                        } catch (NumberFormatException nfe) {
                        }

                        switch (regional) {
                            case 1:
                                flag = true;
                                break;
                            case 2:
                                flag = true;
                                break;
                            case 3:
                                flag = true;
                                break;
                            case 4:
                                flag = true;
                                break;
                            default:
                                System.out.println("Opção Inválida, "
                                        + "tente novamente:");
                                flag = false;
                        }
                    }

                    String descricaoEvento = lerString("Insira uma breve "
                            + "descrição para o evento:");

                    Evento novoEvento = new Evento(nomeEvento, dataInicio, 
                            dataFim, descricaoEvento, regional);

                    ufg.addEvento(novoEvento);
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
        System.out.println("Regional: " + teste.getRegional());
        System.out.println("Descrição do Evento: " + 
                teste.getDescricaoEvento());

    }

    public static String lerString(String mensagem) {
        String leitura = null;
        boolean flag = false;

        while (!flag) {

            try {
                Scanner leitor = new Scanner(System.in);
                System.out.println(mensagem);
                leitura = leitor.nextLine();

                checaEntradaNula(leitura);
                checaEntradaInvalida(leitura);
                flag = true;

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        return leitura;
    }

    public static Date lerDate(String mensagem) {
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);
        Date data = null;

        while (data == null) {
            try {

                System.out.println(mensagem);
                String dataString = ler.nextLine();
                data = formatoData.parse(dataString);

            } catch (ParseException pe) {
                System.out.println("Data Inserida Inválida, tente novamente:");
                data = null;
            }
        }

        return data;

    }

    private static void checaEntradaNula(String nome) {
        if (nome == null || "".equals(nome)) {
            throw new RuntimeException("A entrada não pode ser nula ou vazia, "
                    + "tente novamente:");
        }
    }

    private static void checaEntradaInvalida(String nome) {
        try {
            Float.parseFloat(nome);
            throw new RuntimeException("A entrada não pode ser número, "
                    + "tente novamente:");
        } catch (NumberFormatException excecao) { }
    }

    public static void opcoesRegionais() {
        System.out.println("Insira o codigo para escolher a regional "
                + "desejada: ");
        System.out.println("1 - Goiânia");
        System.out.println("2 - Catalão");
        System.out.println("3 - Goiás");
        System.out.println("4 - Jataí");

    }
}
