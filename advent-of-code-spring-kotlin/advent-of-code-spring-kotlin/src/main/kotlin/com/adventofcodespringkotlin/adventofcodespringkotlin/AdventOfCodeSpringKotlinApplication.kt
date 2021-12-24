package com.adventofcodespringkotlin.adventofcodespringkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdventOfCodeSpringKotlinApplication

fun main(args: Array<String>) {
	runApplication<AdventOfCodeSpringKotlinApplication>(*args)

	val path = System.getProperty("user.dir")

	println("Working Directory = $path")
}
