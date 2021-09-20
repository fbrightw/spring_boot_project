package com.library.demo;

import com.library.demo.entity.Books;
import com.library.demo.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BooksRepository booksRepository) {
		return args -> {
			List<Books> foreign_books = new ArrayList<>();
			foreign_books.add(new Books("Austen",
					"Pride & Prejudice",
					2015
			));
			foreign_books.add(new Books("Austen",
					"Pride & Prejudice",
					2015
			));

			booksRepository.save(foreign_books.get(0));
			booksRepository.save(foreign_books.get(1));
		};
	};
}
