package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Service.CommentService;
import com.example.facebookapi.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComments/{postID}")
    public ArrayList<Comment> getAllComments(@PathVariable("postID") UUID postID){
        return commentService.getAllComment(postID);

    }
}