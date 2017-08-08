package com.gda.newsi.service.impl;

import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gda.newsi.domain.User;
import com.gda.newsi.domain.dto.UserDto;
import com.gda.newsi.domain.dto.UserPasswordDto;
import com.gda.newsi.domain.dto.UserResetPasswordDto;
import com.gda.newsi.domain.dto.UserUpdateDto;
import com.gda.newsi.persisitent.UserRepository;
import com.gda.newsi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User addNewUser(UserDto userDto) {

		User existingUser = userRepository.findByLogin(userDto.getLogin().toLowerCase());

		if (existingUser != null) {
			throw new ValidationException(String.format("user with login %s already exist", userDto.getLogin()));
		}

		User newUser = new User();
		newUser.setLogin(userDto.getLogin());
		newUser.setFirstName(userDto.getFirstName());
		newUser.setLastName(userDto.getLastName());
		newUser.setEmail(userDto.getEmail());
		newUser.setPassword(passwordEncoder.encode(userDto.getPassword()));
		newUser.setCreatedBy(userDto.getCreatedBy());

		return userRepository.save(newUser);
	}

	@Override
	public User updateUser(String login, UserUpdateDto userUpdateDto) {
		User existingUser = userRepository.findByLogin(login.toLowerCase());

		if (existingUser == null) {
			throw new NotFoundException(String.format("user with login %s does not exist", login));
		}

		existingUser.setFirstName(userUpdateDto.getFirstName());
		existingUser.setLastName(userUpdateDto.getLastName());
		existingUser.setEmail(userUpdateDto.getEmail());
		existingUser.setCreatedBy(userUpdateDto.getCreatedBy());

		return userRepository.save(existingUser);
	}

	@Override
	public User getUser(String login) {
		return userRepository.findByLogin(login);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(String login) {
		User existingUser = userRepository.findByLogin(login.toLowerCase());

		if (existingUser == null) {
			throw new NotFoundException(String.format("user with login %s does not exist", login));
		}

		userRepository.delete(existingUser.getUserId());
	}

	@Override
	public void changeUserPassword(String login, UserPasswordDto userPasswordDto) {
		User existingUser = userRepository.findByLogin(login.toLowerCase());

		if (existingUser == null) {
			throw new NotFoundException(String.format("user with login %s does not exist", login));
		}

		if (!passwordEncoder.matches(userPasswordDto.getOldPassword(), existingUser.getPassword())) {
			throw new IllegalArgumentException(String.format("oldPassword does not match"));
		}

		if (!userPasswordDto.getNewPassword().equals(userPasswordDto.getConfirmNewPassword())) {
			throw new IllegalArgumentException(String.format("newPassword differe confirmNewPassword"));
		}

		existingUser.setPassword(passwordEncoder.encode(userPasswordDto.getNewPassword()));

		userRepository.save(existingUser);

	}

	@Override
	public User signIn(String login, String password) {
		User existingUser = userRepository.findByLogin(login.toLowerCase());

		if (existingUser == null) {
			throw new NotFoundException(String.format("user with login %s does not exist", login));
		}

		if (!passwordEncoder.matches(password, existingUser.getPassword())) {
			throw new AccessDeniedException("Invalid username/password");
		}

		return existingUser;

	}

	@Override
	public void resetPassword(String login, UserResetPasswordDto userResetPasswordDto) {
		User existingUser = userRepository.findByLogin(login.toLowerCase());

		if (existingUser == null) {
			throw new NotFoundException(String.format("user with login %s does not exist", login));
		}

		if (!userResetPasswordDto.getNewPassword().equals(userResetPasswordDto.getConfirmNewPassword())) {
			throw new IllegalArgumentException(String.format("newPassword differe confirmNewPassword"));
		}

		existingUser.setPassword(passwordEncoder.encode(userResetPasswordDto.getNewPassword()));

		userRepository.save(existingUser);

	}

}
