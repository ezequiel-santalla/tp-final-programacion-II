package model;

import enums.ERound;

import java.util.List;
import java.util.UUID;

public class Round {
    private UUID ID;
    private List<Match> matches;
    private ERound round;
    private Integer givenPoints;
    private Double givenMoney;

    public Round(List<Match> matches, ERound round, Integer givenPoints, Double givenMoney) {
        this.ID = UUID.randomUUID();
        this.matches = matches;
        this.round = round;
        this.givenPoints = givenPoints;
        this.givenMoney = givenMoney;
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

    public ERound getRound() {
        return round;
    }

    public void setRound(ERound round) {
        this.round = round;
    }

    public Integer getGivenPoints() {
        return givenPoints;
    }

    public void setGivenPoints(Integer givenPoints) {
        this.givenPoints = givenPoints;
    }

    public Double getGivenMoney() {
        return givenMoney;
    }

    public void setGivenMoney(Double givenMoney) {
        this.givenMoney = givenMoney;
    }
}
