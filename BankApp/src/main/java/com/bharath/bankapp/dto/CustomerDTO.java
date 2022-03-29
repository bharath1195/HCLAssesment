package com.bharath.bankapp.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerDTO {

	@NotBlank(message = "First name is required")
	private String firstName;

	private String lastName;
	private String gender;

	@NotBlank(message = "Email is required")
	@Email
	private String email;

	@NotBlank(message = "Phone number is required")
	private String phone;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String firstName, String lastName, String gender, String email, String phone, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
}
