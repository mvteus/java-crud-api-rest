package com.example.pokedex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Pokémon não encontrado na base de dados.")
public class PokemonNaoEncontradoException extends Exception {

    public PokemonNaoEncontradoException() {
        super();
    }

    public PokemonNaoEncontradoException(Long message) {
        super();
    }
}
