package com.example.starwarscharactersandstarships.domain.model

data class Character(
    val id: Int,
    val name: String,
    val gender: String,
    val starships: Starship,
    val films: Film
)
