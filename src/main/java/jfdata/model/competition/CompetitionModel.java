package jfdata.model.competition;

import java.util.List;

import jfdata.model.area.AreaModel;

/**
 * Class model for Competition
 * @author remimarion
 */
public class CompetitionModel {
	
	//ATTRIBUT
	private String id;
	private AreaModel area;
	private String name;
	private String code;
	private String plan;
	private CompetitionSeasonModel currentSeason;
	private List<CompetitionSeasonModel> seasons;
	private String lastUpdated;
	
	//CONSTRUCTOR
	
	public CompetitionModel() {
		super();
	}
	
	public CompetitionModel(String id, AreaModel area, String name, String code, String plan,
			CompetitionSeasonModel currentSeason, List<CompetitionSeasonModel> seasons, String lastUpdated) {
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

	public CompetitionSeasonModel getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(CompetitionSeasonModel currentSeason) {
		this.currentSeason = currentSeason;
	}

	public List<CompetitionSeasonModel> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<CompetitionSeasonModel> seasons) {
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
