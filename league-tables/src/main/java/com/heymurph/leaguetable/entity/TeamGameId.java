package com.heymurph.leaguetable.entity;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class TeamGameId implements Serializable {

	private static final long serialVersionUID = 6202269445639364170L;
	private Team team;
	private Game game;
	
	@ManyToOne
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

	@ManyToOne
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
}