package com.example.squash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SquashApplication

fun main(args: Array<String>) {
	runApplication<SquashApplication>(*args)
}
