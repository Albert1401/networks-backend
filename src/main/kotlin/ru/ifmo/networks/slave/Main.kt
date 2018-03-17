package ru.ifmo.networks.slave

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.ifmo.networks.common.configuration.AppConfig
import ru.ifmo.networks.common.handlers.HandlerWorker
import ru.ifmo.networks.master.MasterHandlerWorker


@SpringBootApplication(scanBasePackages = ["ru.ifmo.networks"])
class SlaveApplication


fun main(args: Array<String>) {
    AppConfig.isSlave = true
    runApplication<SlaveApplication>(*args)
}