package com.code.app.config;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class DataSourceProxyConfig {
	
//	@ConfigurationProperties(prefix = "spring.datasource.druid")
//	public DataSource druidDataSource() {
//		DruidDataSource druidDataSource = new DruidDataSource();
//		return druidDataSource;
//	}
//
//	@Primary
//	@Bean("dataSource")
//	public DataSourceProxy dataSource(DataSource druidDataSource) {
//		return new DataSourceProxy(druidDataSource);
//	}

//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy) throws Exception {
//		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//		factoryBean.setDataSource(dataSourceProxy);
////		factoryBean
////				.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/*.xml"));
//		return factoryBean.getObject();
//	}
//
//	/**
//	 * @param sqlSessionFactory
//	 *            SqlSessionFactory
//	 * @return SqlSessionTemplate
//	 */
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
}
