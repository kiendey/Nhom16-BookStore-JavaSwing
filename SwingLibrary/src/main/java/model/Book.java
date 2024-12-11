package model;

public class Book {
	String id;
	String name;
	String genre;
	String publisher;
	String author;
	String publicationDate;

	public Book(String id, String name, String genre, String publisher, String author, String publicationDate) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.publisher = publisher;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	public String getId() {
		return id;
	}

	public void setIdBook(String id) {
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
