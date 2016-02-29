package in.ac.jmi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student {
	
	@Column
	private String name;
	
	@Column
	private Date dateOfBirth;
	
	@Column
	private PlaceOfBirth placeOfBirth;
	
	@Column
	private String Nationality;
	
	@Column
	private String religion;
	
	@Column
	private String gender;
	
	@Column
	private String fatherName;
	
	@Column
	private String motherName;
	
	@Column
	private String spouseName;
	
	@Column
	private Address homeAddress;
	
	@Column
	private Address permanentAddress;
	
	@Column
	private String mediumOfExamination;
	
	@Column
	private String enrollmentNumber;
	
	@Column
	private boolean quotaFlag;
	
	@Column
	private boolean disqualifiedFlag;

	public Student(){
		
	}
	public Student(String name, Date dateOfBirth, PlaceOfBirth placeOfBirth,
			String nationality, String religion, String gender,
			String fatherName, String motherName, String spouseName,
			Address homeAddress, Address permanentAddress,
			String mediumOfExamination, String enrollmentNumber,
			boolean quotaFlag, boolean disqualifiedFlag) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		Nationality = nationality;
		this.religion = religion;
		this.gender = gender;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.spouseName = spouseName;
		this.homeAddress = homeAddress;
		this.permanentAddress = permanentAddress;
		this.mediumOfExamination = mediumOfExamination;
		this.enrollmentNumber = enrollmentNumber;
		this.quotaFlag = quotaFlag;
		this.disqualifiedFlag = disqualifiedFlag;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public PlaceOfBirth getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getNationality() {
		return Nationality;
	}

	public String getReligion() {
		return religion;
	}

	public String getGender() {
		return gender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public String getMediumOfExamination() {
		return mediumOfExamination;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public boolean isQuotaFlag() {
		return quotaFlag;
	}

	public boolean isDisqualifiedFlag() {
		return disqualifiedFlag;
	}

}
