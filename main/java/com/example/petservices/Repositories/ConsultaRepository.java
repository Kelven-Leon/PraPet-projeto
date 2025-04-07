package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    // Métodos customizados para Consulta
}
