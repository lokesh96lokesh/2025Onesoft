package com.e_Book;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	private final BookRepository repo;

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book saveBook(Book book) {
        return repo.save(book);
    }

}
