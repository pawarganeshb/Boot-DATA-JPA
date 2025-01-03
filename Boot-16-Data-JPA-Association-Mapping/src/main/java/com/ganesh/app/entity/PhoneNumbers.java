package com.ganesh.app.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "p_numbers")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumbers implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "gen2", sequenceName = "Reg_no_seq", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen2", strategy = GenerationType.AUTO)
	private Integer regNo;
	@NonNull
	private Long mobileNo;
	@NonNull
	private String provider;
	@NonNull
	private String numberType;
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", referencedColumnName = "pid")
	private Person person;

	public PhoneNumbers() {
		System.out.println("PhoneNumber:: 0 param constructor");
	}

}
