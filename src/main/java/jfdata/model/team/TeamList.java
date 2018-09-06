package jfdata.model.team;

import java.util.List;

import jfdata.model.competition.Competition;
import jfdata.model.competition.CompetitionSeason;

/**
 * Class model for Team list
 * @author remimarion
 */
public class TeamList {
	
	//ATTRIBUT
	private String count;
	private Competition competition;
	private CompetitionSeason season;
	private List<Team> teams;
	
	//CONSTRUCTOR
	public TeamList() {
		super();
	}
	
	public TeamList(String count, Competition competition, CompetitionSeason season,
			List<Team> teams) {
		super();
		this.count = count;
		this.competition = competition;
		this.season = season;
		this.teams = teams;
	}

	//GET/SET
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public CompetitionSeason getSeason() {
		return season;
	}

	public void setSeason(CompetitionSeason season) {
		this.season = season;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	//METHOD
	@Override
	public String toString() {
		return "TeamListModel [count=" + count + ", competition=" + competition + ", season=" + season + ", teams="
				+ teams + "]";
	}
}
