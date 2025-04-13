package com.example.puzzlegames.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "game")
@Entity
@Table(name = "wordle_guesses")
public class WordleGuess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private WordleGame game;

    @Column(name = "player_input",nullable = false, length = 10)
    private String playerInput;

    @Column(name = "feedback", nullable = false, length = 10)
    private String feedback;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
