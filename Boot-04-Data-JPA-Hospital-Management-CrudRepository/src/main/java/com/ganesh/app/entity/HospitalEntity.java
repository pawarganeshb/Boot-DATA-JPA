package com.ganesh.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hospital_management")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_seq_generator")
	@SequenceGenerator(name = "hospital_seq_generator", sequenceName = "hospital_seq", initialValue = 100, allocationSize = 1)
	@Column(name = "h_id") // Explicitly specifying the column name
	private Integer id;

	@Column(name = "hospital_name", nullable = false, length = 100)
	private String name;

	@Column(name = "owner", nullable = false, length = 50)
	private String owner;

	@Column(name = "salary", nullable = false)
	private Double salary;
}
