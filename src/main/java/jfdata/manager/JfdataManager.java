package jfdata.manager;

import jfdata.model.competition.CompetitionList;
import jfdata.model.competition.Competition;
import jfdata.model.match.MatchList;
import jfdata.model.match.Match;
import jfdata.model.player.Player;
import jfdata.model.standing.Standing;
import jfdata.model.team.TeamList;
import jfdata.model.team.Team;
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
	public CompetitionList getAllCompetitions() {
		UtilJson<CompetitionList> utilJson = new UtilJson<CompetitionList>();
		return utilJson.getObjectFromJson(URI + "competitions/", CompetitionList.class);
	}
	
	/**
	 * Get Competition by Id
	 * @param IdCompetition
	 * @return Competition object
	 */
	public Competition getCompetition(int IdCompetition) {
		UtilJson<Competition> utilJson = new UtilJson<Competition>();
		return utilJson.getObjectFromJson(URI + "competitions/" + IdCompetition, Competition.class);
	}
	
	/**
	 * Get teams from a competition
	 * @param IdCompetition
	 * @return TeamListModel who contains list of TeamModel
	 */
	public TeamList getTeamsByCompetition(int idCompetition) {
		UtilJson<TeamList> utilJson = new UtilJson<TeamList>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ idCompetition +"/teams", TeamList.class);
	}
	
	/**
	 * Get team
	 * @param idTeam
	 * @return Team object
	 */
	public Team getTeam(int idTeam) {
		UtilJson<Team> utilJson = new UtilJson<Team>();
		return utilJson.getObjectFromJson(URI + "teams/"+ idTeam, Team.class);
	}
	
	/**
	 * Get Player
	 * @param idPlayer
	 * @return Player object
	 */
	public Player getPlayer(int idPlayer) {
		UtilJson<Player> utilJson = new UtilJson<Player>();
		return utilJson.getObjectFromJson(URI + "players/"+ idPlayer, Player.class);
	}
	
	/**
	 * Get Standing
	 * @param idCompetition
	 * @return Standing object
	 */
	public Standing getStanding(int idCompetition) {
		UtilJson<Standing> utilJson = new UtilJson<Standing>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ idCompetition + "/standings", Standing.class);
	}
	
	/**
	 * Get match by ID
	 * @param idMatch
	 * @return MatchModel object
	 */
	public Match getMatch(int idMatch ) {
		UtilJson<Match> utilJson = new UtilJson<Match>();
		return utilJson.getObjectFromJson(URI + "matches/"+ idMatch, Match.class);
	}
	
	/**
	 * Get matchs from a competition
	 * @param idCompetition
	 * @return MatchListModel object
	 */
	public MatchList getMatchesByCompetition(int idCompetition ) {
		UtilJson<MatchList> utilJson = new UtilJson<MatchList>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ idCompetition + "/matches", MatchList.class);
	}
	
	/**
	 * Get matchs from a team
	 * @param idCompetition
	 * @return MatchListModel object
	 */
	public MatchList getMatchesByTeam(int idTeam) {
		UtilJson<MatchList> utilJson = new UtilJson<MatchList>();
		return utilJson.getObjectFromJson(URI + "teams/"+ idTeam + "/matches", MatchList.class);
	}
}
