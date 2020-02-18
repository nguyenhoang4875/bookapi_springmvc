package com.book.service;

import com.book.model.Book;

import java.util.List;

public interface BookService {
    public long save(Book book);
    public Book get(Long id);
    List<Book> list();
    void update(Long id, Book book);
    void delete(Long id);

}
