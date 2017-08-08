package com.gda.newsi.persisitent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gda.newsi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE lower(u.login) = ?1")
	User findByLogin(String login);
}
