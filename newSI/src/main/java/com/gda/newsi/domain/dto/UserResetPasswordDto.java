package com.gda.newsi.domain.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResetPasswordDto {

	@NotBlank
	@Size(min = 6, max = 250)
	String newPassword;

	@NotBlank
	@Size(min = 6, max = 250)
	String confirmNewPassword;

	public UserResetPasswordDto() {
		// empty
	}

	@JsonCreator
	public UserResetPasswordDto(
			@JsonProperty(value = "newPassword") @NotBlank @Size(min = 6, max = 250) String newPassword,
			@JsonProperty(value = "confirmNewPassword") @NotBlank @Size(min = 6, max = 250) String confirmNewPassword) {
		super();
		this.newPassword = newPassword;
		this.confirmNewPassword = confirmNewPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

}
