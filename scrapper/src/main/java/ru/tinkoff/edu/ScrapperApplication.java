package ru.tinkoff.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.tinkoff.edu.client.BotClient;
import ru.tinkoff.edu.client.StackOverflowClient;
import ru.tinkoff.edu.config.ApplicationConfig;

import java.net.URISyntaxException;
import java.sql.Date;
import java.sql.Timestamp;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(ApplicationConfig.class)
public class ScrapperApplication {
public static void main(String[] args) throws URISyntaxException {
        var ctx = SpringApplication.run(ScrapperApplication.class, args);
        //ApplicationConfig config = ctx.getBean(ApplicationConfig.class);
        //System.out.println(config);
        //new BotClient().updateLink();
        System.out.println(new Timestamp(System.currentTimeMillis()));
        }
        }