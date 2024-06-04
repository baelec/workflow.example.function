package io.ravencrest.workflow.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"io.ravencrest.workflow.app", "io.ravencrest.workflow.external"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(
				Application.class
		);
	}
}
