package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PlaceOfBirth {
	
	@Column
	private String town;
	
	@Column
	private String distt;
	
	@Column
	private String state;

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
