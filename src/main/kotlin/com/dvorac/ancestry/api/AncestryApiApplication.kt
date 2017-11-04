package com.dvorac.ancestry.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AncestryApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(AncestryApiApplication::class.java, *args)
}
