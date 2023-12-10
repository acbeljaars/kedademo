package com.example.kedademo

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.stereotype.Component

@Component
class EndpointMetrics(registry: MeterRegistry) {

    val endpointHitsCounter: Counter =
        Counter
            .builder("endpoint_hits")
            .description("Total number of hits on my endpoint")
            .register(registry)

    fun incrementEndPointHits(){
        endpointHitsCounter.increment()
    }
}