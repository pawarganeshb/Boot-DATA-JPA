package com.ganesh.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hospital_management")
public class HospitalEntity {
	@Id
	private Integer h_id;
	private String hospital_name;
	private String owner;
	private Double salary;
}
