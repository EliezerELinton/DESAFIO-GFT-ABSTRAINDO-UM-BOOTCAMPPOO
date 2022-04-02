package com.hospital.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Internacao {

    private static List<Quarto> quartos = new ArrayList<Quarto>();

    public static void atribuirQuartos(Quarto quarto){
        quartos.add(quarto);
    }

    public static void fazerInternacao(Quarto quarto, Paciente paciente){
        for (Quarto q : quartos) {
            if (q.getNumero() == quarto.getNumero()){
                if (q.isDisponibilidade()){
                    q.entradaPaciente(paciente);
                    System.out.println("Entrada realizada com sucesso!");
                }else {
                    System.out.println("Quarto indisponível");
                }

            }

        }

    }
    public static void altaHospitalar(Quarto quarto){
        for (Quarto q : quartos){
            if (q.getNumero() == quarto.getNumero()) {
                q.saidaPaciente();
                System.out.println("Paciente Liberado");
            }
        }
    }

}
