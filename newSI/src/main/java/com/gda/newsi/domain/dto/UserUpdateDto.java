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
public class UserUpdateDto {

	@Size(max = 250)
	private String firstName;

	@Size(max = 250)
	private String lastName;

	@NotBlank
	@Email
	@Size(max = 50)
	private String email;

	private Long createdBy;

	public UserUpdateDto() {
		// empty
	}

	@JsonCreator
	public UserUpdateDto(@JsonProperty(value = "firstName") @Size(max = 250) String firstName,
			@JsonProperty(value = "lastName") @Size(max = 250) String lastName,
			@JsonProperty(value = "email") @NotBlank @Email @Size(max = 50) String email,
			@JsonProperty(value = "createdBy") Long createdBy) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.createdBy = createdBy;
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

	public Long getCreatedBy() {
		return createdBy;
	}

}
