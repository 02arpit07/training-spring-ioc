package student.roll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orm.EmployeeRepositoryConsumer;
import student.domain.Student;


@Service
public class LongRegistration {

	@Autowired
	private LongRegister register;

	@Autowired
	EmployeeRepositoryConsumer repoConsumer;

	public int register(Student student) {
		try{
		repoConsumer.printEmployee();
		}catch(Exception e){
			System.out.println(e);
		}
		return register.addStudent(student);
	}

	public boolean isRegistered(Student student, int rollNumber) {
		return register.getStudent(rollNumber).equals(student);
	}

}
