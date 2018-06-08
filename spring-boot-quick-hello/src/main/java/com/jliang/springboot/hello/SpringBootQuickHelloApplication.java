package com.jliang.springboot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootQuickHelloApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(SpringBootQuickHelloApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQuickHelloApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... Strings) throws Exception{
		log.info("Start Testing");
		jdbcTemplate.execute("select * into \n" +
				"dbo.test_core_cfg \n" +
				"from [dbo].[RSI_CORE_CFGPROPERTY]");

	}
}
