package in.ac.jmi.entities;

import in.ac.jmi.constants.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USER")
public class User extends UrlEntity{
	
	@Column(name="NAME", nullable = false)
	@NotEmpty(message="Name can not be empty")
	private String name;
	
	@Column(name="ROLE", nullable = false)
	@NotNull(message="Role can not be left blank")
	private Role role;
	
	@Column(name = "EMAIL_ADDRESS", nullable = false)
	@NotEmpty(message="email address can not be empty")
	private String emailAddress;
	
	public User(){}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	@Override
	public String toString() {
		return "\nUser [name=" + name + ", role=" + role + ", emailAddress="
				+ emailAddress + "]";
	}
	
	

}
