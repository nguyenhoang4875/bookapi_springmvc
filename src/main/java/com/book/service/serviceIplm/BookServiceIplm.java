package com.book.service.serviceIplm;

import com.book.dao.BookDao;
import com.book.model.Book;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceIplm implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    @Override
    public long save(Book book) {
       return bookDao.save(book);
    }

    @Transactional
    @Override
    public Book get(Long id) {
        return bookDao.get(id);
    }

    @Override
    @Transactional
    public List<Book> list() {
        return bookDao.list();
    }

    @Override
    @Transactional
    public void update(Long id,Book book) {
         bookDao.update(id,book);

    }

    @Override
    @Transactional
    public void delete(Long id) {
        bookDao.delete(id);

    }
}
