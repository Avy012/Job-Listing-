package com.avery.joblisting.repository;

import com.avery.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {// mongo repo will take all the CRUD

}
