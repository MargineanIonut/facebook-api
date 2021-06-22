package com.example.facebookapi.Controller;

import com.example.facebookapi.Entity.Status;
import com.example.facebookapi.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/statusService")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status) {
        return statusService.saveStatus(status);
    }


    @GetMapping("/getAllStatus")
    public ArrayList<Status> getAllStatus() {
        return statusService.getAllStatus();
    }
}