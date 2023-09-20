package com.example.pokedex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Pokémon duplicado! Jà existe um Pokémon com esse nome.")
public class PokemonDuplicadoException extends Exception {
    public PokemonDuplicadoException() {
        super();
    }

    public PokemonDuplicadoException(String message) {
        super();
    }
}
