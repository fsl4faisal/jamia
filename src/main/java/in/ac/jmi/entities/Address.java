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


	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "\nAddress [street=" + street + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	

}
