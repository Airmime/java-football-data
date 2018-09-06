package jfdata.model.match;

/**
 * Class model for time score
 * @author remimarion
 */
public class MatchTime {

	//ATTRIBUT
	private String homeTeam;
	private String awayTeam;
	
	//CONSTRUCTOR
	public MatchTime(String homeTeam, String awayTeam) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	//GET/SET
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

	//MEtHOD
	@Override
	public String toString() {
		return "MatchTimeModel [homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + "]";
	}
}
