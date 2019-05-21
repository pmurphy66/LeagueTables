package com.heymurph.leaguetable.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class TeamGame{

	private TeamGameId pk;

	@EmbeddedId
	public TeamGameId getPk() {
		return pk;
	}

	public void setPk(TeamGameId pk) {
	  this.pk = pk;
  }
}