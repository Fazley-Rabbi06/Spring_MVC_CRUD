package com.rabbi11372.controller;

import com.rabbi11372.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookListController {

	BookListService bookListService = new BookListService();

	@RequestMapping("/")
	public ModelAndView showBookList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("booklist", bookListService.showBookList());
		return mv;
	}

	@PostMapping("/addBook")
	public ModelAndView addBook(@RequestParam("bid") int bookID, @RequestParam("bname") String bookName,
			@RequestParam("wname") String writerName, @RequestParam("bcategory") String bookCategory,
			@RequestParam("bprice") int bookPrice) {
		ModelAndView mv = new ModelAndView();
		this.bookListService.addBook(bookID, bookName, writerName, bookCategory, bookPrice);
		mv.setViewName("display");
		mv.addObject("booklist", bookListService.showBookList());
		return mv;
	}

	@GetMapping("/getbook/{id}")
	public ModelAndView getBook(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("updatelist", bookListService.searchBook(id));
		return mv;
	}

	@PostMapping("/update/{bookId}")
	public ModelAndView updateNewBook(@PathVariable int bookId, @RequestParam("bid") int bookID,
			@RequestParam("bname") String bookName, @RequestParam("wname") String writerName,
			@RequestParam("bcategory") String bookCategory, @RequestParam("bprice") int bookPrice) {
		ModelAndView mv = new ModelAndView();
		this.bookListService.updateBook(bookID, bookName, writerName, bookCategory, bookPrice);
		mv.setViewName("display");
		mv.addObject("booklist", bookListService.showBookList());
		return mv;
	}

	@GetMapping("/delete/{id}")
	public ModelAndView deleteBook(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		this.bookListService.deleteBook(id);
		mv.setViewName("display");
		mv.addObject("booklist", bookListService.showBookList());
		return mv;
	}

}
