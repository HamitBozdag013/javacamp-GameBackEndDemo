package Entity;

import java.time.LocalDate;

import Abstract.IEntity;

public class Player implements IEntity {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirthday;
	private String nationality;
	
	public Player(int id, String firstName, String lastName, LocalDate dateOfBirthday, String nationality) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthday = dateOfBirthday;
		this.nationality = nationality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(LocalDate dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
