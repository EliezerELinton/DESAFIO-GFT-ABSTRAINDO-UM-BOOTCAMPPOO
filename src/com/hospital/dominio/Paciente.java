package com.hospital.dominio;
import java.time.LocalDate;

public class Paciente {
    private String nome;
    private LocalDate dataNascimento;
    private String documento;
    private EstadoCivilTipo estadoCivilTipo;
    private String telefone;
    private String email;
    private SexoTipo sexo;


    public Paciente(String nome, LocalDate dataNascimento, String documento, EstadoCivilTipo estadoCivilTipo, String telefone, String email, SexoTipo sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.estadoCivilTipo = estadoCivilTipo;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public EstadoCivilTipo getEstadoCivilTipo() {
        return estadoCivilTipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public SexoTipo getSexo() {
        return sexo;
    }
}
