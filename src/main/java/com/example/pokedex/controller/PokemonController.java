package com.example.pokedex.controller;

import com.example.pokedex.model.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PokemonController {

    @GetMapping("/")
    public String pokedex() {
        return "pokedex";
    }

    @PostMapping("/")
    public void criaPokemon(Pokemon pokemon) {
        System.out.println("O novo pokemon é: " + pokemon.getNome());
    }
}
