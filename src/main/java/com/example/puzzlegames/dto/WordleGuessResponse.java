package com.example.puzzlegames.dto;

import com.example.puzzlegames.model.WordleGuess;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class WordleGuessResponse {
	private Integer guessId;
	private Integer gameId;
	private String playerInput;
	private String feedback;
	private Boolean success;
	private Integer guessesLeft;
	private LocalDateTime createdAt;

	public WordleGuessResponse(WordleGuess guess) {
		this.guessId = guess.getId();
		this.gameId = guess.getGame().getId();
		this.playerInput = guess.getPlayerInput();
		this.feedback = guess.getFeedback();
		this.success = guess.getGame().getSuccess();
		this.guessesLeft = guess.getGame().getGuessesLeft();
		this.createdAt = guess.getCreatedAt();
	}

	// 多參數版本
	public WordleGuessResponse(Integer guessId, Integer gameId, String playerInput, String feedback, Boolean success,
			Integer guessesLeft, LocalDateTime createdAt) {
		this.guessId = guessId;
		this.gameId = gameId;
		this.playerInput = playerInput;
		this.feedback = feedback;
		this.success = success;
		this.guessesLeft = guessesLeft;
		this.createdAt = createdAt;
	}

	public WordleGuessResponse() {

	}
}
