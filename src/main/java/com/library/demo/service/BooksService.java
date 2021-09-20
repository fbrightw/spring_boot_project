package com.library.demo.service;

import com.library.demo.entity.Books;

import java.util.List;

public interface BooksService {

    void saveBook(Books book);

    List<Books> getAllBooks();

    Books getBook(Long id);

    void deleteBook(Long id);
}
