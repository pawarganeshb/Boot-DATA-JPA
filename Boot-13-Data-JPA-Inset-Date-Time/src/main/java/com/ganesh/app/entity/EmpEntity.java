package com.ganesh.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
@Table(name = "emp")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpEntity {
	@Id
	@SequenceGenerator(sequenceName = "emp_seq", name = "emp", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "emp_seq", strategy = GenerationType.AUTO)
	private Long empId;
	private String empName;
	private Double emp_salary;
	private LocalDate date;
	private LocalDateTime dateTime;
	private LocalTime localTime;
}
