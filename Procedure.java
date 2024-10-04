/*
 * Class: CMSC203 CRN 22355 
 * Instructor: David Kuijt
 * Description: This program gathers user input, displays their information, and
calculates the total charges for the procedures.
 * Due: 10/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yevhenii Dementiev
*/

public class Procedure {
	String procedureName;
	String procedureDate;
	String practitionerName;
	double charges;
	
	public Procedure() {
		
	}
	
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	public Procedure(String procedureName, String procedureDate,
			String practitionerName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	// Getters
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getPractitionerName() {
		return practitionerName;
	}
	public double getCharges() {
		return charges;
	}
	// Setters
	public void setProcedure(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	//Additional getters
	public String toString() {
		return "\n\n\tProcedure: " + procedureName + "\n\tProcedureDate: "
				+ procedureDate + "\n\tPractitioner: " + practitionerName
				+ "\n\tCharge: " + charges;
	}
}
