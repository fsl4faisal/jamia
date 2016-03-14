package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="PLACE_OF_BIRTH")
public class PlaceOfBirth extends BaseEntity{
	
	@Column(name="TOWN",nullable=false)
	@NotBlank
	private String town;
	
	@Column(name="DISTT",nullable=false)
	@NotBlank
	private String distt;
	
	@Column(name="STATE",nullable=false)
	@NotBlank
	private String state;

	public PlaceOfBirth(){}
	
	public String getTown() {
		return town;
	}

	public String getDistt() {
		return distt;
	}

	public String getState() {
		return state;
	}

	
	public void setTown(String town) {
		this.town = town;
	}

	public void setDistt(String distt) {
		this.distt = distt;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "\nPlaceOfBirth [town=" + town + ", distt=" + distt + ", state="
				+ state + "]";
	}
	

}
