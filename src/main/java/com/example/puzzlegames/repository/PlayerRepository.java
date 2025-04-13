package com.example.puzzlegames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puzzlegames.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	Optional<Player> findByName(String name);
	
}
