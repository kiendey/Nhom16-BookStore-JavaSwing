package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "book")
public class Book {
	@Id
	@Column (name = "book_id")
	Integer id;

	@Column (name = "book_name")
	String name;

	@Column (name = "book_genre")
	String genre;

	@Column (name = "book_publisher")
	String publisher;

	@Column (name = "book_author")
	String author;

	@Column (name = "book_publicationdate")
	String publicationDate;

	public Book(Integer id, String name, String genre, String publisher, String author, String publicationDate) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.publisher = publisher;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	public Book() {

	}

	public Integer getId() {
		return id;
	}

	public void setIdBook(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

}
