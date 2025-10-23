package com.larchflap.pet_service

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<PetProjectApplication>().with(TestcontainersConfiguration::class).run(*args)
}
