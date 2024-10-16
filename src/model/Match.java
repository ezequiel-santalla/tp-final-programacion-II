package model;

import java.util.UUID;

public class Match {
    private UUID ID;
    private Player player1;
    private Player player2;
    private Result result;
    private String court;

    public Match(Player player1, Player player2, Result result, String court) {
        this.ID = UUID.randomUUID();
        this.player1 = player1;
        this.player2 = player2;
        this.result = result;
        this.court = court;
    }

    public UUID getId() {
        return ID;
    }

    public void setId(UUID id) {
        this.ID = id;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }
}
