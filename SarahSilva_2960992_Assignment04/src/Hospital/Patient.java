/*
*
* Student Name: Sarah Narayamy Tavares Silva
* Student Number: 2960992
*
*
*/
package Hospital;

public class Patient extends Person {
	
	// Attributes
	private String patientId;
	private String bloodType;
	
	// Constructor
	public Patient(String name, String phoneNumber, char gender, String patientId, String bloodType) {
		super(name, phoneNumber, gender);
		this.patientId = patientId;
		this.bloodType = bloodType;
	}

	// Getters
	public String getPatientId() {
		return patientId;
	}

	public String getBloodType() {
		return bloodType;
	}

	@Override
	public String toString() {
		return "Patient ID: " + patientId + "\n" + super.toString() + "\nBlood Type: " + bloodType; 
	}
		
}
