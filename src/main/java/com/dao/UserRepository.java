package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.signUp;
import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<signUp, Long> {
	    List<signUp> findByemail(String username);
}
