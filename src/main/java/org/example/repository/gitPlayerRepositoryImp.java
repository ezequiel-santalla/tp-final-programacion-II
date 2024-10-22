package org.example.repository;

import org.example.model.Player;

import java.util.List;

public class gitPlayerRepositoryImp implements Repository<Player, Integer> {

    @Override
    public Integer create(Player model) {
        return 0;
    }

    @Override
    public Player find(Integer id) {
        return null;
    }

    @Override
    public void update(Player model) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Player> getAll() {
        return List.of();
    }
}
