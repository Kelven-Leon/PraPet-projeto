package br.com.PojetoPraPets.Service;

import br.com.PojetoPraPets.Models.Localizacao;
import br.com.PojetoPraPets.Repositories.LocalizacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalizacaoService {

    private LocalizacaoRepository localizacaoRepository;

    public Localizacao salvarLocalizacao(Localizacao localizacao) {
        return localizacaoRepository.save(localizacao);
    }

    public List<Localizacao> listarLocalizacoes() {
        return localizacaoRepository.findAll();
    }

    public Optional<Localizacao> obterLocalizacaoPorId(Long id) {
        return localizacaoRepository.findById(id);
    }

    public void deletarLocalizacao(Long id) {
        localizacaoRepository.deleteById(id);
    }
}
