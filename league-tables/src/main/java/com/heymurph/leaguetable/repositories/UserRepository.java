package com.heymurph.leaguetable.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.heymurph.leaguetable.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
