package com.library.demo.service;

import com.library.demo.entity.Books;
import com.library.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService{

    @Autowired
    private BooksRepository repository;

    @Override
    @Transactional
    public void saveBook(Books book) {
        repository.save(book);
    }

    @Override
    @Transactional
    public List<Books> getAllBooks() {
        return (List<Books>) repository.findAll();
    }

    @Override
    public Books getBook(Long id) {
        Optional<Books> opt = repository.findById(id);
        return opt.orElse(null);
    }

    @Override
    @Transactional
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}
