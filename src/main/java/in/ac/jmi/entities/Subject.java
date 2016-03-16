package in.ac.jmi.entities;

import in.ac.jmi.constants.DepartmentName;
import in.ac.jmi.constants.PaperCategory;
import in.ac.jmi.constants.Semester;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "SUBJECT")
public class Subject extends BaseEntity {

	@Column(name = "PAPER_NUMBER")
	@NotEmpty(message="Paper Number can not be empty")
	private String paperNumber;

	@Column(name = "PAPER_NAME")
	@NotEmpty(message="Paper Name can not be empty")
	private String paperName;

	@Column(name = "PAPER_CATEGORY")
	@NotNull(message="Paper Category can not be left blank")
	private PaperCategory paperCategory;

	@Column(name = "PAPER_SEMESTER")
	@NotNull(message="Paper Category can not be left blank")
	private Semester paperSemester;
	
	@Column(name = "DEPARTMENT_NAME")
	@NotNull(message="Paper Category can not be left blank")
	private DepartmentName departmentName;

	public Subject() {
	}

	public String getPaperNumber() {
		return paperNumber;
	}

	public void setPaperNumber(String paperNumber) {
		this.paperNumber = paperNumber;
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public PaperCategory getPaperCategory() {
		return paperCategory;
	}

	public void setPaperCategory(PaperCategory paperCategory) {
		this.paperCategory = paperCategory;
	}

	public Semester getPaperSemester() {
		return paperSemester;
	}

	public void setPaperSemester(Semester paperSemester) {
		this.paperSemester = paperSemester;
	}

	public DepartmentName getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(DepartmentName departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "\nSubject [paperNumber=" + paperNumber + ", paperName="
				+ paperName + ", paperCategory=" + paperCategory
				+ ", paperSemester=" + paperSemester + ", departmentName="
				+ departmentName + "]";
	}
	

}
