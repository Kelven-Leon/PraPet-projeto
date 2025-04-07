package br.com.PojetoPraPets.Service;

import br.com.PojetoPraPets.Models.Pet;
import br.com.PojetoPraPets.Repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private PetRepository petRepository;

    public Pet salvarPet(Pet pet) {
        return petRepository.save(pet);
    }
    public List<Pet> listarPets() {
        return petRepository.findAll();
    }
    public Optional<Pet> obterPetPorId(Long id) {
        return petRepository.findById(id);
    }
    public void deletarPet(Long id) {
        petRepository.deleteById(id);
    }
}
