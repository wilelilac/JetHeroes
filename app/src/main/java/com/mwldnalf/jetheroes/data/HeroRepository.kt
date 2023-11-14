package com.mwldnalf.jetheroes.data

import com.mwldnalf.jetheroes.model.Hero
import com.mwldnalf.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}