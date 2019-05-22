package com.heymurph.leaguetable.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heymurph.leaguetable.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

	// add a method to sort by last name
	public List<Team> findAllByOrderByNameAsc();
	
}
