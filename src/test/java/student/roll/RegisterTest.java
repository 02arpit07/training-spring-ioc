package student.roll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import student.domain.Name;
import student.domain.Student;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;


public class RegisterTest {

	@Test
	public void addStudents() {
		Register register = new Register();
		register.addStudent(new Student(new Name("studentOne")));
		register.addStudent(new Student(new Name("studentTwo")));
		Assertions.assertTrue(register.getStudentCount() == 2);
	}


	// Single Register instance in Multithreaded environment
	@Test
	public void addStudentsMultiThreaded() {
		Register register = new Register();

		// Runnable job
		class RunnableRegister implements Runnable {

			private Student student;
			RunnableRegister(Student student) {
				this.student = student;
			}

			// register students - shared register
			@Override public void run() {
				register.addStudent(student);
			}
		}


		// Thread pool
		ExecutorService threadPool = Executors.newFixedThreadPool(100);
		int count = 0;
		while (count < 1000) {
			threadPool.submit(new RunnableRegister(new Student(new Name(Integer.toString(count)))));
			count ++;
		}
		awaitTerminationAfterShutdown(threadPool);


		Assertions.assertTrue(register.getStudentCount() == count, new Supplier<String>() {
			@Override public String get() {
				return "Register count: " + Integer.toString(register.getStudentCount());
			}
		});
	}

	private void awaitTerminationAfterShutdown(ExecutorService threadPool) {
		threadPool.shutdown();
		try {
				if (!threadPool.awaitTermination(60, TimeUnit.SECONDS)) {
				threadPool.shutdownNow(); }
		} catch (InterruptedException ex) {
			threadPool.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}

}
