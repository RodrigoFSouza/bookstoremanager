package com.desenvolvimento.bookstoremanager.author.entity;

import com.desenvolvimento.bookstoremanager.books.entity.Book;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "author")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private Set<Book> books;
}
