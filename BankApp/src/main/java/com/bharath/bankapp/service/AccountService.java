package com.bharath.bankapp.service;

import java.util.List;

import com.bharath.bankapp.dto.FundTransferDTO;
import com.bharath.bankapp.dto.AccountMonthlySummaryDTO;
import com.bharath.bankapp.exception.CustomException;

public interface AccountService {
	String fundTransfer(FundTransferDTO fundTransferDTO) throws CustomException;

	List<AccountMonthlySummaryDTO> monthlyStatement(Long accountNumber, int year, int month) throws CustomException;
}
