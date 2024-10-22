package se.bahram.ai.spring_ai_and_vector_database;

import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringAiAndVectorDatabaseApplication implements CommandLineRunner {

	private final VectorStore vectorStore;

    public SpringAiAndVectorDatabaseApplication(VectorStore vectorStore) {
        this.vectorStore = vectorStore;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringAiAndVectorDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*vectorStore.add(
				List.of(
						new Document("Spring AI rocks!! Spring AI rocks!! Spring AI rocks!! Spring AI rocks!! Spring AI rocks!!", Map.of("meta1", "meta1")),
						new Document("The World is Big and Salvation Lurks Around the Corner"),
						new Document("You walk forward facing the past and you turn back toward the future.", Map.of("meta2", "meta2"))
				)
		);*/

		vectorStore.similaritySearch("we are walking to the past and future is mine")
				.forEach(System.out::println);
	}
}
