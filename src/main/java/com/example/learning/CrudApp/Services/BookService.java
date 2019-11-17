package com.example.learning.CrudApp.Services;

import com.example.learning.CrudApp.Repository.BookRepository;
import com.example.learning.CrudApp.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private List<Books> books= new ArrayList<Books>(Arrays.asList());

    public List<Books> getallBooks(){
        return bookRepository.findAll();
    }

    public Optional<Books> getBook(String id) {
       return bookRepository.findById(id);
    }

    public String addBook(Books book) {
        System.out.println("This is a log message");
        bookRepository.save(book);
        return "Success";
    }

    public String updateBook(Books book, String id) {
        bookRepository.save(book);
        return "Success";
    }
}
