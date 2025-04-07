package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
    // Métodos customizados para Localizacao
}
