package com.example.puzzlegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puzzlegames.model.WordleGame;

public interface WordleGameRepository extends JpaRepository<WordleGame, Integer> {
	List<WordleGame> findByPlayerId(Integer playerId);
	List<WordleGame> findByGameTypeId(Integer gameTypeId);;
}
