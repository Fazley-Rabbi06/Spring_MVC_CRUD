package com.rabbi11372.service;

import com.rabbi11372.model.*;
import java.util.ArrayList;
import java.util.List;

public class BookListService {

	List<Books> list = new ArrayList<Books>();

	public BookListService() {
		this.list.add(new Books(1, "Effective Java", "Joshua Bloch", "Programming", 500));
		this.list.add(new Books(2, "A Beginner’s Guide", "Herbert Schildt", "Programming", 400));
		this.list.add(new Books(3, "The Complete Reference", "Herbert Schildt", "Programming", 600));
		this.list.add(new Books(4, "Head First Java", "Kathy Sierra & Bert Bates", "Programming", 700));
		this.list.add(new Books(5, "The Definite Guide", "Scott Oaks", "Programming", 800));
	}

	public List<Books> showBookList() {
		return this.list;
	}

	public void addBook(int bookId, String bookName, String writerName, String bookCategory, int bookPrice) {
		this.list.add(new Books(bookId, bookName, writerName, bookCategory, bookPrice));
	}

	public Books searchBook(int bookId) {
		Books book;
		book = list.get(bookId - 1);
		return book;
	}

	public void updateBook(int bookId, String bookName, String writerName, String bookCategory, int bookPrice) {
		this.list.set(bookId - 1, new Books(bookId, bookName, writerName, bookCategory, bookPrice));
	}

	public void deleteBook(int bookId) {
		list.remove(bookId - 1);
	}

}
