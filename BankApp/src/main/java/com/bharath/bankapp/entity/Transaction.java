package com.bharath.bankapp.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private BigDecimal amount;
	private String transactionNumber;

	private Long fromAccount;
	private Long toAccount;
	private String comments;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate transactionDate;

	public Transaction() {
		super();
	}

	public Transaction(Long id, BigDecimal amount, String transactionNumber, Long fromAccount, Long toAccount,
			String comments, LocalDate transactionDate) {
		super();
		this.id = id;
		this.amount = amount;
		this.transactionNumber = transactionNumber;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.comments = comments;
		this.transactionDate = transactionDate;
	}

}
