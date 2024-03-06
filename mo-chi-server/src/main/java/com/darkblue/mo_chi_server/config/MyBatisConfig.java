package com.darkblue.mo_chi_server.config;

import com.github.pagehelper.PageHelper;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.darkblue.mo_chi_server.mapper")
public class MyBatisConfig {
}
