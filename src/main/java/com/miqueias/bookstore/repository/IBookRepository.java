package com.miqueias.bookstore.repository;

import com.miqueias.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
