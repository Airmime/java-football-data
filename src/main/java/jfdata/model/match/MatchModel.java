package jfdata.model.match;

import java.util.List;
import jfdata.model.competition.CompetitionModel;
import jfdata.model.competition.CompetitionSeasonModel;
import jfdata.model.team.TeamModel;

/**
 * Class model for Match
 * @author remimarion
 */
public class MatchModel {

	//ATTRIBUT
	private String id;
	private CompetitionModel competition;
	private CompetitionSeasonModel season;
	private String utcDate;
	private String status;
	private String venue;
	private String matchday;
	private String stage;
	private String group;
	private String lastUpdated;
	private TeamModel homeTeam;
	private TeamModel awayTeam;
	private MatchScoreModel score;
	
	//CONTRUCTOR
	List<MatchRefereesModel> referees;
	public MatchModel(String id, CompetitionModel competition, CompetitionSeasonModel season, String utcDate,
			String status, String venue, String matchday, String stage, String group, String lastUpdated,
			TeamModel homeTeam, TeamModel awayTeam, MatchScoreModel score, List<MatchRefereesModel> referees) {
		super();
		this.id = id;
		this.competition = competition;
		this.season = season;
		this.utcDate = utcDate;
		this.status = status;
		this.venue = venue;
		this.matchday = matchday;
		this.stage = stage;
		this.group = group;
		this.lastUpdated = lastUpdated;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.score = score;
		this.referees = referees;
	}
	
	//GET/SET
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUtcDate() {
		return utcDate;
	}
	public void setUtcDate(String utcDate) {
		this.utcDate = utcDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getMatchday() {
		return matchday;
	}
	public void setMatchday(String matchday) {
		this.matchday = matchday;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public TeamModel getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(TeamModel homeTeam) {
		this.homeTeam = homeTeam;
	}
	public TeamModel getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(TeamModel awayTeam) {
		this.awayTeam = awayTeam;
	}
	public MatchScoreModel getScore() {
		return score;
	}
	public void setScore(MatchScoreModel score) {
		this.score = score;
	}
	public List<MatchRefereesModel> getReferees() {
		return referees;
	}
	public void setReferees(List<MatchRefereesModel> referees) {
		this.referees = referees;
	}

	//METHODE
	@Override
	public String toString() {
		return "MatchModel [id=" + id + ", competition=" + competition + ", season=" + season + ", utcDate=" + utcDate
				+ ", status=" + status + ", venue=" + venue + ", matchday=" + matchday + ", stage=" + stage + ", group="
				+ group + ", lastUpdated=" + lastUpdated + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam
				+ ", score=" + score + ", referees=" + referees + "]";
	}
}
