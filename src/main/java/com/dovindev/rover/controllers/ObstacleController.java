package com.dovindev.rover.controllers;

import com.dovindev.rover.models.Obstacle;
import com.dovindev.rover.services.IObstacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ObstacleController {
    @Autowired
    IObstacleService service;

    @PostMapping("/obstacle")
    public void create(@RequestBody Obstacle obstacle){
    }

    @GetMapping("/obstacles")
    public List<Obstacle> getAll(){
        return service.getAll();
    }
}
