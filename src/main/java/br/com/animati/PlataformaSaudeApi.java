package br.com.animati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class})
public class PlataformaSaudeApi {

    public static void main(String[] args) {

        SpringApplication.run(PlataformaSaudeApi.class, args);
    }

}
