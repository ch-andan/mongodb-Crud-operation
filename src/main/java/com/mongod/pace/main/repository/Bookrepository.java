package com.mongod.pace.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongod.pace.main.entity.Book;

public interface Bookrepository extends MongoRepository<Book,Integer>{

}
