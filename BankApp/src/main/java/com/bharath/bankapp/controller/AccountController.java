package com.bharath.bankapp.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.bankapp.dto.FundTransferDTO;
import com.bharath.bankapp.dto.AccountMonthlySummaryDTO;
import com.bharath.bankapp.exception.CustomException;
import com.bharath.bankapp.service.AccountService;

@RestController
@RequestMapping("/bank")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/customer/account")
	public String fundTransfer(@RequestBody @Valid FundTransferDTO fundTransferDTO) throws CustomException {
		return accountService.fundTransfer(fundTransferDTO);
	}

	@GetMapping("/customer/account")
	public List<AccountMonthlySummaryDTO> monthlyStatement(@RequestParam Long accountNumber, @RequestParam int year,
			@RequestParam int month) throws CustomException {
		if (!(month > 0 & month < 13)) {
			throw new CustomException("Invalid value for month");
		}
		if (LocalDate.now().getYear() < (year-1)) {
			throw new CustomException("Invalid value for year");
		}
		if (LocalDate.now().getYear() == year & LocalDate.now().getMonthValue() < month) {
			throw new CustomException("Invalid value for month");
		}
		return accountService.monthlyStatement(accountNumber, year, month);
	}
}
