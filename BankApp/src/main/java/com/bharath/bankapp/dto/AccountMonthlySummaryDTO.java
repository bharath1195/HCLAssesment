package com.bharath.bankapp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AccountMonthlySummaryDTO {

	private String transactionNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate transactionDate;
	private BigDecimal amount;
	private String transactionType;
	private Long otherAccount;
	

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Long getOtherAccount() {
		return otherAccount;
	}

	public void setOtherAccount(Long otherAccount) {
		this.otherAccount = otherAccount;
	}

	public AccountMonthlySummaryDTO(String transactionNumber, LocalDate transactionDate, BigDecimal amount,
			String transactionType, Long otherAccount) {
		super();
		this.transactionNumber = transactionNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.transactionType = transactionType;
		this.otherAccount = otherAccount;
	}

	public AccountMonthlySummaryDTO() {
		super();
	}

}
