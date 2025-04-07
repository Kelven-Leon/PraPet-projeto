package br.com.PojetoPraPets.Service;

import br.com.PojetoPraPets.Models.Vacina;
import br.com.PojetoPraPets.Repositories.VacinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacinaService {

    private VacinaRepository vacinaRepository;

    public Vacina salvarVacina(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    public List<Vacina> listarVacinas() {
        return vacinaRepository.findAll();
    }

    public Optional<Vacina> obterVacinaPorId(Long id) {
        return vacinaRepository.findById(id);
    }

    public void deletarVacina(Long id) {
        vacinaRepository.deleteById(id);
    }
}
