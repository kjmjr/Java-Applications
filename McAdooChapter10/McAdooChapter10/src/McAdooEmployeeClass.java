/*
 * Kevin McAdoo
 * Date: 4-5-2018
 * Purpose: This class makes employee abstract objects
 */


public abstract class McAdooEmployeeClass {
	
	//Declaring 3 private variables
	private String name;
	private String employeeID;
	private String hireDate;
	
	
	//creating a no arg constructor
	public McAdooEmployeeClass() {
		
		name = " ";
		employeeID = "XXX-L";
		hireDate = "MM-DD-yyyy";
		
	}
	
	//creating a constructor with 3 arguments
	public McAdooEmployeeClass(String n, String empID, String hd) {
		
		name = n;
		employeeID = empID;
		hireDate = hd;
		
	}
	
	//making 3 get methods to get objects from the user back in main
	public String getName() {
		
		return name;
		
	}
	
	public String getEmployeeID() {
		
		return employeeID;
	}

	
	public String getHireDate() {
		
		return hireDate;
	}
	
	
	//making 3 methods for setting the objects 
	public void setName(String n) {
		
		name = n;
	}
	
	public void setEmployeeID(String empID) {
		
		employeeID = empID;
	}
	
	public void setHireDate(String hd) {
		
		hireDate = hd;
	}
	
	
	//making a toString method to return a message back to main
	public String toString() {
		   
		    String message = "Name: " + name + "\nEmployee ID Number: " + employeeID + "\nDate of Hire:"
		    		+ hireDate + "\n"; 
		
		 return message;
	}
	
	//making an abstract method called getBonus that we will use later on in the program 
	public abstract void calculatedBonus();
		
}
