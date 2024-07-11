package com.eduardocaio.projectmong.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eduardocaio.projectmong.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
