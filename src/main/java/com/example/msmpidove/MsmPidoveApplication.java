package com.example.msmpidove;

import com.example.msmpidove.utils.PropertiesUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsmPidoveApplication {

	public static void main(String[] args) {
		PropertiesUtils.loadByDotEnv();
		SpringApplication.run(MsmPidoveApplication.class, args);
	}

}
