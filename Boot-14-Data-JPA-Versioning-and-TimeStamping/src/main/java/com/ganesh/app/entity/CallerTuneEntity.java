package com.ganesh.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "caller_tune")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CallerTuneEntity {
	@Id
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@NonNull
	private String tuneName;
	@NonNull
	private String movieName;
	@Version
	private Integer updateCount; // For Versing Feature
	@CreationTimestamp
	private LocalDateTime dateTime; // Insertion Date,Time
	@UpdateTimestamp
	private LocalDate lastlyUpdateOn; // Lastly updatig Date, Time
}
