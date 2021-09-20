package com.library.demo.controller;

import com.library.demo.entity.Books;
import com.library.demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BooksController {

    @Autowired
    private BooksService service;

    @PostMapping("new_books")
    public Books newBooks(@RequestBody Books book) {
       service.saveBook(book);
       return book;
    }

    @GetMapping("/all_books")
    public List<Books> getAllBooks(){
        List<Books> list = service.getAllBooks();
        return list;
    }

    @GetMapping("/books/{id}")
    public Books getBook(@PathVariable Long id) {
        return service.getBook(id);
    }
}
