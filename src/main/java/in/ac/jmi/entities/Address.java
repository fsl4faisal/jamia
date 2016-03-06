package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address extends BaseEntity{
	
	@Column(name="STREET",nullable=false)
	private String street;
	
	@Column(name="CITY",nullable=false)
	private String city;
	
	@Column(name="STATE",nullable=false)
	private String state;
	
	@Column(name="PINCODE",nullable=false)
	private int pincode;

	public Address(){}
	
	
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
