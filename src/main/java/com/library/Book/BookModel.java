package com.library.Book;

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
@Table(name = "book_info")
public class BookModel {

	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "book_name")
	private String BookName;
	
	@Column(name = "count")
	private Integer AvailableCount;
	
	@Column(name = "publication")
	private String Publication;
	
	@Column(name = "author_name")
	private String AuthorName;
	
	@Column(name = "category")
	private String Category;
	
	@Column(name = "book_borrow_type")
	private String BorrowingType;
	
	@Column(name = "book_image")
	private String Image;
	
	@Column(name = "published_year")
	private String publishedYear;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "book")
	private Set<StudentBorrowModel> borrowings = new HashSet<StudentBorrowModel>();
	
	@OneToMany(mappedBy = "book")
	private Set<CommentModel> comments = new HashSet<CommentModel>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public Integer getAvailableCount() {
		return AvailableCount;
	}

	public void setAvailableCount(Integer availableCount) {
		AvailableCount = availableCount;
	}

	public String getPublication() {
		return Publication;
	}

	public void setPublication(String publication) {
		Publication = publication;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getBorrowingType() {
		return BorrowingType;
	}

	public void setBorrowingType(String borrowingType) {
		BorrowingType = borrowingType;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
