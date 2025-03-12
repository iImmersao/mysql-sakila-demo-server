package com.iimmersao.mysql_sakila_demo_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.iimmersao.mysql_sakila_demo_server")
public class MysqlSakilaDemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlSakilaDemoServerApplication.class, args);
	}

}
