package org.example.Controllers;

import org.example.Models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {
    public List<Book> books = new ArrayList<>(List.of(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925),
            new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960),
            new Book(3, "The Catcher in the Rye", "J.D. Salinger", 1951),
            new Book(4, "Beloved", "Toni Morrison", 1987),
            new Book(5, "The Color Purple", "Alice Walker", 1982)
    ));

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        books.add(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i, book);
                return;
            }
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        books.removeIf(book -> book.getId() == id);
    }
}
