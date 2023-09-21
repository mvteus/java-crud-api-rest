package com.example.pokedex.controller;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/pokemons")
public class PokedexController {

    @Autowired
    PokemonService pokemonService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pokemon criarPokemon(@RequestBody Pokemon pokemon) throws Exception {
        return pokemonService.criarPokemon(pokemon);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Pokemon> listarPokemon() {
        return pokemonService.listarPokemons();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Pokemon> listarPokemonById(@PathVariable(value = "id") Long id) throws Exception {
        return pokemonService.buscarPokemonById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Pokemon> atualizarPokemon(@PathVariable(value = "id") Long id, @RequestBody Pokemon pokemon) {
        return pokemonService.atualizarPokemonById(pokemon, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> excluirPokemon(@PathVariable(value = "id") Long id) {
        return pokemonService.excluirPokemonById(id);
    }
}
