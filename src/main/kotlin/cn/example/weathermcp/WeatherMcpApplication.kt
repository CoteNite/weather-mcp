package cn.example.weathermcp

import cn.example.weathermcp.client.WeatherClient
import org.springframework.ai.tool.ToolCallbackProvider
import org.springframework.ai.tool.method.MethodToolCallbackProvider
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class WeatherMcpApplication


fun main(args: Array<String>) {
    runApplication<WeatherMcpApplication>(*args)
}
