package com.dovindev.rover.models;

import lombok.Data;


public class Rover {
    private Long id;
    private Integer x;
    private Integer y;
    private Direction direction;
    private static long lastId;

    public Rover(){
        this.id = ++lastId;
    }

    public Rover( Integer x, Integer y, Direction direction) {
        this();
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Long getId() {
        return id;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
