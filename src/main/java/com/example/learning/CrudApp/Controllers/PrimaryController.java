package com.example.learning.CrudApp.Controllers;


import com.example.learning.CrudApp.Services.BookService;
import com.example.learning.CrudApp.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PrimaryController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/Hello")
    public String getHello(){
        return "Hello";
    }

    @RequestMapping(value = "/books")
    public List<Books> getBooks(){
        return bookService.getallBooks();
    }

    @RequestMapping(value = "/books/{id}")
    public Optional<Books> getSingleBook(@PathVariable String id){
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/books")
    public String createBook(@RequestBody Books Book){
        return bookService.addBook(Book);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/books")
    public String updateBook(@RequestBody Books Book,@PathVariable String id){
        return bookService.updateBook(Book,id);
    }
}
