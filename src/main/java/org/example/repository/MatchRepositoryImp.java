package org.example.repository;

import org.example.model.Match;

import java.util.List;

public class MatchRepositoryImp implements Repository<Match, Integer>{

    @Override
    public Integer create(Match model) {
        return 0;
    }

    @Override
    public Match find(Integer id) {
        return null;
    }

    @Override
    public void update(Match model) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Match> getAll() {
        return List.of();
    }
}
