# Html2Pdf

利用Freemarker和IText生成Pdf文件

目录结构：

libs：依赖包
│─ flying-saucer-xxx：css识别相关
│─ freemarker-xxx：数据模板引擎
│─ IText-xxx：生成PDF
  
resources：存放ftl模板文件、字体资源文件和生成的pdf文件

src/entity/Item：数据实体，用于填充模板

src/utils/FreemarketConfigUtil.java：配置FreeMarker

src/utils/GenerateUtil.java：Pdf生成类


解决无法显示中文的问题：
1. 使用本地字体资源。
2. 模板文件中添加font-family: SimSun;说明。
3. 字体资源文件可根据需要更改，但要注意在模板文件中添加相应的字体说明。

注：IText商用需要购买许可license。

