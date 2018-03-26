package utils;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import freemarker.template.Configuration;

public class FreemarketConfigUtil {
    /*
     * 懒汉式单例
     */
    private static Configuration configuration;

    public static synchronized Configuration getInstance() {
        if (null == configuration) {
            configuration = new Configuration();
            try {
                configuration.setDirectoryForTemplateLoading(new File(GenerateUtil.PATH)); // 配置加载模板路径
            } catch (IOException e) {
                e.printStackTrace();
            }
            configuration.setEncoding(Locale.CHINA, "utf-8");
        }
        return configuration;
    }
}
