package cn.example.weathermcp.tool

import cn.example.nana.commons.aop.Slf4j.Companion.log
import cn.example.weathermcp.client.WeatherClient
import cn.example.weathermcp.client.api.rsp.WeatherResponse
import org.springframework.ai.tool.annotation.Tool
import org.springframework.stereotype.Service

/**
 * @Author  RichardYoung
 * @Description
 * @Date  2025/4/17 02:29
 */
@Service
class WeatherTool(
    private val weatherClient: WeatherClient
){


    /**
     * 根据城市名称获取城市天气情况
     * @param city 城市名称
     * @return WeatherResponse?
     */
    @Tool(description = "根据城市名称获取城市天气情况")
    fun getWeather(city: String): WeatherResponse? {
        val geo=weatherClient.getGeoId(city)
        if (geo==null){
            log.error("请求城市失败")
            throw RuntimeException("请求城市失败")
        }
        val response = weatherClient.getCurrentWeather(geo.location[0].id)
        return response
    }

}