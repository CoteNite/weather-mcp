package cn.example.weathermcp.client.api.rsp

import com.squareup.moshi.Json

/**
 * @Author  RichardYoung
 * @Description
 * @Date  2025/4/17 02:38
 */
data class GeoResponse(
    @Json(name = "code") val code: String,
    @Json(name = "location") val location: MutableList<Location>,
    @Json(name = "refer") val refer: Refer
)

data class Location(
    @Json(name = "name") val name: String,
    @Json(name = "id") val id: String,
    @Json(name = "lat") val lat: String,
    @Json(name = "lon") val lon: String,
    @Json(name = "adm2") val adm2: String,
    @Json(name = "adm1") val adm1: String,
    @Json(name = "country") val country: String,
    @Json(name = "tz") val tz: String,
    @Json(name = "utcOffset") val utcOffset: String,
    @Json(name = "isDst") val isDst: String,
    @Json(name = "type") val type: String,
    @Json(name = "rank") val rank: String,
    @Json(name = "fxLink") val fxLink: String
)

