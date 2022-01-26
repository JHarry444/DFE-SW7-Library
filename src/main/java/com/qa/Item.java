package com.qa;

public abstract class Item {

	private String title;

	private boolean available = true;

	private final int id;

	private static int count = 0;

	public Item(String title) {
		super();
		this.setTitle(title);
		this.id = ++count;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return this.id;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
