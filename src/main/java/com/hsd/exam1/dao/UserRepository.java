package com.hsd.exam1.dao;

import com.hsd.exam1.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
