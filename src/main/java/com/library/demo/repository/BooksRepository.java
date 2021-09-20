package com.library.demo.repository;

import com.library.demo.entity.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Long> {

}
