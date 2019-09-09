package aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class NewAspect {

    @Before("execution(* student.rest.RegistrationController.register(..))")
    public void myFirstAOPMethod(JoinPoint joinPoint){

        System.out.println("Printing from AOP class");

    }

}
