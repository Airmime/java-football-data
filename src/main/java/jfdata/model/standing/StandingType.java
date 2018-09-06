package jfdata.model.standing;

import java.util.List;

/**
 * Class model for StandingTypeModel
 * @author remimarion
 */
public class StandingType {

	//ATTRIBUT
	private String stage;
	private String type;
	private String group;
	private List<StandingTeam> table;
	
	//CONSTRUCTOR
	public StandingType(String stage, String type, String group, List<StandingTeam> table) {
		super();
		this.stage = stage;
		this.type = type;
		this.group = group;
		this.table = table;
	}

	//GET/SET
	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<StandingTeam> getTable() {
		return table;
	}

	public void setTable(List<StandingTeam> table) {
		this.table = table;
	}

	//METHOD
	@Override
	public String toString() {
		return "StandingTypeModel [stage=" + stage + ", type=" + type + ", group=" + group + ", table=" + table + "]";
	}
}
