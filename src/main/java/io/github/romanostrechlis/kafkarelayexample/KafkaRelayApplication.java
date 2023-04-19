package io.github.romanostrechlis.kafkarelayexample;

import io.github.romanostrechlis.kafkarelay.transform.ITransformKafkaMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.github.romanostrechlis.kafkarelay")
public class KafkaRelayApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaRelayApplication.class, args);
	}

	@Bean
	public ITransformKafkaMessage transformer() {
		return new CustomKafkaMessageTransformer();
	}
}
