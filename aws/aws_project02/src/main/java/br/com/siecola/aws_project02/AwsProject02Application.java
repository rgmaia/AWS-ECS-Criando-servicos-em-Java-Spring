package br.com.siecola.aws_project02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// https://www.baeldung.com/spring-boot-failed-to-configure-data-source
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AwsProject02Application {

	public static void main(String[] args) {
		SpringApplication.run(AwsProject02Application.class, args);
	}

}
