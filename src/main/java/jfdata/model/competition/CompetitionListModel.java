package jfdata.model.competition;

import java.util.List;

/**
 * Class model for Competition list
 * @author remimarion
 */
public class CompetitionListModel{
	
	//ATTRIBUT
	String count;
	List<CompetitionModel> competitions;
	
	//CONSTRUCTOR
	public CompetitionListModel(String id, List<CompetitionModel> competitions) {
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

	public List<CompetitionModel> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(List<CompetitionModel> competitions) {
		this.competitions = competitions;
	}

	//METHOD
	@Override
	public String toString() {
		return "CompetitionList [count=" + count + ", competitions=" + competitions + "]";
	}
}
