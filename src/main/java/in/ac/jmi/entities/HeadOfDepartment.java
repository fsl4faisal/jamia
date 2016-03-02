package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="HEAD_OF_DEPARTMENT")
public class HeadOfDepartment extends BaseEntity{
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;

	public HeadOfDepartment(){}
	
	public HeadOfDepartment(String name, String departmentName) {
		super();
		this.name = name;
		this.departmentName = departmentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
