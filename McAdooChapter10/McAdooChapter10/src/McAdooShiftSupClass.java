/*
 * Kevin McAdoo
 * Date: 4-5-2018
 * Purpose: This class inherits from the employee class with supervisor of the company choosing
 * the salary of employees
 */


//the keyword extends is used in this class to inherit from the employee class
public class McAdooShiftSupClass extends McAdooEmployeeClass{
	
	//the key word final and double sets a final salary for the supervisor and the same for employees that he manages 
	private final double salary = 90000.50;
	private final int empManaged = 3;
	
	
	private double sal;
	private int emps_managed;
	
	//a no arg constructor is made
	public McAdooShiftSupClass() {
		
		//the key word super is being used in the no arg constructor
		super();
		sal = 0.0;
		emps_managed = 0;
	}
	
	//a public constructor with 4 arguments is being made
	public McAdooShiftSupClass(String n, String empID, String hd, double ss) {
		
		//3 arguments for the super method is passed from the other class
		super(n, empID, hd);
		sal = ss;
		emps_managed = 0;
	}
	
	public double getSal() {
		
		return sal;
	}
	
	public int getEmpsManaged() {
		
		return emps_managed;
	}
	
	public void setSal(double ss) {
		
		sal = ss;
	}
	
	public void setEmpsManaged(int emps_managed) {
		
		emps_managed = 3;
	}
	
	//using the super.toString methods to override the messages from the other classes
	public String toString() {
		
		//formating the salary variable and setting it to a new variable which is output
		String output = String.format("$%,.2f", salary);
		
		//overriding using the key word super from the other classes to print in this new toString method
		String message = super.toString() + "Shift Supervisors salary: " + output + " a year " + "\n" + "Manages " + empManaged + " employees"; 
				
		return message;
	}


	public void calculatedBonus() {
		
		
		double RecievedBonus = 0.0;
		
		//the math equation used to calculate the bonus
		//the private variable used as salary was declared as a double at the top of the class
		RecievedBonus = salary * .10;
		
		//formating the variable RecievedBonus and setting it to a new variable called output
		String output = String.format("$%,.2f", RecievedBonus);
		
		System.out.println("Bonus: " + "\n" + output);
		
		
	}
	
}	


