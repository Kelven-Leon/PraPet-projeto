package br.com.PojetoPraPets.Service;


import br.com.PojetoPraPets.Models.Consulta;
import br.com.PojetoPraPets.Repositories.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    private ConsultaRepository consultaRepository;

    public Consulta salvarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }

    public Optional<Consulta> obterConsultaPorId(Long id) {
        return consultaRepository.findById(id);
    }

    public void deletarConsulta(Long id) {
        consultaRepository.deleteById(id);
    }
}
