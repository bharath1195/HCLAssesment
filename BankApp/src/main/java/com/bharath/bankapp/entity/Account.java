package com.bharath.bankapp.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long accountNumber;
	private BigDecimal accountBalance;

	@CreatedDate
	private LocalDateTime whenCreated;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	public Account(Long id, Long accountNumber, BigDecimal accountBalance, LocalDateTime whenCreated,
			Customer customer) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.whenCreated = whenCreated;
		this.customer = customer;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
