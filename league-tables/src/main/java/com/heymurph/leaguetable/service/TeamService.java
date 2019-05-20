package com.heymurph.leaguetable.service;

import java.util.List;

import com.heymurph.leaguetable.entity.Team;

public interface TeamService {

	public List<Team> findAll();
	
	public Team findById(int theId);
	
	public void save(Team theTeam);
	
	public void deleteById(int theId);
	
}
