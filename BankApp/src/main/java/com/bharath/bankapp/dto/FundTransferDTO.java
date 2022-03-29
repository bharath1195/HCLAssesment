package com.bharath.bankapp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FundTransferDTO {

	@Min(value = 1,message = "Amount should be greater than 1")
	private BigDecimal amount;
	
	@NotNull(message = "From Account is required")
	private Long fromAccount;
	
	@NotNull(message = "To Account is required")
	private Long toAccount;
	private String comments;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private LocalDate transactionDate;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Long getToAccount() {
		return toAccount;
	}

	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public FundTransferDTO(BigDecimal amount, Long fromAccount, Long toAccount, String comments, LocalDate transactionDate) {
		super();
		this.amount = amount;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.comments = comments;
		this.transactionDate = transactionDate;
	}

	public FundTransferDTO() {
		super();
	}

}
