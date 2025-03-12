package com.iimmersao.mysql_sakila_demo_server;

import org.springframework.boot.SpringApplication;

public class TestMysqlSakilaDemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(MysqlSakilaDemoServerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
