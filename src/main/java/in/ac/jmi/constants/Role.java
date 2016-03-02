package in.ac.jmi.constants;

public enum Role {
	ADMIN("Admin", "ADMIN"), STUDENT("Student", "STUDENT"), HEADOFDEPARTMENT("Head of Department", "HOD");

	private String name, value;

	private Role(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
