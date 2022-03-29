package com.bharath.bankapp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;
	private String lastName;
	private String gender;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(unique = true, nullable = false)
	private String phone;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	@CreatedDate
	private LocalDateTime whenCreated;

	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Account> accounts;


	public Customer() {
		super();
	}

	public Customer(Long id, String firstName, String lastName, String gender, String email, String phone,
			LocalDate dob, LocalDateTime whenCreated, List<Account> accounts) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.whenCreated = whenCreated;
		this.accounts = accounts;
	}

	
}
