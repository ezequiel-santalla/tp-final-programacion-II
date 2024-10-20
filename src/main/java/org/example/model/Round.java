package org.example.model;


import java.util.List;
import java.util.UUID;

public class Round {
    private UUID ID;
    private List<Match> matches;
    private Integer givenPoints;

    public Round(List<Match> matches, Integer givenPoints, Double givenMoney) {
        this.ID = UUID.randomUUID();
        this.matches = matches;
        this.givenPoints = givenPoints;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Integer getGivenPoints() {
        return givenPoints;
    }

    public void setGivenPoints(Integer givenPoints) {
        this.givenPoints = givenPoints;
    }

}
