package jfdata.model.standing;

import java.util.List;

import jfdata.model.competition.CompetitionModel;
import jfdata.model.competition.CompetitionSeasonModel;

/**
 * Class model for Standing list
 * @author remimarion
 */
public class StandingModel {

	//ATTRIBUT
	private CompetitionModel competition;
	private CompetitionSeasonModel season;
	private List<StandingTypeModel> standings;
	
	//CONSTRUCTOR
	public StandingModel(CompetitionModel competition, CompetitionSeasonModel season,
			List<StandingTypeModel> standings) {
		super();
		this.competition = competition;
		this.season = season;
		this.standings = standings;
	}

	//GET/SET
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

	public List<StandingTypeModel> getStandings() {
		return standings;
	}

	public void setStandings(List<StandingTypeModel> standings) {
		this.standings = standings;
	}

	//METHOD
	@Override
	public String toString() {
		return "StandingListModel [competition=" + competition + ", season=" + season + ", standings=" + standings
				+ "]";
	}
}
