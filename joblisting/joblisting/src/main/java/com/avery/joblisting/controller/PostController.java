package com.avery.joblisting.controller;

import com.avery.joblisting.repository.PostRepository;
import com.avery.joblisting.model.Post;
import com.avery.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // developing RESTful web services.
public class PostController {

    @Autowired //spring creates obj for you, and maps it.
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/")  //checking if it's working
    public int initial(){
        return 1;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){ //name doesn't matter
        return repo.findAll();
    }

    //posts/java
    @GetMapping("/posts/{text}") //in text, there would be word user put to search
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }

    @PostMapping("/post") //get data
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }


}

