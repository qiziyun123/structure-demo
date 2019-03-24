package com.qizy.dynimaticds.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis多数据源配置类
 */
@Configuration
@MapperScan("com.qizy.dynimaticds.dao.mapper")
public class DataSourceConfig {

	/**
	  * 默认数据源
	 */
	@Bean(name = "dataSourceDefault")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSourceDefault() {
		return DataSourceBuilder.create().build();
	}
}
