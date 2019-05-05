package com.example1.bootdemo.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author ChinaSofti999
 * @create 2018-11-13 12:34
 * @desc SqlSessionFactory配置
 **/
@Configuration
public class SqlSessionFactoryConfiguration {

    @Autowired
    private DataSource dataSource;


    @Value("${mybatis.mapper_path}")
    private String mapperPath;


    @Value("${mybatis.config_file}")
    private String mybatisPath;

    @Value("${mybatis.domain_package}")
    private String domainPackage;


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean getSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setConfigLocation(new ClassPathResource(mybatisPath));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packagePath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        factoryBean.setMapperLocations(resolver.getResources(packagePath));
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage(domainPackage);
        return factoryBean;
    }
}
