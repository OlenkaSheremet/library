package com.holyrandom.library;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public Book get(Long id) {
        //TODO get book by id from the DB
        Book testBook = new Book();
        testBook.setName("Перспектива української революції");
        testBook.setAuthor("Степан Бандера");
        testBook.setYear(2020);
        return testBook;
    }

    public List<Book> getAll() {
        //TODO get all the books from the DB
        Book testBook = new Book();
        testBook.setName("Аннапурна");
        testBook.setAuthor("Моріс Ерцог");
        testBook.setYear(2021);

        Book testBook2 = new Book();
        testBook2.setName("Перспектива української революції");
        testBook2.setAuthor("Степан Бандера");
        testBook2.setYear(2020);
        return List.of(testBook, testBook2);
    }

    public Book create(Book book) {
        //TODO save the to the DB
        return book;
    }

    public Book update(Long id, Book book) {
        //TODO get book by id and update id
        return book;
    }

    public void delete(Long id) {
        //TODO delete book by id
    }

}
