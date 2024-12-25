package com.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "customer")
@Entity
public class Customer {
	@Id
	@Column(name="cNo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cNo;
	
	@Column(name = "cName")
	private String cName;
	
	@Column(name = "cProduct")
	private String cProduct;
	
	@Column(name = "cBillAmt")
	private Double cBillAmt;
}
