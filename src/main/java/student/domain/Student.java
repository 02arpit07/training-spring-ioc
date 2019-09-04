package student.domain;

public class Student {

	private Name name;
	private Gender gender;

	public Student(Name name) {
		this.name = name;
	}

	public Name getName() {
		return this.name;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public boolean equals(Student obj) {
		return obj.getGender().equals(this.gender) && obj.getName().equals(this.name);
	}
}
