package com.example.petservices.Service;

import com.example.petservices.Models.Agendamento;
import com.example.petservices.Repositories.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    // Salvar um novo agendamento
    public Agendamento salvarAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    // Listar todos os agendamentos
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    // Buscar agendamento por ID
    public Agendamento buscarPorId(Long id) {
        Optional<Agendamento> agendamento = agendamentoRepository.findById(id);
        return agendamento.orElse(null); // Retorna null se não encontrar
    }

    // Atualizar um agendamento
    public Agendamento atualizarAgendamento(Long id, Agendamento agendamentoAtualizado) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoAtualizado.setId(id);
            return agendamentoRepository.save(agendamentoAtualizado);
        }
        return null; // Retorna null se não encontrar o agendamento
    }

    // Deletar um agendamento
    public void deletarAgendamento(Long id) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoRepository.deleteById(id);
        }
    }
}

