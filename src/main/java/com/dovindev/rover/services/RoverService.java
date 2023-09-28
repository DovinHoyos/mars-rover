package com.dovindev.rover.services;

import com.dovindev.rover.models.Rover;
import com.dovindev.rover.repository.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoverService implements IRoverService{

    @Autowired
    RoverRepository repository;

    @Override
    public Rover getById() {
        List<Rover> roverList = repository.findAll();
        return roverList.get(0);
    }
}
