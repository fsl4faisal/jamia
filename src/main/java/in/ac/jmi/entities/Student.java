package in.ac.jmi.entities;

import in.ac.jmi.constants.CourseType;
import in.ac.jmi.constants.ExaminationName;
import in.ac.jmi.constants.Flag;
import in.ac.jmi.constants.Gender;
import in.ac.jmi.constants.MediumOfExamination;
import in.ac.jmi.constants.Semester;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "STUDENT")
public class Student extends UrlEntity {

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "STUDENT_USER")
	private User user;

	@Column(name = "EXAMINATION_NAME", nullable = false)
	private ExaminationName examinationName;

	@Column(name = "SEMESTER_NAME", nullable = false)
	private Semester semesterName;

	@Column(name = "YEAR", nullable = false)
	private short year;

	@Column(name = "DATE_OF_BIRTH", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dateOfBirth;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "STUDENT_PLACE_OF_BIRTH")
	private PlaceOfBirth placeOfBirth;

	@Column(name = "NATIONALITY", nullable = false)
	private String nationality;

	@Column(name = "RELIGION", nullable = false)
	private String religion;

	@Column(name = "GENDER", nullable = false)
	private Gender gender;

	@Column(name = "FATHER_NAME", nullable = false)
	private String fatherName;

	@Column(name = "MOTHER_NAME", nullable = false)
	private String motherName;

	@Column(name = "SPOUSE_NAME", nullable = false)
	private String spouseName;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "STUDENT_CORRESPONDENCE_ADDRESS")
	private Address correspondenceAddress;

	@JoinColumn(name = "STUDENT_PERMANENT_ADDRESS")
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Address permanentAddress;

	@Column(name = "MOBILE_NUMBER", nullable = false)
	private String mobileNumber;

	@Column(name = "MEDIUM_OF_EXAMINATION", nullable = false)
	private MediumOfExamination mediumOfExamination;

	@Column(name = "ENROLLMENT_NUMBER", nullable = false)
	private String enrollmentNumber;

	@Column(name = "QUOTA_FLAG", nullable = false)
	private Flag quotaFlag;

	@Column(name = "DISQUALIFIED_FLAG")
	private Flag disqualifiedFlag;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENT_DISQUALIFIED_DESCRIPTION")
	private DisqualifiedDescription disqualifiedDescription;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Subject> subjectTaken;

	@Column(name = "APPROVED_BY_HOD")
	private Flag approveByHodFlag;
	
	//TODO
	@Column(name="COURSE_TYPE",nullable=false)
	private CourseType courseType;
	
	@Column(name="STUDENT_ID",nullable=false)
	private int studentId;


	public Student() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ExaminationName getExaminationName() {
		return examinationName;
	}

	public void setExaminationName(ExaminationName examinationName) {
		this.examinationName = examinationName;
	}

	public Semester getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(Semester semesterName) {
		this.semesterName = semesterName;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PlaceOfBirth getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(PlaceOfBirth placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public MediumOfExamination getMediumOfExamination() {
		return mediumOfExamination;
	}

	public void setMediumOfExamination(MediumOfExamination mediumOfExamination) {
		this.mediumOfExamination = mediumOfExamination;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public Flag getQuotaFlag() {
		return quotaFlag;
	}

	public void setQuotaFlag(Flag quotaFlag) {
		this.quotaFlag = quotaFlag;
	}

	public Flag getDisqualifiedFlag() {
		return disqualifiedFlag;
	}

	public void setDisqualifiedFlag(Flag disqualifiedFlag) {
		this.disqualifiedFlag = disqualifiedFlag;
	}

	public DisqualifiedDescription getDisqualifiedDescription() {
		return disqualifiedDescription;
	}

	public void setDisqualifiedDescription(
			DisqualifiedDescription disqualifiedDescription) {
		this.disqualifiedDescription = disqualifiedDescription;
	}

	public Set<Subject> getSubjectTaken() {
		return subjectTaken;
	}

	public void setSubjectTaken(Set<Subject> subjectTaken) {
		this.subjectTaken = subjectTaken;
	}

	public Flag getApproveByHodFlag() {
		return approveByHodFlag;
	}

	public void setApproveByHodFlag(Flag approveByHodFlag) {
		this.approveByHodFlag = approveByHodFlag;
	}

	
	
	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [user=" + user + ", examinationName=" + examinationName
				+ ", semesterName=" + semesterName + ", year=" + year
				+ ", dateOfBirth=" + dateOfBirth + ", placeOfBirth="
				+ placeOfBirth + ", nationality=" + nationality + ", religion="
				+ religion + ", gender=" + gender + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", spouseName="
				+ spouseName + ", correspondenceAddress="
				+ correspondenceAddress + ", permanentAddress="
				+ permanentAddress + ", mobileNumber=" + mobileNumber
				+ ", mediumOfExamination=" + mediumOfExamination
				+ ", enrollmentNumber=" + enrollmentNumber + ", quotaFlag="
				+ quotaFlag + ", disqualifiedFlag=" + disqualifiedFlag
				+ ", disqualifiedDescription=" + disqualifiedDescription
				+ ", subjectTaken=" + subjectTaken + ", approveByHodFlag="
				+ approveByHodFlag + ", courseType=" + courseType
				+ ", studentId=" + studentId + "]";
	}

	
}
