package com.springboot.mongo.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository
        extends MongoRepository <User, String> {

}