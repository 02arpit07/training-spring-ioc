package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import student.domain.Gender;
import student.domain.Name;
import student.domain.Student;
import student.roll.Register;
import student.roll.Registration;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("student");

//		for (String name: applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}


		Student studentOne = new Student(new Name("Sandeep"));
		studentOne.setGender(Gender.MALE);
		applicationContext.getBean("registration", Registration.class).register(studentOne);


		Student studentTwo = new Student(new Name("Vaishali"));
		studentTwo.setGender(Gender.FEMALE);
		applicationContext.getBean("registration", Registration.class).register(studentTwo);


		// Verify
		System.out.println(applicationContext.getBean("register", Register.class)
				.getStudentCount());
		System.out.println(Boolean.toString(applicationContext
				.getBean("registration", Registration.class)
				.isRegistered(studentTwo, 2)));
	}

}
