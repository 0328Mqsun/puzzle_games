package com.example.puzzlegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puzzlegames.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	Player findByName(String name); 
	
}
