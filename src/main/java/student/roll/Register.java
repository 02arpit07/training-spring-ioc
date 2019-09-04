package student.roll;

import org.springframework.stereotype.Repository;
import student.domain.Student;

import java.util.HashMap;
import java.util.Map;

// In-memory storage of registered student with roll numbers assigned
@Repository
public class Register {

	private static Integer rollNumber = 0;

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
		return map.get(rollNumber);
	}
}
