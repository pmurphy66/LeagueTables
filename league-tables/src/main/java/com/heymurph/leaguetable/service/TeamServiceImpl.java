package com.heymurph.leaguetable.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heymurph.leaguetable.entity.Team;
import com.heymurph.leaguetable.repositories.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

	private TeamRepository teamRepository;
	
	@Autowired
	public TeamServiceImpl(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	
	@Override
	public List<Team> findAll() {
		return teamRepository.findAllByOrderByNameAsc();
	}

	@Override
	public Team findById(int theId) {
		Optional<Team> result = teamRepository.findById(theId);
		Team theTeam = null;
		if (result.isPresent()) {
			theTeam = result.get();			
		} else {
			throw new RuntimeException("Team does not exist - " + theId);
		}
		return theTeam;
	}

	@Override
	public void save(Team theTeam) {
		teamRepository.save(theTeam);
	}

	@Override
	public void deleteById(int theId) {
		teamRepository.deleteById(theId);
	}
}
