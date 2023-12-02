package org.example.springjdbirepositoryissue;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.spring5.EnableJdbiRepositories;
import org.jdbi.v3.spring5.SpringConnectionFactory;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@EnableJdbiRepositories
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    public Jdbi jdbi(DataSource ds) {
        Jdbi jdbi = Jdbi.create(new SpringConnectionFactory(ds));
        jdbi.installPlugin(new SqlObjectPlugin());
        return jdbi;
    }
}
