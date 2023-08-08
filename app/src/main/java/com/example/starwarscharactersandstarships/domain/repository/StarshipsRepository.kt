package com.example.starwarscharactersandstarships.domain.repository

import com.example.starwarscharactersandstarships.domain.model.Starship

interface StarshipsRepository {

    suspend fun loadStarships(): List<Starship>

    suspend fun saveStarship(starship: Starship)
}