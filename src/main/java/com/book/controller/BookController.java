package com.book.controller;

import com.book.model.Book;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/api/book")
    public ResponseEntity<List<Book>> list() {
        List<Book> books = bookService.list();
        return ResponseEntity.ok().body(books);
    }

    @PostMapping("/api/book")
    public ResponseEntity<?> save(@RequestBody Book book) {
        long id = bookService.save(book);
        return ResponseEntity.ok().body("created with id: " + id);
    }

    @GetMapping("/api/book/{id}")
    public ResponseEntity<Book> get(@PathVariable("id") long id) {
        Book book = bookService.get(id);
        return ResponseEntity.ok().body(book);
    }

    @PutMapping("/api/book/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book) {
        bookService.update(id, book);
        return ResponseEntity.ok().body("Book has been update");
    }

    @DeleteMapping("/api/book/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        bookService.delete(id);
        return ResponseEntity.ok().body("Book has been deleted");
    }
}
