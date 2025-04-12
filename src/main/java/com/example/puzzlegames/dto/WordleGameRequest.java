package com.example.puzzlegames.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WordleGameRequest {
    private Integer playerId;     
    private Integer gameTypeId;   
    private String answerWord;    
    private Integer maxGuesses;   
}