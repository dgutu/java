package spring.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GdSpringAccessingDataJpaFlywayApplication {

	private static final Logger log = LoggerFactory
			.getLogger(GdSpringAccessingDataJpaFlywayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GdSpringAccessingDataJpaFlywayApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> { 
			repository.save(new User("admin", 0));
			repository.save(new User("gda", 0));
			repository.save(new User("dgutu", 0));			
			
			log.info("get all users ...");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			
			log.info("get user by name");
			for (User user : repository.findByName("admin")) {
				log.info(user.toString());
			}
			
			
		}; 
	}

}
