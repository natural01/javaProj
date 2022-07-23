package com.home.blog.post;

import com.home.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface postRepository extends CrudRepository<Post, Long> {
}
