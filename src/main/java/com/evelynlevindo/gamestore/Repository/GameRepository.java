package com.evelynlevindo.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.evelynlevindo.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game, Integer>{
    
}