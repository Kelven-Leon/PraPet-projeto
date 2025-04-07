package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
