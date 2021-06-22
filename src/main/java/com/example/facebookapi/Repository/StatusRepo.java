package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Status;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface StatusRepo extends CassandraRepository<Status, UUID> {

    Status save(Status status);
    ArrayList<Status> findAll();
}