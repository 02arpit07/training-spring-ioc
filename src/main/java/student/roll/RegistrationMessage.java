package student.roll;

import student.domain.Student;


public class RegistrationMessage {

	public static String getMessage(Student student, int rollNumber) {
		if (rollNumber != 0) {
			return "Congratulations " + student.getName().getFullName() + "! Your roll number is " + rollNumber;
		}
		return "Registration incomplete. Please try again! " + student.getName().getFullName();
	}

}
