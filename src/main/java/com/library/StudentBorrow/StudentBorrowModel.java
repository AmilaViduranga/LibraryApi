package com.library.StudentBorrow;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.library.Book.BookModel;
import com.library.Student.StudentModel;

@Entity
@Table(name="student_borrow_book")
public class StudentBorrowModel {
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	private BookModel book;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private StudentModel student;
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrowed_date")
	@Temporal(TemporalType.DATE)
	private Date borrowedDate;
	
	@Column(name = "return_date")
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	@Column(name = "actual_return_date")
	@Temporal(TemporalType.DATE)
	private Date actualReturnDate;
	
	@Column(name = "panelty_amount_paid")
	private Double paneltyAmountPaid;
	
	@Column(name = "total_panelty")
	private Double totalPanelty;

	public BookModel getBook() {
		return book;
	}

	public void setBook(BookModel book) {
		this.book = book;
	}

	public StudentModel getStudent() {
		return student;
	}

	public void setStudent(StudentModel student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public Double getPaneltyAmountPaid() {
		return paneltyAmountPaid;
	}

	public void setPaneltyAmountPaid(Double paneltyAmountPaid) {
		this.paneltyAmountPaid = paneltyAmountPaid;
	}

	public Double getTotalPanelty() {
		return totalPanelty;
	}

	public void setTotalPanelty(Double totalPanelty) {
		this.totalPanelty = totalPanelty;
	}
}
