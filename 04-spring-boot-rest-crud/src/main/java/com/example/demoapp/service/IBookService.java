package com.example.demoapp.service;

import com.example.demoapp.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(int id);

    Book save(Book book);

    void deleteById(int id);
}
