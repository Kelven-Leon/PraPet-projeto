package com.example.petservices.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Consulta extends Agendamento {
    private String veterinario;
    private LocalDate data;
    private LocalTime hora;

    @ManyToOne
    private Pet pet;

    @ManyToOne
    private Localizacao localizacao;

    public Consulta(Long id, String local, LocalDate data, String tipoDeServico,
                    String veterinario, LocalDate dataConsulta, LocalTime hora, Pet pet, Localizacao localizacao) {
        super(id, local, null, tipoDeServico);
        this.veterinario = veterinario;
        this.data = dataConsulta;
        this.hora = hora;
        this.pet = pet;
        this.localizacao = localizacao;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getData() {
        LocalDateTime dataHora = null;
        return dataHora;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}

