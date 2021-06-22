package com.example.facebookapi.Service;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;

    public ArrayList<Post> submitPostToDB(Post postData){
        Date date = new Date();
        long time = time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        postData.setPostID(UUID.randomUUID());
        postData.setLikes(0);
        postData.setDateTime(dateTime);
        postRepo.save(postData);
        ArrayList<Post> result = retrievePostFromDb();
        return result;
    }
    public ArrayList<Post> retrievePostFromDb(){
        ArrayList<Post> result = postRepo.findAll();
        return result;
    }
    public ArrayList<Post> deletePostFromDB(UUID postID){
        postRepo.deleteById(postID);
        ArrayList<Post> result = retrievePostFromDb();
        return result;
    }
}
