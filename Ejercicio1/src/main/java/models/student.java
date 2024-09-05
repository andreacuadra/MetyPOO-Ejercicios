package models;

/**
 * @author Andrea
 * @version 1.0
 * @created 03-sep.-2024 17:52:53
 */
public class student {

	private float average;
	private String carreer;
	private String cif;
	private String firstName;
	private String lastName;
	private boolean Schoolarship;

	public student(){

	}

	public student(float average, boolean schoolarship, String carreer, String cif, String firstName, String lastName) {
		this.average = average;
		Schoolarship = schoolarship;
		this.carreer = carreer;
		this.cif = cif;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public float getAverage() {
		return average;
	}

	public boolean isSchoolarship() {
		return Schoolarship;
	}

	public String getCarreer() {
		return carreer;
	}

	public String getCif() {
		return cif;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public void setSchoolarship(boolean schoolarship) {
		Schoolarship = schoolarship;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public void setCarreer(String carreer) {
		this.carreer = carreer;
	}
}