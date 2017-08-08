package com.gda.newsi.domain.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel
@JsonIgnoreProperties
public class UserPasswordDto {

	@NotBlank
	@Size(min = 6, max = 250)
	String oldPassword;

	@NotBlank
	@Size(min = 6, max = 250)
	String newPassword;

	@NotBlank
	@Size(min = 6, max = 250)
	String confirmNewPassword;

	public UserPasswordDto() {
		// empty
	}

	@JsonCreator
	public UserPasswordDto(@JsonProperty(value = "oldPassword") @NotBlank @Size(min = 6, max = 250) String oldPassword,
			@JsonProperty(value = "newPassword") @NotBlank @Size(min = 6, max = 250) String newPassword,
			@JsonProperty(value = "confirmNewPassword") @NotBlank @Size(min = 6, max = 250) String confirmNewPassword) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.confirmNewPassword = confirmNewPassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

}
