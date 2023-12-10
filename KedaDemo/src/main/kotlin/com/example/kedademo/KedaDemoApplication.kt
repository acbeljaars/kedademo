package com.example.kedademo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class KedaDemoApplication @Autowired constructor(private val endpointMetrics: EndpointMetrics) {
    @GetMapping("/home")
    fun index(): String {
        endpointMetrics.incrementEndPointHits()
        return "Spring Application is Running...endpoint is hit!"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(KedaDemoApplication::class.java, *args)
        }
    }
}