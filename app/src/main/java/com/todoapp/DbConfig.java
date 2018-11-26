package com.todoapp;

import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DbConfig {

    @Bean
    public DataSource getDatasource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mytest1?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        return dataSource;
    }
//
//    @Bean
//    public SessionFactory getSessionFactory() throws IOException {
//
//        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//        sessionFactoryBean.setPackagesToScan("com.todoapp");
//
////getHibernateProperties method is a private method
//
//        sessionFactoryBean.setHibernateProperties(getHibernateProperties());
//        sessionFactoryBean.setDataSource(getDatasource());
//        sessionFactoryBean.afterPropertiesSet();
//
//        return sessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public HibernateTransactionManager getTransactionManager() throws IOException {
//        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(getSessionFactory());
//
//        return transactionManager;
//    }
//
//
//    private static Properties getHibernateProperties() {
//
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
//        hibernateProperties.put("hibernate.show_sql", false);
//        // other properties
//
//        return hibernateProperties;
//    }
}