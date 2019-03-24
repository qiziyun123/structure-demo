package com.qizy.dynimaticds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * 使用exclude = {DataSourceAutoConfiguration.class}
 * 禁用springboot默认加载的application.properties单数据源配置
 */
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages="com.qizy.dynimaticds")
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
        app.run(args);

	}

}
