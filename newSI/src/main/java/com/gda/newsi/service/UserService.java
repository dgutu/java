package com.gda.newsi.service;

import java.util.List;

import com.gda.newsi.domain.User;
import com.gda.newsi.domain.dto.UserDto;
import com.gda.newsi.domain.dto.UserPasswordDto;
import com.gda.newsi.domain.dto.UserResetPasswordDto;
import com.gda.newsi.domain.dto.UserUpdateDto;

public interface UserService {

	User addNewUser(UserDto userDto);

	User updateUser(String login, UserUpdateDto userUpdateDto);

	User getUser(String login);

	List<User> getAllUsers();

	void deleteUser(String login);

	void changeUserPassword(String login, UserPasswordDto userPasswordDto);

	User signIn(String login, String password);

	void resetPassword(String login, UserResetPasswordDto userResetPasswordDto);

}
