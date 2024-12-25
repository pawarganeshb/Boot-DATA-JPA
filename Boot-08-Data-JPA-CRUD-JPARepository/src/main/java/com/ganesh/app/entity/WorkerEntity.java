package com.ganesh.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "workers")
@NoArgsConstructor
@AllArgsConstructor
public class WorkerEntity {
	@Id
	@SequenceGenerator(name = "w_seq", sequenceName = "worker_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "w_seq", strategy = GenerationType.IDENTITY)
	private Integer wId;
	private String wName;
	private Float salary;
}
