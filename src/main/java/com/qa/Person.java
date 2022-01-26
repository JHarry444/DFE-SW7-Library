package com.qa;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;

	private static int count;

	private final int id;

	private List<Item> checkedOut = new ArrayList<>();

	public Person(String name) {
		super();
		this.name = name;
		this.id = ++count;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void checkOut(Item i) {
		this.checkedOut.add(i);
	}

	public void returnItem(Item i) {
		this.checkedOut.remove(i);
	}

}
