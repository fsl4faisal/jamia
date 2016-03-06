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
	
	public PlaceOfBirth(String town, String distt, String state) {
		super();
		this.town = town;
		this.distt = distt;
		this.state = state;
	}

	public String getTown() {
		return town;
	}

	public String getDistt() {
		return distt;
	}

	public String getState() {
		return state;
	}

}
