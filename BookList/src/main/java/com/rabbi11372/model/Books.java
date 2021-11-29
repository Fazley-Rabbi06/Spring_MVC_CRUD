package com.rabbi11372.model;

public class Books {

	private int bookId;
	private String bookName;
	private String writerName;
	private String bookCategory;
	private int bookPrice;
	
	public Books(int bookId, String bookName, String writerName, String bookCategory, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.writerName = writerName;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
	}
	
	public Books() {
		super();
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", writerName=" + writerName + ", bookCategory="
				+ bookCategory + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
	

}