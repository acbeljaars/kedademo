package com.example.kedademo

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MetricsConfig {

    @Bean
    fun endPointMetrics(registry: MeterRegistry):
            EndpointMetrics {
                return EndpointMetrics(registry)
    }

}