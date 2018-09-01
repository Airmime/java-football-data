package jfdata.model.match;

import java.util.List;
import jfdata.model.competition.CompetitionModel;

/**
 * Class model for Match list
 * @author remimarion
 */
public class MatchListModel {

	//ATTRIBUT
	private String count;
	private CompetitionModel competition;
	private List<MatchModel> matches;
	
	//CONSTRUCTOR
	public MatchListModel(String count, CompetitionModel competition, List<MatchModel> matches) {
		super();
		this.count = count;
		this.competition = competition;
		this.matches = matches;
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

	public List<MatchModel> getMatches() {
		return matches;
	}

	public void setMatches(List<MatchModel> matches) {
		this.matches = matches;
	}

	//METHOD
	@Override
	public String toString() {
		return "MatchListModel [count=" + count + ", competition=" + competition + ", matches=" + matches + "]";
	}
}
