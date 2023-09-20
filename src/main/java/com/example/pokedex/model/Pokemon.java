package com.example.pokedex.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true)
    String nome;

    @Column(nullable = false)
    String tipo;

    @Column(nullable = false)
    List<String> evolucoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getEvolucoes() {
        return evolucoes;
    }

    public void setEvolucoes(List<String> evolucoes) {
        this.evolucoes = evolucoes;
    }
}
