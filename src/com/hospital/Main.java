package com.hospital;

import com.hospital.dominio.*;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Quarto quarto1 = new Quarto(15, true, QuartoTipo.ISOLAMENTO);
        Quarto quarto2 = new Quarto(25, true, QuartoTipo.COLETIVO);
        Quarto quarto3 = new Quarto(23, true, QuartoTipo.OBSFEMININA);
        Quarto quarto4 = new Quarto(12, true, QuartoTipo.OBSMASCULNA);

        Paciente paciente1 = new Paciente("Hudson", LocalDate.of(1993, Month.JUNE, 5),
                "47.268.255.6", EstadoCivilTipo.SOLTEIRO, "36645588",
                "hudson_pitrono@oo.com.br", SexoTipo.MASCULINO);

        Paciente paciente2 = new Paciente("Deuteronomio", LocalDate.of(815, Month.DECEMBER, 30),
                "48.884.285.5", EstadoCivilTipo.SOLTEIRO, "36645588",
                "deuteronomio_Rafo@hotmail.com.br", SexoTipo.MASCULINO);

        Internacao.atribuirQuartos(quarto1);
        Internacao.atribuirQuartos(quarto2);
        Internacao.atribuirQuartos(quarto3);
        Internacao.atribuirQuartos(quarto4);

        Internacao.fazerInternacao(quarto1,paciente1);
        Internacao.altaHospitalar(quarto1);
        Internacao.fazerInternacao(quarto1,paciente2);

    }
}
