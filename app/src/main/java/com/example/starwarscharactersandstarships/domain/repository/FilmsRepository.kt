package com.example.starwarscharactersandstarships.domain.repository

import com.example.starwarscharactersandstarships.domain.model.Film

interface FilmsRepository {

   suspend fun loadFilms(): List<Film>

   suspend fun saveFilm(film: Film)
}