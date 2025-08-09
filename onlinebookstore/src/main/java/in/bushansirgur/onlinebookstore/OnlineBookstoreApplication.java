package in.bushansirgur.onlinebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("in.bushansirgur.onlinebookstore.entity")
@EnableJpaRepositories("in.bushansirgur.onlinebookstore.repository")
public class OnlineBookstoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineBookstoreApplication.class, args);
    }
} 