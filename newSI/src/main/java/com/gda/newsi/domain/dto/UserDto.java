package com.gda.newsi.domain.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel
@JsonIgnoreProperties
public class UserDto {

	@NotBlank
	@Size(max = 250)
	private String login;

	@Size(max = 250)
	private String firstName;

	@Size(max = 250)
	private String lastName;

	@NotBlank
	@Email
	@Size(max = 50)
	private String email;

	@NotBlank
	@Size(min = 6, max = 250)
	private String password;

	private Long createdBy;

	public UserDto() {
		// empty
	}

	@JsonCreator
	public UserDto(@JsonProperty(value = "login") @NotBlank @Size(max = 250) String login,
			@JsonProperty(value = "firstName") @Size(max = 250) String firstName,
			@JsonProperty(value = "lastName") @Size(max = 250) String lastName,
			@JsonProperty(value = "email") @NotBlank @Email @Size(max = 50) String email,
			@JsonProperty(value = "password") @NotBlank @Size(min = 6, max = 250) String password,
			@JsonProperty(value = "createdBy") Long createdBy) {
		super();
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.createdBy = createdBy;
	}

	public String getLogin() {
		return login;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

}
