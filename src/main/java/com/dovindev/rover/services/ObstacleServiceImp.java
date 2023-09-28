package com.dovindev.rover.services;

import com.dovindev.rover.models.Obstacle;
import com.dovindev.rover.repository.ObstacleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObstacleServiceImp implements IObstacleService {

    @Autowired
    ObstacleRepository repository;

    @Override
    public List<Obstacle> getAll() {
        return repository.findAll();
    }
}
