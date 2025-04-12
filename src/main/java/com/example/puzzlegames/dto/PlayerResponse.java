package com.example.puzzlegames.dto;

import com.example.puzzlegames.model.Player;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PlayerResponse {
    private Integer id;
    private String name;
    private String message;
    private LocalDateTime createdAt;

    
    public PlayerResponse(Player player) {
        this.id = player.getId();
        this.name = player.getName();
        this.createdAt = player.getCreatedAt();
        this.message = "建立成功";
    }

    
    public PlayerResponse(String message) {
        this.message = message;
    }

    public PlayerResponse() {
        
    }
}
