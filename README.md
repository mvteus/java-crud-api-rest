# Simple CRUD API RESTful

A simple project with Spring Boot, emulating the virtual encyclopedia that holds all species of pokemon, also known as pokedex.

## Usage

### Create
`curl -v -X POST`
### Read
To list all:
`curl -v https://https://pokedex-l61o.onrender.com/pokemons`

To list by ID:
`curl -v https://https://pokedex-l61o.onrender.com/pokemons/1`
### Update
`curl -v -X PUT`
### Delete
`curl -v -X DELETE https://https://pokedex-l61o.onrender.com/pokemons/1`