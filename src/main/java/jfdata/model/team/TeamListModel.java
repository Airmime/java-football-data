package jfdata.model.team;

import java.util.List;

import jfdata.model.competition.CompetitionModel;
import jfdata.model.competition.CompetitionSeasonModel;

/**
 * Class model for Team list
 * @author remimarion
 */
public class TeamListModel {
	
	//ATTRIBUT
	private String count;
	private CompetitionModel competition;
	private CompetitionSeasonModel season;
	private List<TeamModel> teams;
	
	//CONSTRUCTOR
	public TeamListModel() {
		super();
	}
	
	public TeamListModel(String count, CompetitionModel competition, CompetitionSeasonModel season,
			List<TeamModel> teams) {
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

	public CompetitionModel getCompetition() {
		return competition;
	}

	public void setCompetition(CompetitionModel competition) {
		this.competition = competition;
	}

	public CompetitionSeasonModel getSeason() {
		return season;
	}

	public void setSeason(CompetitionSeasonModel season) {
		this.season = season;
	}

	public List<TeamModel> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamModel> teams) {
		this.teams = teams;
	}

	//METHOD
	@Override
	public String toString() {
		return "TeamListModel [count=" + count + ", competition=" + competition + ", season=" + season + ", teams="
				+ teams + "]";
	}
}
