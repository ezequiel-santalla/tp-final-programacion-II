package org.example.service;

import org.example.model.Match;
import org.example.model.Player;
import org.example.repository.PlayerRepositoryImp;

import java.util.List;

public class PlayerService {
    private final PlayerRepositoryImp playerRepository;
    private final MatchService matchService;

    public PlayerService(PlayerRepositoryImp playerRepository, MatchService matchService) {
        this.playerRepository = playerRepository;
        this.matchService = matchService;
    }

    public Integer addPlayer(Player player) {
        return playerRepository.create(player);
    }

    public Player findPlayerById(Integer id) {
        return playerRepository.find(id);
    }

    public void updatePlayer(Player player) {
        playerRepository.update(player);
    }

    public void deletePlayer(Integer id) {
        playerRepository.delete(id);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.getAll();
    }

    private List<Match> getMatchHistoryByPlayer(Integer id) {
        return matchService.getAllMatches(/*id*/);
    }

    private Integer getMatchesWon(Integer id) {
        List<Match> allMatches = matchService.getAllMatches(/*id*/);
        Integer matchesWon = 0;

        for (Match m : allMatches) {
            int idWinner = matchService.getWinner(m).getId();

            if (idWinner == id) {
                matchesWon++;
            }
        }
        return matchesWon;
    }

    public String getStats(Integer id) {
        Player player = findPlayerById(id);

        int matchesPlayed = getMatchHistoryByPlayer(id).size();
        int matchesWon = getMatchesWon(id);
        int matchesLost = matchesPlayed - matchesWon;
        int totalPoints = player.getPoints();

        return String.format(
                """
                =================================
                        Player Statistics
                =================================
                Name: %s %s
                
                Matches Played:     %d
                Matches Won:        %d
                Matches Lost:       %d
                Total Points:       %d
                =================================
                """,
                player.getName(), player.getLastName(),
                matchesPlayed, matchesWon, matchesLost, totalPoints
        );
    }
}
