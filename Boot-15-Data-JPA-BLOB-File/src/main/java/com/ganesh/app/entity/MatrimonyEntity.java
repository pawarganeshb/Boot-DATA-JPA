package com.ganesh.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "matrimony")
@Data
public class MatrimonyEntity {
	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private Boolean isIndian;
	@NonNull
	private String address;
	@NonNull
	@Lob
	private byte[] photo;
	@NonNull
	@Lob
	private byte[] biodata;

	
}
