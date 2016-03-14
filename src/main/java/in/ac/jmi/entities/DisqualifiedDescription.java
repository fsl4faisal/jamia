package in.ac.jmi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DISQUALIFIED_DESCRIPTION")
public class DisqualifiedDescription extends BaseEntity{
	
	@Column(name="PREVIOUS_UNIVERSITY_BOARD_NAME")
	private String previousUniversityBoardName;
	
	@Column(name="PREVIOUS_EXAMINATION_NAME")
	private String previousExaminationName;
	
	@Column(name="PREVIOUS_YEAR")
	private short previousYear;
	
	@Column(name="PREVIOUS_ENROLLMENT_NUMBER")
	private String previousEnrollmentNumber;
	
	@Column(name="PREVIOUS_ROLL_NUMBER")
	private String previousRollNumber;
	
	@Column(name="PERIOD_OF_PUNISHMENT")
	private String periodOfPunishment;
		
	public DisqualifiedDescription(){}

	public DisqualifiedDescription(String previousUniversityBoardName,
			String previousExaminationName, short previousYear,
			String previousEnrollmentNumber, String previousRollNumber,
			String periodOfPunishment) {
		super();
		this.previousUniversityBoardName = previousUniversityBoardName;
		this.previousExaminationName = previousExaminationName;
		this.previousYear = previousYear;
		this.previousEnrollmentNumber = previousEnrollmentNumber;
		this.previousRollNumber = previousRollNumber;
		this.periodOfPunishment = periodOfPunishment;
	}

	public String getPreviousUniversityBoardName() {
		return previousUniversityBoardName;
	}

	public void setPreviousUniversityBoardName(String previousUniversityBoardName) {
		this.previousUniversityBoardName = previousUniversityBoardName;
	}

	public String getPreviousExaminationName() {
		return previousExaminationName;
	}

	public void setPreviousExaminationName(String previousExaminationName) {
		this.previousExaminationName = previousExaminationName;
	}

	public short getPreviousYear() {
		return previousYear;
	}

	public void setPreviousYear(short previousYear) {
		this.previousYear = previousYear;
	}

	public String getPreviousEnrollmentNumber() {
		return previousEnrollmentNumber;
	}

	public void setPreviousEnrollmentNumber(String previousEnrollmentNumber) {
		this.previousEnrollmentNumber = previousEnrollmentNumber;
	}

	public String getPreviousRollNumber() {
		return previousRollNumber;
	}

	public void setPreviousRollNumber(String previousRollNumber) {
		this.previousRollNumber = previousRollNumber;
	}

	public String getPeriodOfPunishment() {
		return periodOfPunishment;
	}

	public void setPeriodOfPunishment(String periodOfPunishment) {
		this.periodOfPunishment = periodOfPunishment;
	}

	@Override
	public String toString() {
		return "\nDisqualifiedDescription [previousUniversityBoardName="
				+ previousUniversityBoardName + ", previousExaminationName="
				+ previousExaminationName + ", previousYear=" + previousYear
				+ ", previousEnrollmentNumber=" + previousEnrollmentNumber
				+ ", previousRollNumber=" + previousRollNumber
				+ ", periodOfPunishment=" + periodOfPunishment + "]";
	}
	
		
}
	