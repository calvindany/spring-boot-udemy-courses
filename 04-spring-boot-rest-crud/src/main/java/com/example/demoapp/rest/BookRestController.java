package com.example.demoapp.rest;

import com.example.demoapp.entity.Book;
import com.example.demoapp.service.BookService;
import com.example.demoapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookRestController {

    final private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> getEmployees() {
        List<Book> book = bookService.findAll();

        return book;
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable int bookId) {
        Book book = bookService.findById(bookId);

        if(book == null) {
            throw new RuntimeException("Employee id not found: " + bookId);
        }

        return book;
    }

    @PostMapping("")
    public Book addEmployee(@RequestBody Book book) {
        book.setId(0);
        System.out.println(book.getTitle());
        System.out.println(book);
        Book insertedBook = bookService.save(book);

        return insertedBook;
    }

    @PutMapping("")
    public Book updateEmployee(@RequestBody Book employee) {
        return bookService.save(employee);
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        bookService.deleteById(employeeId);

        return "Deleted employee id: " + employeeId;
    }
}
