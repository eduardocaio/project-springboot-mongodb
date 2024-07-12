package com.eduardocaio.projectmong.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eduardocaio.projectmong.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	List<Post> findByTitleContainingIgnoreCase(String text);

}
