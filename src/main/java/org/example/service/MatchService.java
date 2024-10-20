package org.example.service;

import org.example.model.Match;
import org.example.model.Player;
import org.example.repository.MatchRepositoryImp;

import java.util.List;

public class MatchService {

    private MatchRepositoryImp matchRepository;

    public MatchService(MatchRepositoryImp matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Integer addMatch(Match match) {
        return matchRepository.create(match);
    }

    public Match findMatchById(Integer id) {
        return matchRepository.find(id);
    }

    public void updateMatch(Match match) {
        matchRepository.update(match);
    }

    public void deleteMatch(Integer id) {
        matchRepository.delete(id);
    }

    public List<Match> getAllMatches() {
        return matchRepository.getAll();
    }

    public Player getWinner(Match match) {
        Player winnerPlayer = null;
        if (match.getResult().getSetsWonPlayerOne() == 2) {
            winnerPlayer = match.getPlayerOne();
        } else if (match.getResult().getSetsWonPlayerTwo() == 2) {
            winnerPlayer = match.getPlayerTwo();
        }
        return winnerPlayer;
    }
}
