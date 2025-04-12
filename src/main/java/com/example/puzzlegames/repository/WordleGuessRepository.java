package com.example.puzzlegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puzzlegames.model.WordleGuess;

public interface WordleGuessRepository extends JpaRepository<WordleGuess, Integer> {
	List<WordleGuess> findByGameId(Integer gameId);
}
