package com.example.petservices.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String local;
    private LocalDateTime dataHora;

    private String tipoDeServico;

    public Agendamento(Long id, String local, LocalDateTime data, String tipoDeServico) {
        this.id = id;
        this.local = local;
        this.dataHora = dataHora;
        this.tipoDeServico = tipoDeServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return dataHora;
    }

    public void setData(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }
}

