package student.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import student.domain.Name;
import student.domain.Student;
import student.roll.LongRegistration;
import student.roll.RegistrationMessage;
import student.roll.LongRegister;

import java.util.Optional;

@RestController
@RequestMapping("/final-registration")
public class FinalRegistrationController {

	@Autowired
	private LongRegistration registration;

	@Autowired
	private LongRegister longRegister;

	@GetMapping(path = "/{batch}", produces = "application/json")
	public String register(@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "middleName", required = false) String middleName,
			@RequestParam(name = "lastName", required = false) String lastName,
			@RequestParam(name = "gender", required = false) String gender,
			@PathVariable int batch) {
		Name name = new Name(firstName);
		name.setMiddleName(Optional.ofNullable(middleName));
		name.setLastName(Optional.ofNullable(lastName));

		Student student = new Student(name);
		return RegistrationMessage.getMessage(student, registration.register(student));
	}
}
