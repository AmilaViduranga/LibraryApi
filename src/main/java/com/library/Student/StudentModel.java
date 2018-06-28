package com.library.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.library.Comment.CommentModel;
import com.library.StudentBorrow.StudentBorrowModel;

@Entity
@Table(name="student_info")
public class StudentModel {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name="student_id")
	private String StudentId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "display_name")
	private String displayName;
	
	@Column(name = "contact_info")
	private String contactInfo;
	
	@Column(name = "faculty")
	private String faculty;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "black_listed_count")
	private Integer blackListedCount;
	
	@Column(name = "clean_count")
	private Integer cleanReturnCount;
	
	@Column(name = "total_panelty_payments")
	private Double totalPaneltyPayments;
	
	@Column(name = "panelty_returned_counts")
	private Integer paneltyReturnedCounts;
	
	@OneToMany(mappedBy = "student")
	private Set<StudentBorrowModel> borrowings = new HashSet<StudentBorrowModel>();
	
	@OneToMany(mappedBy = "student")
	private Set<CommentModel> comments = new HashSet<CommentModel>();

	public Set<StudentBorrowModel> getBorrowings() {
		return borrowings;
	}

	public void setBorrowings(Set<StudentBorrowModel> borrowings) {
		this.borrowings = borrowings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getBlackListedCount() {
		return blackListedCount;
	}

	public void setBlackListedCount(Integer blackListedCount) {
		this.blackListedCount = blackListedCount;
	}

	public Integer getCleanReturnCount() {
		return cleanReturnCount;
	}

	public void setCleanReturnCount(Integer cleanReturnCount) {
		this.cleanReturnCount = cleanReturnCount;
	}

	public Double getTotalPaneltyPayments() {
		return totalPaneltyPayments;
	}

	public void setTotalPaneltyPayments(Double totalPaneltyPayments) {
		this.totalPaneltyPayments = totalPaneltyPayments;
	}

	public Integer getPaneltyReturnedCounts() {
		return paneltyReturnedCounts;
	}

	public void setPaneltyReturnedCounts(Integer paneltyReturnedCounts) {
		this.paneltyReturnedCounts = paneltyReturnedCounts;
	}
	
	
	
}
