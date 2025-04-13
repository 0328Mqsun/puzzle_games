package com.example.puzzlegames.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.puzzlegames.dto.PlayerRequest;
import com.example.puzzlegames.dto.PlayerResponse;
import com.example.puzzlegames.model.Player;
import com.example.puzzlegames.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public PlayerResponse createPlayer(PlayerRequest request) {

		if (request.getName() == null || request.getName().isBlank()) {
			return new PlayerResponse("請輸入有效的名稱");
		}

		Optional<Player> optionalPlayer = playerRepository.findByName(request.getName());

		if (optionalPlayer.isPresent()) {
			return new PlayerResponse("該名稱已被使用");
		}

		Player player = new Player();
		player.setName(request.getName());

		Player saved = playerRepository.save(player);
		return new PlayerResponse(saved);
	}

	public PlayerResponse getPlayerById(Integer id) {
		Optional<Player> optional = playerRepository.findById(id);
		if (optional.isPresent()) {
			return new PlayerResponse(optional.get());
		} else {
			return new PlayerResponse("找不到該玩家");
		}
	}

	public PlayerResponse getPlayerByName(String name) {
		Optional<Player> optional = playerRepository.findByName(name);
		if (optional.isEmpty()) {
			return new PlayerResponse("找不到該名稱的玩家");
		}
		return new PlayerResponse(optional.get());
	}
}
