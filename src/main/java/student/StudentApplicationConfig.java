package student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "student")
public class StudentApplicationConfig {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplicationConfig.class, args);
	}
}
