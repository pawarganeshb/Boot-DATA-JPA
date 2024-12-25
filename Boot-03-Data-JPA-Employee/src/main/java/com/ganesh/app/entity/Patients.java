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
@NoArgsConstructor
@AllArgsConstructor
public class Patients {
	@Column
	@Id
	@SequenceGenerator(name = "ganeshGenerator", sequenceName = "employee_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "ganeshGenerator", strategy = GenerationType.SEQUENCE)
	private Integer empNo;

	@Column
	private String empName;

	@Column
	private String department;

	@Column
	private Double salary;

}
