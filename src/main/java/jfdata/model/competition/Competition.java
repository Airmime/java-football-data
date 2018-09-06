package jfdata.model.competition;

import java.util.List;

import jfdata.model.area.Area;

/**
 * Class model for Competition
 * @author remimarion
 */
public class Competition {
	
	//ATTRIBUT
	private String id;
	private Area area;
	private String name;
	private String code;
	private String plan;
	private CompetitionSeason currentSeason;
	private List<CompetitionSeason> seasons;
	private String lastUpdated;
	
	//CONSTRUCTOR
	
	public Competition() {
		super();
	}
	
	public Competition(String id, Area area, String name, String code, String plan,
			CompetitionSeason currentSeason, List<CompetitionSeason> seasons, String lastUpdated) {
		super();
		this.id = id;
		this.area = area;
		this.name = name;
		this.code = code;
		this.plan = plan;
		this.currentSeason = currentSeason;
		this.seasons = seasons;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public CompetitionSeason getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(CompetitionSeason currentSeason) {
		this.currentSeason = currentSeason;
	}

	public List<CompetitionSeason> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<CompetitionSeason> seasons) {
		this.seasons = seasons;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	//METHOD
	@Override
	public String toString() {
		return "Competition [id=" + id + ", area=" + area + ", name=" + name + ", code=" + code + ", plan=" + plan
				+ ", currentSeason=" + currentSeason + ", seasons=" + seasons + ", lastUpdated=" + lastUpdated + "]";
	}
}
