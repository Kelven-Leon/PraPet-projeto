package com.example.petservices.Service;

import com.example.petservices.Models.Localizacao;
import com.example.petservices.Repositories.LocalizacaoRepository;
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

