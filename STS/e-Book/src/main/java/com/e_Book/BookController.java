package com.e_Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")

public class BookController {
	@Autowired
	BookService service;

    @GetMapping
    public List<Book> getBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

}
