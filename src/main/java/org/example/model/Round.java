package org.example.model;


import java.util.List;
import java.util.UUID;

public class Round {
    private Integer id;
    private List<Match> matches;
    private Integer givenPoints;

    public Round(Integer id, List<Match> matches, Integer givenPoints, Double givenMoney) {
        this.id = id;
        this.matches = matches;
        this.givenPoints = givenPoints;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
