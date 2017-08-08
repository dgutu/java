package com.gda.newsi.rest;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gda.newsi.domain.User;
import com.gda.newsi.domain.dto.UserDto;
import com.gda.newsi.domain.dto.UserPasswordDto;
import com.gda.newsi.domain.dto.UserResetPasswordDto;
import com.gda.newsi.domain.dto.UserUpdateDto;
import com.gda.newsi.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "add a new user")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUser(@Valid @RequestBody UserDto userDto) {
		return userService.addNewUser(userDto);
	}

	@ApiOperation(value = "update an existing user")
	@RequestMapping(value = "/update/{login}", method = RequestMethod.PUT)
	public User updateUser(@PathVariable String login, @Valid @RequestBody UserUpdateDto userUpdateDto) {
		return userService.updateUser(login, userUpdateDto);
	}

	@ApiOperation(value = "delete an existing user")
	@RequestMapping(value = "/delete/{login}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String login) {
		userService.deleteUser(login);
	}

	@ApiOperation(value = "get an user")
	@RequestMapping(value = "/list/{login}", method = RequestMethod.GET)
	public User getUser(@PathVariable String login) {
		return userService.getUser(login);
	}

	@ApiOperation(value = "get all users")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@ApiOperation(value = "change user password")
	@RequestMapping(value = "/change/password/{login}", method = RequestMethod.PUT)
	public void changeUserPassword(@PathVariable String login, @Valid @RequestBody UserPasswordDto userPasswordDto) {
		userService.changeUserPassword(login, userPasswordDto);
	}

	@ApiOperation(value = "user authentification")
	@RequestMapping(value = "/signIn/{login}/{password}", method = RequestMethod.GET)
	public User signIn(@NotEmpty @PathVariable String login, @NotEmpty @PathVariable String password) {
		return userService.signIn(login, password);
	}

	@ApiOperation(value = "reset user password")
	@RequestMapping(value = "/reset/password/{login}", method = RequestMethod.PUT)
	public void resetPassword(@NotEmpty @PathVariable String login,
			@Valid @RequestBody UserResetPasswordDto userResetPasswordDto) {
		userService.resetPassword(login, userResetPasswordDto);
	}

}
