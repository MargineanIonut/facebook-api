package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.UUID;

public interface PostRepo extends CrudRepository<Post, UUID> {
    ArrayList<Post> findAll();
    Post save(Post post);
    void deleteById(UUID postID);

}
