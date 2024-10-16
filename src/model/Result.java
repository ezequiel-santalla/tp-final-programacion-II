package model;

import java.util.UUID;

public class Result {
    private UUID ID;
    private String result;
    private Player winner;

    public Result(String result, Player winner) {
        this.ID = UUID.randomUUID();
        this.result = result;
        this.winner = winner;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
