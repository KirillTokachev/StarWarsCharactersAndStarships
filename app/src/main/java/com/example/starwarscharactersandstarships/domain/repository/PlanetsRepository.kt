package com.example.starwarscharactersandstarships.domain.repository

import com.example.starwarscharactersandstarships.domain.model.Planet

interface PlanetsRepository {

    suspend fun loadPlanets(): List<Planet>

    suspend fun savePlanet(planet: Planet)
}