package jfdata.model.team;

import java.util.List;

import jfdata.model.area.AreaModel;
import jfdata.model.competition.CompetitionModel;
import jfdata.model.player.PlayerModel;

/**
 * Class model for Team
 * @author remimarion
 */
public class TeamModel {
	
	//ATTRIBUT
	String id;
	AreaModel area;
	List<CompetitionModel> activeCompetitions;
	String name;
	String shortName;
	String tla;
	String address;
	String phone;
	String website;
	String email;
	String founded;
	String clubColors;
	String venue;
	List<PlayerModel> squad;
	String lastUpdated;
	
	//CONSTRUCTOR
	public TeamModel() {
		super();
	}

	public TeamModel(String id, AreaModel area, List<CompetitionModel> activeCompetitions, String name, String shortName,
			String tla, String address, String phone, String website, String email, String founded, String clubColors,
			String venue, List<PlayerModel> squad, String lastUpdated) {
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

	public AreaModel getArea() {
		return area;
	}

	public void setArea(AreaModel area) {
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

	public List<CompetitionModel> getActiveCompetitions() {
		return activeCompetitions;
	}

	public void setActiveCompetitions(List<CompetitionModel> activeCompetitions) {
		this.activeCompetitions = activeCompetitions;
	}

	public List<PlayerModel> getSquad() {
		return squad;
	}

	public void setSquad(List<PlayerModel> squad) {
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