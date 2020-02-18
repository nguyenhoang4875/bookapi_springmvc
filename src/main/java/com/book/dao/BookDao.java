package com.book.dao;

import com.book.model.Book;

import java.util.List;

public interface BookDao {
    public long save(Book book);
    public Book get(Long id);
    List<Book> list();
    void update(Long id,Book book);
    void delete(Long id);

}
