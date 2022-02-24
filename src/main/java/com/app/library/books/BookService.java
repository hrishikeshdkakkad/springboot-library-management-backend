package com.app.library.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Books> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public void addNewBook(Books book) {
        Optional<Books> bookId = this.bookRepository.findById(book.getId());
        if(bookId.isPresent()) {
            throw new IllegalStateException("Book ID Taken");
        } else {
            this.bookRepository.save(book);
        }
    }
}
