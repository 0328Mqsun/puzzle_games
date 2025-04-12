package com.example.puzzlegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puzzlegames.model.GameType;

public interface GameTypeRepository extends JpaRepository<GameType, Integer> {
	GameType findByName(String name);
}
