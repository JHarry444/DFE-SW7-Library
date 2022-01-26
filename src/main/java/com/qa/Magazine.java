package com.qa;

public class Magazine extends Item {

	private int pageCount;

	public Magazine(String title, int pageCount) {
		super(title);
		this.setPageCount(pageCount);
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
