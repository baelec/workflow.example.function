package io.ravencrest.workflow.app;

import io.ravencrest.workflow.api.Registration;
import io.ravencrest.workflow.api.SchemaResult;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class Client {
	public static void main(String[] args) throws Exception {
		final var registerClient = RestClient.builder()
				.requestFactory(new SimpleClientHttpRequestFactory())
				.baseUrl("http://localhost:8080/register")
				.defaultHeaders(headers -> {
					headers.add("Accept", "application/json");
					headers.add("Content-Type", "application/json");
				})
				.build();

		final var schemaClient = RestClient.builder()
				.requestFactory(new SimpleClientHttpRequestFactory())
				.baseUrl("http://localhost:8080/schema")
				.defaultHeaders(headers -> {
					headers.add("Accept", "application/json");
				})
				.build();

		final var notExposedClient = RestClient.builder()
				.requestFactory(new SimpleClientHttpRequestFactory())
				.baseUrl("http://localhost:8080/expose")
				.build();


		final var registerResponse = registerClient.get().retrieve().body(Registration.class);
		System.out.println(registerResponse);

		final var schemaResponse = schemaClient.get().retrieve().body(SchemaResult.class);
		System.out.println(schemaResponse);

		final var notExposedResponse = notExposedClient.get().retrieve().body(String.class);
		System.out.println(notExposedResponse);
	}
}