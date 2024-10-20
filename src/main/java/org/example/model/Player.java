package org.example.model;

import java.time.LocalDate;

public class Player extends Person {
    private Integer points;

    public Player(String name, String lastName, String nationality, LocalDate dateOfBirth, Integer points) {
        super(name, lastName, nationality, dateOfBirth);
        this.points = points;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
