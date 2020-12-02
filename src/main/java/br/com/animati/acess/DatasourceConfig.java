package br.com.animati.acess;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DatasourceConfig {
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://app-saude.cdlbiu9qdeho.sa-east-1.rds.amazonaws.com/postgres")
                .username("postgres")
                .password("PlataformaSaude123")
                .build();
    }

}
