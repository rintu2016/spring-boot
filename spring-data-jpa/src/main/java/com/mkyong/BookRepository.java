package com.mkyong;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);
    
    public <User> fetchByName(String name);

    public <User> fetchById(int id);

    public <User> fetchJobById(int id);

}
