package jfdata.model.match;

/**
 * Class model for Score
 * @author remimarion
 */
public class MatchScore {
	
	//ATTRIBUT
	private String winner;
	private String duration;
	private MatchTime fullTime;
	private MatchTime halfTime;
	private MatchTime extraTime;
	private MatchTime penalties;
	
	//CONSTRUCTOR
	public MatchScore(String winner, String duration, MatchTime fullTime, MatchTime halfTime,
			MatchTime extraTime, MatchTime penalties) {
		super();
		this.winner = winner;
		this.duration = duration;
		this.fullTime = fullTime;
		this.halfTime = halfTime;
		this.extraTime = extraTime;
		this.penalties = penalties;
	}

	//GET/SET
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public MatchTime getFullTime() {
		return fullTime;
	}

	public void setFullTime(MatchTime fullTime) {
		this.fullTime = fullTime;
	}

	public MatchTime getHalfTime() {
		return halfTime;
	}

	public void setHalfTime(MatchTime halfTime) {
		this.halfTime = halfTime;
	}

	public MatchTime getExtraTime() {
		return extraTime;
	}

	public void setExtraTime(MatchTime extraTime) {
		this.extraTime = extraTime;
	}

	public MatchTime getPenalties() {
		return penalties;
	}

	public void setPenalties(MatchTime penalties) {
		this.penalties = penalties;
	}

	//METHOD
	@Override
	public String toString() {
		return "MatchScoreModel [winner=" + winner + ", duration=" + duration + ", fullTime=" + fullTime + ", halfTime="
				+ halfTime + ", extraTime=" + extraTime + ", penalties=" + penalties + "]";
	}
}
