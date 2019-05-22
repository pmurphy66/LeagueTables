package com.heymurph.leaguetable.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.heymurph.leaguetable.entity.Team;
import com.heymurph.leaguetable.service.TeamService;

@Controller
@RequestMapping("/teams")
public class TeamController {
	
	private TeamService teamService;
	
	@Autowired
	public TeamController(TeamService theTeamService) {
		this.teamService = theTeamService;
	}
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listTeams(Model theModel) {
		
		List<Team> theTeams = teamService.findAll();
		// add to the spring model
		theModel.addAttribute("teams", theTeams);
		
		return "teams/list-teams";
	}
	
	// add mapping for "/showFormForAdd"
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind the form data
		Team theTeam = new Team();
		theModel.addAttribute("team", theTeam);
	
		return "teams/team-form";
	}
	
	@PostMapping("/save")
	public String saveTeam(@ModelAttribute("team") Team theTeam) {
		
		// save the team
		teamService.save(theTeam);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/teams/list";
	}
	
	// add mapping for "/showFormForUpdate"
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("teamId") int theId, Model theModel) {
		
		// get the team data from the service
		Team theTeam = teamService.findById(theId);
		
		// set team as a model attribute to pre-populate the form
		theModel.addAttribute("team", theTeam);
		
		// send over to our form	
		return "teams/team-form";
	}
	
	// add mapping for "/delete"
	@GetMapping("/delete")
	public String delete(@RequestParam("teamId") int theId) {
		
		// delete the team
		teamService.deleteById(theId);
	
		// redirect to /teams/list	
		return "redirect:/teams/list";
	}
}

