package student.domain;

import java.util.Optional;

public class Name {

	private String firstName;
	private Optional<String> middleName;
	private Optional<String> lastName;

	public Name(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(Optional<String> middleName) {
		this.middleName = middleName;
	}

	public void setLastName(Optional<String> lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return firstName + " " + middleName.orElseGet(() -> "")  + " " + lastName.orElseGet(() -> "");
	}

	public boolean equals(Name obj) {
		return obj.getFullName().equals(this.getFullName());
	}
}
