package inc.temp.right.always.kafkaconsumermongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "inc.temp.right.always.kafkaconsumermongo.repositories")
public class KafkaConsumerMongoApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerMongoApplication.class, args);
	}
}
