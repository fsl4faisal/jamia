package in.ac.jmi.entities;

import in.ac.jmi.constants.Gender;
import in.ac.jmi.constants.MediumOfExamination;
import in.ac.jmi.constants.Religion;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student extends BaseEntity{
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="STUDENT_PLACE_OF_BIRTH")
	private PlaceOfBirth placeOfBirth;
	
	@Column(name="NATIONALITY")
	private String Nationality;
	
	@Column(name="RELIGION")
	private Religion religion;
	
	@Column(name="GENDER")
	private Gender gender;
	
	@Column(name="FATHER_NAME")
	private String fatherName;
	
	@Column(name="MOTHER_NAME")
	private String motherName;
	
	@Column(name="SPOUSE_NAME")
	private String spouseName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="STUDENT_HOME_ADDRESS")
	private Address homeAddress;
	
	@JoinColumn(name="STUDENT_PERMANENT_ADDRESS")
	@OneToOne(cascade=CascadeType.ALL)
	private Address permanentAddress;
	
	@Column(name="MEDIUM_OF_EXAMINATION")
	private MediumOfExamination mediumOfExamination;
	
	@Column(name="ENROLLMENT_NUMBER")
	private String enrollmentNumber;
	
	@Column(name="QUOTA_FLAG")
	private boolean quotaFlag;
	
	@Column(name="DISQUALIFIED_FLAG")
	private boolean disqualifiedFlag;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Subject> subjectTaken;
	
	@Column(name="APPROVED_BY_HOD")
	private boolean approveFlag;

	public Student(){}
	

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

	public Religion getReligion() {
		return religion;
	}

	public Gender getGender() {
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

	public MediumOfExamination getMediumOfExamination() {
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


	public boolean isApproveFlag() {
		return approveFlag;
	}


	public void setApproveFlag(boolean approveFlag) {
		this.approveFlag = approveFlag;
	}

}
