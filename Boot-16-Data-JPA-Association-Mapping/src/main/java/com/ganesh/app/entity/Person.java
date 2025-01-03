package com.ganesh.app.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "seq1", sequenceName = "phone_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "seq1", strategy = GenerationType.AUTO)
	private Integer pId;
	@NonNull
	private String pName;
	@NonNull
	private String pAddress;
	@OneToMany(targetEntity = PhoneNumbers.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "person")
	private Set<PhoneNumbers> contactDetail;

	public Person() {
		System.out.println("Person::0-param constructor");
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}

}
