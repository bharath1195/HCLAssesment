package com.bharath.bankapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.bankapp.dto.CustomerDTO;
import com.bharath.bankapp.service.CustomerService;

@RestController
@RequestMapping("/bank")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public String addCustomer(@RequestBody @Valid CustomerDTO customer)
	{
		return customerService.addCustomer(customer);
	}
}
