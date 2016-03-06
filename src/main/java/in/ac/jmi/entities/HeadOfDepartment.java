package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="HEAD_OF_DEPARTMENT")
public class HeadOfDepartment extends BaseEntity{
	
	@Column(name="NAME",nullable=false)
	private String name;
	
	@Column(name="DEPARTMENT_NAME",nullable=false)
	private String departmentName;
	
	@Column(name="EMAIL_ADDRESS",nullable=false)
	private String emailAddress;

	public HeadOfDepartment(){}
	
	public HeadOfDepartment(String name, String departmentName,
			String emailAddress) {
		super();
		this.name = name;
		this.departmentName = departmentName;
		this.emailAddress = emailAddress;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
		
	
}
