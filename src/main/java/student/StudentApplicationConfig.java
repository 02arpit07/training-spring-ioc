package student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAspectJAutoProxy
@EnableJpaRepositories("orm")
@EnableAutoConfiguration
@EntityScan("orm")
@SpringBootApplication(scanBasePackages = {"student", "orm", "aspect*"})
public class StudentApplicationConfig {

    public static void main(String[] args) {
        System.out.println("Starting application");
        SpringApplication.run(StudentApplicationConfig.class, args);

    }


}
