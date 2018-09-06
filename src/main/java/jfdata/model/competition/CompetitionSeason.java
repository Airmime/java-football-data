package jfdata.model.competition;

/**
 * Class model for CompetitionSeason, for Competition Class
 * @author remimarion
 */
public class CompetitionSeason {

	//ATTRIBUT
	private String id;
	private String startDate;
	private String endDate;
	private String currentMatchday;
	
	//CONSTRUCTOR
	public CompetitionSeason() {
		super();
	}
	
	public CompetitionSeason(String id, String startDate, String endDate, String currentMatchday) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.currentMatchday = currentMatchday;
	}

	//GET/SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCurrentMatchday() {
		return currentMatchday;
	}

	public void setCurrentMatchday(String currentMatchday) {
		this.currentMatchday = currentMatchday;
	}

	//METHOD
	@Override
	public String toString() {
		return "CompetitionSeason [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", currentMatchday=" + currentMatchday + "]";
	}
}
