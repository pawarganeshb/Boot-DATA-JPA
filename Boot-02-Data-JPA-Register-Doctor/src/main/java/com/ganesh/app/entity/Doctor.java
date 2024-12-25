package com.ganesh.app.entity;

import jakarta.persistence.Column;
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
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	@Id
	@Column
	@SequenceGenerator(name = "ganeshGenerator", sequenceName = "doc_seq", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "ganeshGenerator", strategy = GenerationType.SEQUENCE)
	private Integer dId;

	@Column
	private String dName;

	@Column
	private String shiftTime;

	@Column
	private String department;
}
