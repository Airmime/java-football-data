package jfdata.model.competition;

import java.util.List;

/**
 * Class model for Competition list
 * @author remimarion
 */
public class CompetitionList{
	
	//ATTRIBUT
	private String count;
	private List<Competition> competitions;
	
	//CONSTRUCTOR
	public CompetitionList(String id, List<Competition> competitions) {
		super();
		this.count = id;
		this.competitions = competitions;
	}

	//GET/SET
	public String getId() {
		return count;
	}

	public void setId(String id) {
		this.count = id;
	}

	public List<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(List<Competition> competitions) {
		this.competitions = competitions;
	}

	//METHOD
	@Override
	public String toString() {
		return "CompetitionList [count=" + count + ", competitions=" + competitions + "]";
	}
}
