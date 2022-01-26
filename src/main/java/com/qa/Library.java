package com.qa;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> items = new ArrayList<>();

	private List<Person> members = new ArrayList<>();

	public void addItem(Item i) {
		this.items.add(i);
	}

	public void removeItem(Item i) {
		this.items.remove(i);
	}

	public void removeItem(int id) {
		this.items.remove(this.findItem(id));
	}

	public void register(Person p) {
		this.members.add(p);
	}

	public void unregister(Person p) {
		this.members.remove(p);
	}

	public void unregister(int id) {
		this.members.remove(this.findPerson(id));
	}

	private Item findItem(int id) {
		for (Item i : this.items) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}

	private Person findPerson(int id) {
		for (Person p : this.members) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public void checkOut(int itemId, int memberId) {
		Item toCheckout = this.findItem(itemId);

		if (toCheckout == null) {
			System.out.println("Item not found with id: " + itemId);
			return;
		} else if (!toCheckout.isAvailable()) {
			System.out.println("That item has already been checked out.");
			return;
		}

		Person checkingOut = this.findPerson(memberId);

		if (checkingOut == null) {
			System.out.println("Sorry - invalid member ID");
		}
		toCheckout.setAvailable(false);

		checkingOut.checkOut(toCheckout);
	}
}
