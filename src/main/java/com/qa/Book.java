package com.qa;

public class Book extends Item {

	private String author;

	public Book(String title, String author) {
		super(title);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
