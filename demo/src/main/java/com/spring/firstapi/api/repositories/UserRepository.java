package com.spring.firstapi.api.repositories;

import com.spring.firstapi.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
