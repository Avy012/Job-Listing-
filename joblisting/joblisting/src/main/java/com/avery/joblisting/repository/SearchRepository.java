package com.avery.joblisting.repository;

import com.avery.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
