package com.dvorac.ancestry.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HeroesController {
    @GetMapping("/heroes")
    fun getHeroes() : List<Hero> {
        return mutableListOf(Hero(11, "Bacon"), Hero(12, "Tom"), Hero(13, "Susan"))
    }
}