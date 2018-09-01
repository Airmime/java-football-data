package jfdata.model.match;

/**
 * Class model for Score
 * @author remimarion
 */
public class MatchScoreModel {
	
	//ATTRIBUT
	private String winner;
	private String duration;
	private MatchTimeModel fullTime;
	private MatchTimeModel halfTime;
	private MatchTimeModel extraTime;
	private MatchTimeModel penalties;
	
	//CONSTRUCTOR
	public MatchScoreModel(String winner, String duration, MatchTimeModel fullTime, MatchTimeModel halfTime,
			MatchTimeModel extraTime, MatchTimeModel penalties) {
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

	public MatchTimeModel getFullTime() {
		return fullTime;
	}

	public void setFullTime(MatchTimeModel fullTime) {
		this.fullTime = fullTime;
	}

	public MatchTimeModel getHalfTime() {
		return halfTime;
	}

	public void setHalfTime(MatchTimeModel halfTime) {
		this.halfTime = halfTime;
	}

	public MatchTimeModel getExtraTime() {
		return extraTime;
	}

	public void setExtraTime(MatchTimeModel extraTime) {
		this.extraTime = extraTime;
	}

	public MatchTimeModel getPenalties() {
		return penalties;
	}

	public void setPenalties(MatchTimeModel penalties) {
		this.penalties = penalties;
	}

	//METHOD
	@Override
	public String toString() {
		return "MatchScoreModel [winner=" + winner + ", duration=" + duration + ", fullTime=" + fullTime + ", halfTime="
				+ halfTime + ", extraTime=" + extraTime + ", penalties=" + penalties + "]";
	}
}
