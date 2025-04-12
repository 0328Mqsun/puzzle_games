package com.example.puzzlegames.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WordleGuessRequest {
    private Integer gameId;         
    private String playerInput;    
}
