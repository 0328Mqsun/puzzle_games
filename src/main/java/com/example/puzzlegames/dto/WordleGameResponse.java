package com.example.puzzlegames.dto;

import com.example.puzzlegames.model.WordleGame;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class WordleGameResponse {
    private Integer gameId;
    private Integer playerId;
    private Integer gameTypeId;
    private Integer wordLength;
    private Integer maxGuesses;
    private Integer guessesLeft;
    private Boolean success;
    private LocalDateTime startTime;
    private LocalDateTime createdAt;

    public WordleGameResponse(WordleGame game) {
        this.gameId = game.getId();
        this.playerId = game.getPlayer().getId();
        this.gameTypeId = game.getGameType().getId();
        this.wordLength = game.getWordLength();
        this.maxGuesses = game.getMaxGuesses();
        this.guessesLeft = game.getGuessesLeft();
        this.success = game.getSuccess();
        this.startTime = game.getStartTime();
        this.createdAt = game.getCreatedAt();
    }

    public WordleGameResponse() {
    }
}
