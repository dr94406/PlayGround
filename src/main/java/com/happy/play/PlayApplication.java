package com.happy.play;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.happy.play.mapper")
@SpringBootApplication
public class PlayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayApplication.class, args);
	}

}
