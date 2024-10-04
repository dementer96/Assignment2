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

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Patient patient = new Patient();
		
		System.out.println("Enter patient details: ");
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		System.out.print("Middle Name: ");
		String middleName = input.nextLine();
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		System.out.print("Street Address: ");
		String streetAddress = input.nextLine();
		System.out.print("City: ");
		String city = input.nextLine();
		System.out.print("State: ");
		String state = input.nextLine();
		System.out.print("ZIP Code: ");
		String zipCode = input.nextLine();
		System.out.print("Phone Number: ");
		String phoneNumber = input.nextLine();
		System.out.print("Emergency Contact Name: ");
		String emergencyContactName = input.nextLine();
		System.out.print("Emergency Contact Phone: ");
		String emergencyContactPhone = input.nextLine();
		
		patient = new Patient(firstName, middleName, lastName,
				streetAddress, city, state, zipCode,
				phoneNumber, emergencyContactName, emergencyContactPhone);
		
		System.out.println("\nPatient info:");
		
		Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0);
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5550.43);
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		
		displayPatient(patient);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.println("\n\nTotal Charges: $" + totalCharges);
		
		
		System.out.println("\nStudent Name: Yevhenii Dementiev");
		System.out.println("MC#: M21177304");
		System.out.println("Due Date: 10/6/2024");
		input.close();
	}
	
	public static void displayPatient(Patient patient){
		System.out.print(patient.toString());
	}
	public static void displayProcedure(Procedure procedure){
		System.out.print(procedure.toString());
	}
	public static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3) {
        return proc1.getCharges() + proc2.getCharges() + proc3.getCharges();
	}
}
