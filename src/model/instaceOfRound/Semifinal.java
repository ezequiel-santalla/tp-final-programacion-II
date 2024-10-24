package model.instaceOfRound;

import model.Match;
import model.Player;
import model.Round;
import repository.MatchRepositoryImp;
import services.MatchService;
import services.RoundService;

import java.util.ArrayList;
import java.util.List;

public class Semifinal extends Round {

    public Semifinal() {
    }

    public Semifinal(Integer id, List<Match> matches, Integer givenPoints, Double givenMoney) {
        super(id, matches, givenPoints, givenMoney);
    }

    @Override
    public List<Match> generateMatches(List<Player> players) {
        List<Match> matches = new ArrayList<>();
        for (int i = 0; i < players.size(); i += 2) {
            Match match = new Match(players.get(i), players.get(i + 1));
            matches.add(match);
        }
        return matches;
    }

    @Override
    public Integer pointsEarned() {
        return 360;
    }
}
