# Simple CRUD RESTful API

A simple project with Spring Boot, emulating the virtual encyclopedia that holds all species of pokemon, also known as pokedex.

## Usage

### Create
`curl -v -X POST https://pokedex-emqi.onrender.com/pokemons -H 'Content-Type: application/json' -d '{"nome":"Charmander", "tipo":"fire", "evolucoes":["Charmeleon", "Charizard"]}'`
### Read
To list all:
`curl -v https://https://pokedex-l61o.onrender.com/pokemons`

To list by ID:
`curl -v https://https://pokedex-l61o.onrender.com/pokemons/1`
### Update
`curl -v -X PUT https://pokedex-emqi.onrender.com/pokemons/2 -H 'Content-Type: application/json' -d '{"nome":"Bulbasaur", "tipo":"grass", "evolucoes":["Ivysaur", "Venusaur"]}'`
### Delete
`curl -v -X DELETE https://https://pokedex-l61o.onrender.com/pokemons/1`
