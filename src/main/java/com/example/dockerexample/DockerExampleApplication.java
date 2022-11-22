package com.example.dockerexample;

import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.Bean;
		import org.springframework.web.servlet.config.annotation.CorsRegistry;
		import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowCredentials(true)
//						.allowedOrigins("*") spring boot <version>2.2.4.RELEASE</version>
						.allowedOriginPatterns("*")
						.allowedMethods("*");
			}
		};
	}
}
