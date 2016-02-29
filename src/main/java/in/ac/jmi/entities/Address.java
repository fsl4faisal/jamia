package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Address {
	
	@Column
	private String street;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private int pincode;

	public Address(String street, String city, String state, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPincode() {
		return pincode;
	}

}
