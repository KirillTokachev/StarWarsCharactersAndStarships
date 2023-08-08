package com.example.starwarscharactersandstarships.domain.repository

import com.example.starwarscharactersandstarships.domain.model.Character

interface CharacterRepository {

    suspend fun loadCharacters(): List<Character>

    suspend fun saveCharacter(character: Character)
}