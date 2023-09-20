package com.example.pokedex.service;

import com.example.pokedex.exception.PokemonDuplicadoException;
import com.example.pokedex.exception.PokemonNaoEncontradoException;
import com.example.pokedex.model.Pokemon;
import com.example.pokedex.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public Pokemon criarPokemon(Pokemon pokemon) throws PokemonDuplicadoException {
        try {
            return pokemonRepository.save(pokemon);
        } catch (Exception e) {
            throw new PokemonDuplicadoException("Pokémon já existe!");
        }
    }

    public List<Pokemon> listarPokemons() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> buscarPokemonById(Long id) throws PokemonNaoEncontradoException {
        if (pokemonRepository.findById(id).isEmpty()) {
            throw new PokemonNaoEncontradoException(id);
        }
        return pokemonRepository.findById(id);
    }

    public ResponseEntity<Pokemon> atualizarPokemonById(Pokemon pokemon, Long id) {
        return pokemonRepository.findById(id).map(pokemonToUpdate -> {
            pokemonToUpdate.setNome(pokemon.getNome());
            pokemonToUpdate.setId(id);
            pokemonToUpdate.setEvolucoes(pokemon.getEvolucoes());
            pokemonToUpdate.setTipo(pokemon.getTipo());
            Pokemon updated = pokemonRepository.save(pokemonToUpdate);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> excluirPokemonById(Long id) {
        return pokemonRepository.findById(id).map(pokemonToDelete -> {
            pokemonRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
