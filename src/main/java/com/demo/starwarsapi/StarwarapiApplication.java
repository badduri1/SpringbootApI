package com.demo.starwarsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

/**
 * @author Srinivas
 */

@SpringBootApplication
public class StarwarapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarwarapiApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add("user-agent", "springboot");
			return execution.execute(request, body);
		};
		return restTemplateBuilder.additionalInterceptors(interceptor).build();
	}

}
