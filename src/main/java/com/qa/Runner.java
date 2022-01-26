package com.qa;

public class Runner {

	public static void main(String[] args) {
		Library lib = new Library();

		lib.addItem(new Book("lotr", "Tolkien"));
		lib.addItem(new DVD("lotr extended", 999));

		lib.removeItem(2); // remove the dvd

		lib.register(new Person("Jordan"));
		lib.register(new Person("Chris"));

		lib.unregister(2);

	}

}
