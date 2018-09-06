package jfdata.model.match;

import java.util.List;
import jfdata.model.competition.Competition;

/**
 * Class model for Match list
 * @author remimarion
 */
public class MatchList {

	//ATTRIBUT
	private String count;
	private Competition competition;
	private List<Match> matches;
	
	//CONSTRUCTOR
	public MatchList(String count, Competition competition, List<Match> matches) {
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

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	//METHOD
	@Override
	public String toString() {
		return "MatchListModel [count=" + count + ", competition=" + competition + ", matches=" + matches + "]";
	}
}
