package com.desenvolvimento.bookstoremanager.books.repository;

import com.desenvolvimento.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
