package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="ADDRESS")
public class Address extends BaseEntity{
	
	@Column(name="STREET",nullable=false)
	@NotEmpty(message="Street can not be empty")
	private String street;
	
	@Column(name="CITY",nullable=false)
	@NotEmpty(message="City can not be empty")
	private String city;
	
	@Column(name="STATE",nullable=false)
	@NotEmpty(message="State can not be empty")
	private String state;
	
	//NotNull is for int 
	@Column(name="PINCODE",nullable=false)
	@Pattern(regexp = "[\\d]{6}", message = "Pincode can only be 6 digits number")
	//@NotNull(message="Pincode can not be left blank")
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
