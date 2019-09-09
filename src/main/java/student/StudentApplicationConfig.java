package student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"student","student.rest.*","aspect*"})
public class StudentApplicationConfig {

	public static void main(String[] args) {
		System.out.println("Starting application");
		SpringApplication.run(StudentApplicationConfig.class, args);
	}
}
