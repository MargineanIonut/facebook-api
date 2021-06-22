package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Comment;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface CommentRepo extends CassandraRepository<Comment, UUID> {

    Comment save(Comment comment);

    @AllowFiltering
    ArrayList<Comment> findAllByPostID(UUID postID);
}