package cn.example.weathermcp.client.api.rsp

import com.squareup.moshi.Json

/**
 * @Author  RichardYoung
 * @Description
 * @Date  2025/4/17 02:40
 */
data class Refer(
    @Json(name = "sources") val sources: List<String>?,
    @Json(name = "license") val license: List<String>?
)

