package org.example.model.instaceOfMatch;

import org.example.model.Match;
import org.example.model.Player;
import org.example.model.Round;

import java.util.List;

public class Semifinal extends Round {

    public Semifinal(Integer id, List<Match> matches, Integer givenPoints, Double givenMoney) {
        super(id, matches, givenPoints, givenMoney);
    }

    @Override
    public void generateMatches(List<Player> players) {
        for (int i = 0; i < players.size(); i += 2) {
            Match match = new Match(players.get(i), players.get(i + 1));
            getMatches().add(match);
        }
    }

    @Override
    public void updatePoints() {
       /* for (Match match : getMatches()) {
            Player winner = match.getWinner();
            winner.addPoints(3);
        }*/
    }
}
