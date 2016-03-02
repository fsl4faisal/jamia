package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DisqualifiedDescription extends BaseEntity{
	
	@Column(name="UNIVERSITY_BOARD_NAME")
	private String universityBoardName;
	
	@Column(name="EXAMINATION")
	private String examination;
	
	@Column(name="YEAR")
	private String year;
	
	@Column(name="ENROLLMENT_NUMBER")
	private String enrollmentNumber;
	
	@Column(name="ROLL_NUMBER")
	private String rollNumber;
	
	@Column(name="PERIOD_OF_PUNISHMENT")
	private String periodOfPunishment;
	
	@Column(name="HELD_YEAR")
	private String heldYear;
	
	@Column(name="SUBJECT")
	private String subject;

	public String getUniversityBoardName() {
		return universityBoardName;
	}

	public void setUniversityBoardName(String universityBoardName) {
		this.universityBoardName = universityBoardName;
	}

	public String getExamination() {
		return examination;
	}

	public void setExamination(String examination) {
		this.examination = examination;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getPeriodOfPunishment() {
		return periodOfPunishment;
	}

	public void setPeriodOfPunishment(String periodOfPunishment) {
		this.periodOfPunishment = periodOfPunishment;
	}

	public String getHeldYear() {
		return heldYear;
	}

	public void setHeldYear(String heldYear) {
		this.heldYear = heldYear;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
	