package com.heymurph.leaguetable.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	private Integer id;
	private String division;
	private String date;
	private String homeTeam;
	private String awayTeam;
	private Integer fullTimeHomeGoals;
	private Integer fullTimeAwayGoals;
	private String fullTimeResult;
	private Integer halfTimeHomeGoals;
	private Integer halfTimeAwayGoals;
	private String halfTimeResult;
	private String referee;
	private Integer homeTeamShots;
	private Integer awayTeamShots;
	private Integer homeTeamShotsOnTarget;
	private Integer awayTeamShotsOnTarget;
	private Integer homeTeamCorners;
	private Integer awayTeamCorners;
	private Integer homeTeamFoulsCommitted;
	private Integer awayTeamFoulsCommitted;
	private Integer homeTeamYellowCards;
	private Integer awayTeamYellowCards;
	private Integer homeTeamRedCards;
	private Integer awayTeamRedCards;
	private Double b365h;
	private Double b365d;
	private Double b365a;
	private Double bwh;
	private Double bwd;
	private Double bwa;
	private Double iwh;
	private Double iwd;
	private Double iwa;
	private Double psh;
	private Double psd;
	private Double psa;
	private Double whh;
	private Double whd;
	private Double wha;
	private Double vch;
	private Double vcd;
	private Double vca;
	private Integer bb1x2;
	private Double bbmxh;
	private Double bbavh;
	private Double bbmxd;
	private Double bbavd;
	private Double bbmxa;
	private Double bbava;
	private Integer bbou;
	private Double bbmxg25;
	private Double bbavg25;
	private Double bbmxl25;
	private Double bbavl25;
	private Integer bbah;
	private Double bbahh;
	private Double bbmxahh;
	private Double bbavahh;
	private Double bbmxaha;
	private Double bbavaha;
	private Double psch;
	private Double pscd;
	private Double psca;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public Integer getFullTimeHomeGoals() {
		return fullTimeHomeGoals;
	}
	public void setFullTimeHomeGoals(Integer fullTimeHomeGoals) {
		this.fullTimeHomeGoals = fullTimeHomeGoals;
	}
	public Integer getFullTimeAwayGoals() {
		return fullTimeAwayGoals;
	}
	public void setFullTimeAwayGoals(Integer fullTimeAwayGoals) {
		this.fullTimeAwayGoals = fullTimeAwayGoals;
	}
	public String getFullTimeResult() {
		return fullTimeResult;
	}
	public void setFullTimeResult(String fullTimeResult) {
		this.fullTimeResult = fullTimeResult;
	}
	public Integer getHalfTimeHomeGoals() {
		return halfTimeHomeGoals;
	}
	public void setHalfTimeHomeGoals(Integer halfTimeHomeGoals) {
		this.halfTimeHomeGoals = halfTimeHomeGoals;
	}
	public Integer getHalfTimeAwayGoals() {
		return halfTimeAwayGoals;
	}
	public void setHalfTimeAwayGoals(Integer halfTimeAwayGoals) {
		this.halfTimeAwayGoals = halfTimeAwayGoals;
	}
	public String getHalfTimeResult() {
		return halfTimeResult;
	}
	public void setHalfTimeResult(String halfTimeResult) {
		this.halfTimeResult = halfTimeResult;
	}
	public String getReferee() {
		return referee;
	}
	public void setReferee(String referee) {
		this.referee = referee;
	}
	public Integer getHomeTeamShots() {
		return homeTeamShots;
	}
	public void setHomeTeamShots(Integer homeTeamShots) {
		this.homeTeamShots = homeTeamShots;
	}
	public Integer getAwayTeamShots() {
		return awayTeamShots;
	}
	public void setAwayTeamShots(Integer awayTeamShots) {
		this.awayTeamShots = awayTeamShots;
	}
	public Integer getHomeTeamShotsOnTarget() {
		return homeTeamShotsOnTarget;
	}
	public void setHomeTeamShotsOnTarget(Integer homeTeamShotsOnTarget) {
		this.homeTeamShotsOnTarget = homeTeamShotsOnTarget;
	}
	public Integer getAwayTeamShotsOnTarget() {
		return awayTeamShotsOnTarget;
	}
	public void setAwayTeamShotsOnTarget(Integer awayTeamShotsOnTarget) {
		this.awayTeamShotsOnTarget = awayTeamShotsOnTarget;
	}
	public Integer getHomeTeamCorners() {
		return homeTeamCorners;
	}
	public void setHomeTeamCorners(Integer homeTeamCorners) {
		this.homeTeamCorners = homeTeamCorners;
	}
	public Integer getAwayTeamCorners() {
		return awayTeamCorners;
	}
	public void setAwayTeamCorners(Integer awayTeamCorners) {
		this.awayTeamCorners = awayTeamCorners;
	}
	public Integer getHomeTeamFoulsCommitted() {
		return homeTeamFoulsCommitted;
	}
	public void setHomeTeamFoulsCommitted(Integer homeTeamFoulsCommitted) {
		this.homeTeamFoulsCommitted = homeTeamFoulsCommitted;
	}
	public Integer getAwayTeamFoulsCommitted() {
		return awayTeamFoulsCommitted;
	}
	public void setAwayTeamFoulsCommitted(Integer awayTeamFoulsCommitted) {
		this.awayTeamFoulsCommitted = awayTeamFoulsCommitted;
	}
	public Integer getHomeTeamYellowCards() {
		return homeTeamYellowCards;
	}
	public void setHomeTeamYellowCards(Integer homeTeamYellowCards) {
		this.homeTeamYellowCards = homeTeamYellowCards;
	}
	public Integer getAwayTeamYellowCards() {
		return awayTeamYellowCards;
	}
	public void setAwayTeamYellowCards(Integer awayTeamYellowCards) {
		this.awayTeamYellowCards = awayTeamYellowCards;
	}
	public Integer getHomeTeamRedCards() {
		return homeTeamRedCards;
	}
	public void setHomeTeamRedCards(Integer homeTeamRedCards) {
		this.homeTeamRedCards = homeTeamRedCards;
	}
	public Integer getAwayTeamRedCards() {
		return awayTeamRedCards;
	}
	public void setAwayTeamRedCards(Integer awayTeamRedCards) {
		this.awayTeamRedCards = awayTeamRedCards;
	}
	public Double getB365h() {
		return b365h;
	}
	public void setB365h(Double b365h) {
		this.b365h = b365h;
	}
	public Double getB365d() {
		return b365d;
	}
	public void setB365d(Double b365d) {
		this.b365d = b365d;
	}
	public Double getB365a() {
		return b365a;
	}
	public void setB365a(Double b365a) {
		this.b365a = b365a;
	}
	public Double getBwh() {
		return bwh;
	}
	public void setBwh(Double bwh) {
		this.bwh = bwh;
	}
	public Double getBwd() {
		return bwd;
	}
	public void setBwd(Double bwd) {
		this.bwd = bwd;
	}
	public Double getBwa() {
		return bwa;
	}
	public void setBwa(Double bwa) {
		this.bwa = bwa;
	}
	public Double getIwh() {
		return iwh;
	}
	public void setIwh(Double iwh) {
		this.iwh = iwh;
	}
	public Double getIwd() {
		return iwd;
	}
	public void setIwd(Double iwd) {
		this.iwd = iwd;
	}
	public Double getIwa() {
		return iwa;
	}
	public void setIwa(Double iwa) {
		this.iwa = iwa;
	}
	public Double getPsh() {
		return psh;
	}
	public void setPsh(Double psh) {
		this.psh = psh;
	}
	public Double getPsd() {
		return psd;
	}
	public void setPsd(Double psd) {
		this.psd = psd;
	}
	public Double getPsa() {
		return psa;
	}
	public void setPsa(Double psa) {
		this.psa = psa;
	}
	public Double getWhh() {
		return whh;
	}
	public void setWhh(Double whh) {
		this.whh = whh;
	}
	public Double getWhd() {
		return whd;
	}
	public void setWhd(Double whd) {
		this.whd = whd;
	}
	public Double getWha() {
		return wha;
	}
	public void setWha(Double wha) {
		this.wha = wha;
	}
	public Double getVch() {
		return vch;
	}
	public void setVch(Double vch) {
		this.vch = vch;
	}
	public Double getVcd() {
		return vcd;
	}
	public void setVcd(Double vcd) {
		this.vcd = vcd;
	}
	public Double getVca() {
		return vca;
	}
	public void setVca(Double vca) {
		this.vca = vca;
	}
	public Integer getBb1x2() {
		return bb1x2;
	}
	public void setBb1x2(Integer bb1x2) {
		this.bb1x2 = bb1x2;
	}
	public Double getBbmxh() {
		return bbmxh;
	}
	public void setBbmxh(Double bbmxh) {
		this.bbmxh = bbmxh;
	}
	public Double getBbavh() {
		return bbavh;
	}
	public void setBbavh(Double bbavh) {
		this.bbavh = bbavh;
	}
	public Double getBbmxd() {
		return bbmxd;
	}
	public void setBbmxd(Double bbmxd) {
		this.bbmxd = bbmxd;
	}
	public Double getBbavd() {
		return bbavd;
	}
	public void setBbavd(Double bbavd) {
		this.bbavd = bbavd;
	}
	public Double getBbmxa() {
		return bbmxa;
	}
	public void setBbmxa(Double bbmxa) {
		this.bbmxa = bbmxa;
	}
	public Double getBbava() {
		return bbava;
	}
	public void setBbava(Double bbava) {
		this.bbava = bbava;
	}
	public Integer getBbou() {
		return bbou;
	}
	public void setBbou(Integer bbou) {
		this.bbou = bbou;
	}
	public Double getBbmxg25() {
		return bbmxg25;
	}
	public void setBbmxg25(Double bbmxg25) {
		this.bbmxg25 = bbmxg25;
	}
	public Double getBbavg25() {
		return bbavg25;
	}
	public void setBbavg25(Double bbavg25) {
		this.bbavg25 = bbavg25;
	}
	public Double getBbmxl25() {
		return bbmxl25;
	}
	public void setBbmxl25(Double bbmxl25) {
		this.bbmxl25 = bbmxl25;
	}
	public Double getBbavl25() {
		return bbavl25;
	}
	public void setBbavl25(Double bbavl25) {
		this.bbavl25 = bbavl25;
	}
	public Integer getBbah() {
		return bbah;
	}
	public void setBbah(Integer bbah) {
		this.bbah = bbah;
	}
	public Double getBbahh() {
		return bbahh;
	}
	public void setBbahh(Double bbahh) {
		this.bbahh = bbahh;
	}
	public Double getBbmxahh() {
		return bbmxahh;
	}
	public void setBbmxahh(Double bbmxahh) {
		this.bbmxahh = bbmxahh;
	}
	public Double getBbavahh() {
		return bbavahh;
	}
	public void setBbavahh(Double bbavahh) {
		this.bbavahh = bbavahh;
	}
	public Double getBbmxaha() {
		return bbmxaha;
	}
	public void setBbmxaha(Double bbmxaha) {
		this.bbmxaha = bbmxaha;
	}
	public Double getBbavaha() {
		return bbavaha;
	}
	public void setBbavaha(Double bbavaha) {
		this.bbavaha = bbavaha;
	}
	public Double getPsch() {
		return psch;
	}
	public void setPsch(Double psch) {
		this.psch = psch;
	}
	public Double getPscd() {
		return pscd;
	}
	public void setPscd(Double pscd) {
		this.pscd = pscd;
	}
	public Double getPsca() {
		return psca;
	}
	public void setPsca(Double psca) {
		this.psca = psca;
	}
}
