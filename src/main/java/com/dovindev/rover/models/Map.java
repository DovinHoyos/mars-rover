package com.dovindev.rover.models;

import lombok.Data;

import java.util.List;

@Data
public class Map {
    private Rover rover;
    private List<Obstacle> obstacleList;
}
