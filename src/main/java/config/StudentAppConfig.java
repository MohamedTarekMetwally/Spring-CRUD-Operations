package config;

import com.mysql.cj.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"controllers", "service","config","DAO","rowmapper","api"})
public class StudentAppConfig {

    @Bean
    InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(datSource());

        return jdbcTemplate;
    }

    @Bean
    public DataSource datSource(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();

        datasource.setUsername("root");
        datasource.setPassword(System.getenv("USER_NAME"));
        datasource.setUrl("jdbc:mysql://127.0.0.1:3306/managementschool?useSSL=false");
        datasource.setDriverClassName(Driver.class.getName()); //

        return datasource;
    }

}
