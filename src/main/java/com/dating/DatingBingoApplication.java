package com.dating;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DatingBingoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatingBingoApplication.class, args);

		log.info("############  Server is ready now !! ");
	}

}
