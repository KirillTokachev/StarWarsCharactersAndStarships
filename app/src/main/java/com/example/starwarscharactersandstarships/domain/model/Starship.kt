package com.example.starwarscharactersandstarships.domain.model

data class Starship(
    val id: Int,
    val name: String,
    val model: String,
    val passengers: String,
    val film: Film
)
