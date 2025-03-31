package com.example.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
