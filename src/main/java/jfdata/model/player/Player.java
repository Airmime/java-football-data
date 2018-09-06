package jfdata.model.player;

/**
 * Class model for Player
 * @author remimarion
 */
public class Player {

	//ATTRIBUT
	private String id;
	private String name;
	private String firstName;
	private String lastName;
	private String position;
	private String dateOfBirth;
	private String countryOfBirth;
	private String nationality;
	private String role;
	private String lastUpdated;
	
	
	//CONSTRUCTOR
	public Player(String id, String name, String firstName, String lastName, String position, String dateOfBirth,
			String countryOfBirth, String nationality, String role, String lastUpdated) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.dateOfBirth = dateOfBirth;
		this.countryOfBirth = countryOfBirth;
		this.nationality = nationality;
		this.role = role;
		this.lastUpdated = lastUpdated;
	}
	

	//GET/SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		return "PlayerModel [id=" + id + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", position=" + position + ", dateOfBirth=" + dateOfBirth + ", countryOfBirth=" + countryOfBirth
				+ ", nationality=" + nationality + ", role=" + role + ", lastUpdated=" + lastUpdated + "]";
	}
}
