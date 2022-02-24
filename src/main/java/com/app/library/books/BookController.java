package com.app.library.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public List<Books> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @PostMapping
    public void addNewBook(@RequestBody Books book) {
        System.out.println(book + "111");
        this.bookService.addNewBook(book);
    }
}
