package student.roll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import student.domain.Student;

import java.util.HashMap;
import java.util.Map;

// In-memory storage of registered student with roll numbers assigned
@Repository
public class LongRegister {

	private static Integer rollNumber = 0;

	@Autowired
	RegistractionPrototypeCheck prototypeCheck;

	@Autowired
	RegistractionPrototypeCheck prototypeCheckSecond;

	// Roll number, Student
	private final Map<Integer, Student> map = new HashMap<Integer, Student>();

	public synchronized int addStudent(Student student) {
		rollNumber = rollNumber + 1;
		map.put(rollNumber, student);
		return rollNumber;
	}

	public int getStudentCount() {
		return map.size();
	}


	public Student getStudent(int rollNumber) {
		prototypeCheck.setRollNumber(rollNumber);
		prototypeCheck.printFromRegistractionPrototypeCheck();
		prototypeCheckSecond.printFromRegistractionPrototypeCheck();
		return map.get(rollNumber);
	}
}
