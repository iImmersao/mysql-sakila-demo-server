package com.iimmersao.mysql_sakila_demo_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MysqlSakilaDemoServerApplicationTests {

	@Test
	void contextLoads() {
	}

}
