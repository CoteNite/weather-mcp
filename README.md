# Weather-MCP

由于之前开发的小项目中需要用到天气查询的agent，因此就针对和风天气的Api写了一个

再然后就想着能不能拆成一个单独的MCP，就有了这个项目

**和风天气开发文档：https://dev.qweather.com/docs/api/geoapi/**

## 使用教程

根据和风天气的文档修改yml文件里的配置内容(本项目使用的为官方推荐的JWT模式)

```yaml
weather:
  base-url: ${weather.base-url}
  sk: ${weather.sk}
  kid: ${weather.kid}
  sub: ${weather.sub}
```

为了方便使用，因此是根据给到的城市名称查询


