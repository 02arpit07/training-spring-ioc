package student.roll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.domain.Student;


@Service
public class LongRegistration {

	@Autowired
	private LongRegister register;

	public int register(Student student) {
		return register.addStudent(student);
	}

	public boolean isRegistered(Student student, int rollNumber) {
		return register.getStudent(rollNumber).equals(student);
	}

}
