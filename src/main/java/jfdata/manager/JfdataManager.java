package jfdata.manager;

import jfdata.model.competition.CompetitionListModel;
import jfdata.model.competition.CompetitionModel;
import jfdata.model.match.MatchListModel;
import jfdata.model.match.MatchModel;
import jfdata.model.player.PlayerModel;
import jfdata.model.standing.StandingModel;
import jfdata.model.team.TeamListModel;
import jfdata.model.team.TeamModel;
import jfdata.util.UtilJson;

/**
 * The JfdataManager class is the entry point of the libary, it must be instance with your personal token obtained on the football-data.org website. 
 * @author remimarion
 */
public class JfdataManager{

	public static String TOKEN;
	private static final String URI = "https://api.football-data.org/v2/";

	@SuppressWarnings("static-access")
	/**
	 * JfdataManager constructor
	 * @param Personnal token
	 */
	public JfdataManager(String token) {
		super();
		this.TOKEN = token;
	}
	
	/**
	 * Get all competitions
	 * @return CompetitionListModel who contains list of CompetitionModel
	 */
	public CompetitionListModel getAllCompetitions() {
		UtilJson<CompetitionListModel> utilJson = new UtilJson<CompetitionListModel>();
		return utilJson.getObjectFromJson(URI + "competitions/", CompetitionListModel.class);
	}
	
	/**
	 * Get Competition by Id
	 * @param IdCompetition
	 * @return Competition object
	 */
	public CompetitionModel getCompetition(int IdCompetition) {
		UtilJson<CompetitionModel> utilJson = new UtilJson<CompetitionModel>();
		return utilJson.getObjectFromJson(URI + "competitions/" + IdCompetition, CompetitionModel.class);
	}
	
	/**
	 * Get teams from a competition
	 * @param IdCompetition
	 * @return TeamListModel who contains list of TeamModel
	 */
	public TeamListModel GetTeamsByCompetition(int idCompetition) {
		UtilJson<TeamListModel> utilJson = new UtilJson<TeamListModel>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ idCompetition +"/teams", TeamListModel.class);
	}
	
	/**
	 * Get team
	 * @param idTeam
	 * @return Team object
	 */
	public TeamModel GetTeam(int idTeam) {
		UtilJson<TeamModel> utilJson = new UtilJson<TeamModel>();
		return utilJson.getObjectFromJson(URI + "teams/"+ idTeam, TeamModel.class);
	}
	
	/**
	 * Get Player
	 * @param idPlayer
	 * @return Player object
	 */
	public PlayerModel GetPlayer(int idPlayer) {
		UtilJson<PlayerModel> utilJson = new UtilJson<PlayerModel>();
		return utilJson.getObjectFromJson(URI + "players/"+ idPlayer, PlayerModel.class);
	}
	
	/**
	 * Get Standing
	 * @param idCompetition
	 * @return Standing object
	 */
	public StandingModel getStanding(int idCompetition) {
		UtilJson<StandingModel> utilJson = new UtilJson<StandingModel>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ idCompetition + "/standings", StandingModel.class);
	}
	
	/**
	 * Get match by ID
	 * @param idMatch
	 * @return MatchModel object
	 */
	public MatchModel getMatch(int idMatch ) {
		UtilJson<MatchModel> utilJson = new UtilJson<MatchModel>();
		return utilJson.getObjectFromJson(URI + "matches/"+ idMatch, MatchModel.class);
	}
	
	/**
	 * Get matchs from a competition
	 * @param idCompetition
	 * @return MatchListModel object
	 */
	public MatchListModel getMatchByCompetition(int idCompetition ) {
		UtilJson<MatchListModel> utilJson = new UtilJson<MatchListModel>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ idCompetition + "/matches", MatchListModel.class);
	}
	
	/**
	 * Get matchs from a team
	 * @param idCompetition
	 * @return MatchListModel object
	 */
	public MatchListModel getMatchByTeam(int idTeam) {
		UtilJson<MatchListModel> utilJson = new UtilJson<MatchListModel>();
		return utilJson.getObjectFromJson(URI + "teams/"+ idTeam + "/matches", MatchListModel.class);
	}
}
