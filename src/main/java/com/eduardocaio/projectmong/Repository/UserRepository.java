package com.eduardocaio.projectmong.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eduardocaio.projectmong.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
