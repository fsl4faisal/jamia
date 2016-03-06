package in.ac.jmi.entities;

import in.ac.jmi.constants.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User extends BaseEntity{
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ROLE")
	private Role role;
	
	public User(){}
	
	public User(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
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
	
	

}
