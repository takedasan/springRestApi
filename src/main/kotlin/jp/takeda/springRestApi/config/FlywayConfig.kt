package jp.takeda.springRestApi.config

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayConfig {

    @Bean
    fun strategy(): FlywayMigrationStrategy {
        return CustomFlywayMigrationStrategy()
    }
}
