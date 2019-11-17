package com.example.learning.CrudApp.Repository;

import com.example.learning.CrudApp.pojo.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,String> {

}
