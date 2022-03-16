package com.jk.repository;

import org.springframework.data.repository.CrudRepository;

import com.jk.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
