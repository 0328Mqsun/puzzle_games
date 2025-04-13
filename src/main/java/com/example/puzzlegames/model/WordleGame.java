package com.example.puzzlegames.model;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@ToString(exclude = "guesses")
@Entity
@Table(name="wordle_games")
public class WordleGame {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "player_id",nullable = false)
	private Player player;
	
	@ManyToOne
	@JoinColumn(name = "game_type_id",nullable = false)
	private GameType gameType;
	
	@Column(name = "answer_word",nullable = false)
	private String answerWord;
	
	@Column(name = "word_length",nullable = false)
	private Integer wordLength;
	
	@Column(name = "max_guesses",nullable = false)
	private Integer maxGuesses;
	
	@Column(name = "guesses_left",nullable = false)
	private Integer guessesLeft;
	
	@Column(name = "success")
	private Boolean success;
	
	@Column(name = "total_seconds")
	private Integer totalSeconds;
	
	@Column(name = "start_time")
    private LocalDateTime startTime;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY)
    private List<WordleGuess> guesses;
}
