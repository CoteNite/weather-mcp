package cn.example.weathermcp.beans

import cn.example.weathermcp.client.WeatherClient
import cn.example.weathermcp.tool.WeatherTool
import org.springframework.ai.tool.ToolCallbackProvider
import org.springframework.ai.tool.method.MethodToolCallbackProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @Author  RichardYoung
 * @Description
 * @Date  2025/4/17 04:10
 */
@Configuration
class WeatherBean {

    @Bean
    fun weatherTools(weatherTool: WeatherTool): ToolCallbackProvider {
        return MethodToolCallbackProvider.builder().toolObjects(weatherTool).build()
    }

}