package jfdata.model.team;

import java.util.List;

import jfdata.model.area.Area;
import jfdata.model.competition.Competition;
import jfdata.model.player.Player;

/**
 * Class model for Team
 * @author remimarion
 */
public class Team {
	
	//ATTRIBUT
	private String id;
	private Area area;
	private List<Competition> activeCompetitions;
	private String name;
	private String shortName;
	private String tla;
	private String address;
	private String phone;
	private String website;
	private String email;
	private String founded;
	private String clubColors;
	private String venue;
	private List<Player> squad;
	private String lastUpdated;
	
	//CONSTRUCTOR
	public Team() {
		super();
	}

	public Team(String id, Area area, List<Competition> activeCompetitions, String name,
			String shortName, String tla, String address, String phone, String website, String email, String founded,
			String clubColors, String venue, List<Player> squad, String lastUpdated) {
		super();
		this.id = id;
		this.area = area;
		this.activeCompetitions = activeCompetitions;
		this.name = name;
		this.shortName = shortName;
		this.tla = tla;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.email = email;
		this.founded = founded;
		this.clubColors = clubColors;
		this.venue = venue;
		this.squad = squad;
		this.lastUpdated = lastUpdated;
	}

	//GET/SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTla() {
		return tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public String getClubColors() {
		return clubColors;
	}

	public void setClubColors(String clubColors) {
		this.clubColors = clubColors;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public List<Competition> getActiveCompetitions() {
		return activeCompetitions;
	}

	public void setActiveCompetitions(List<Competition> activeCompetitions) {
		this.activeCompetitions = activeCompetitions;
	}

	public List<Player> getSquad() {
		return squad;
	}

	public void setSquad(List<Player> squad) {
		this.squad = squad;
	}

	//METHOD
	@Override
	public String toString() {
		return "TeamModel [id=" + id + ", area=" + area + ", activeCompetitions=" + activeCompetitions + ", name="
				+ name + ", shortName=" + shortName + ", tla=" + tla + ", address=" + address + ", phone=" + phone
				+ ", website=" + website + ", email=" + email + ", founded=" + founded + ", clubColors=" + clubColors
				+ ", venue=" + venue + ", squad=" + squad + ", lastUpdated=" + lastUpdated + "]";
	}
}
