package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/api/postService")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/save")
    public ArrayList<Post> submitPost(@RequestBody Post body){
        ArrayList<Post> result = postService.submitPostToDB(body);
        return new ArrayList<Post>();
    }

    @GetMapping("/getPost")
    public ArrayList<Post> retrieveAllPost(){
        ArrayList<Post> result = postService.retrievePostFromDb();
        return result;
    }

    @DeleteMapping("/delete")
    public ArrayList<Post> deleteParticularPost(@PathVariable("postId")UUID postID){
        ArrayList<Post> result = postService.deletePostFromDB(postID);
        return result;
    }
}
