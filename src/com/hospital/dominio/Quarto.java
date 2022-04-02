package com.hospital.dominio;

public class Quarto {
    private int numero;
    private boolean disponibilidade;
    private QuartoTipo quarto;
    private Paciente paciente;

    public Quarto(int numero, boolean disponibilidade, QuartoTipo quarto) {
        this.numero = numero;
        this.disponibilidade = disponibilidade;
        this.quarto = quarto;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public QuartoTipo getQuarto() {
        return quarto;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void entradaPaciente(Paciente paciente){
        this.paciente = paciente;
        this.disponibilidade = false;
    }
    public void saidaPaciente(){
        this.paciente = null;
        this.disponibilidade = true;
    }
}
