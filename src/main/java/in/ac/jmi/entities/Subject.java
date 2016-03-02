package in.ac.jmi.entities;

import in.ac.jmi.constants.PaperCategory;
import in.ac.jmi.constants.Semester;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject extends BaseEntity {

	@Column(name = "PAPER_NUMBER")
	private String paperNumber;

	@Column(name = "PAPER_NAME")
	private String paperName;

	@Column(name = "PAPER_CATEGORY")
	private PaperCategory paperCategory;

	@Column(name = "PAPER_SEMESTER")
	private Semester paperSemester;

	public Subject() {
	}

	public Subject(String paperNumber, String paperName,
			PaperCategory paperCategory, Semester paperSemester) {
		super();
		this.paperNumber = paperNumber;
		this.paperName = paperName;
		this.paperCategory = paperCategory;
		this.paperSemester = paperSemester;
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

}
