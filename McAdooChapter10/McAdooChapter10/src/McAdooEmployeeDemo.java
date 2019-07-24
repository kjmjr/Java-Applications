/*
 * Kevin McAdoo
 * Date: 4-5-2018
 * Purpose: This class represents the 3 inherited class working together into this program
 */

//needed for importing the scanner class
import java.util.Scanner;

//needed for importing the text box
import javax.swing.JOptionPane; 


public class McAdooEmployeeDemo {

	public static void main(String[] args) {

//this program provides a variety of methods for a cleaner program		
//In the program calling only two methods		
		 Intro();
		 message();
		 
		
	}
	
	
	//message that appears to tell user what to do
	public static void Intro(){
		
		JOptionPane.showMessageDialog(null, " You have just hired 2 employees"  + "\n Type there names" + "\n there ID" + "\n there hire dates " + "\n there shifts"
		+ "\n and there pay");
		
		
	}

	
	//information displayed to the user
	public static void message() {
		
		//quicker way to make string variables
		String names, employeeID, hireDate;
		
		//initializing variables for the production worker class object
		names = employeeID = hireDate = "";
		
		//initializing variables to 0
		int newEmployeeShift= 0;
		double employeePayRate = 0.0;
		
		
		//new object sc is made
		Scanner sc = new Scanner(System.in);
		
		 
		//the program asks for a set of information for two different employees
		names = JOptionPane.showInputDialog("Provide the employees name ");
		
		employeeID = JOptionPane.showInputDialog("Provide the employees ID in the format of (XXX-L)");
		
		hireDate = JOptionPane.showInputDialog("Provide the employees hire date in the format of (MM-DD-YYYY)");
		
		String input = JOptionPane.showInputDialog(" Provide the employees shift ");
		newEmployeeShift = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Provide the employees pay rate ");
		employeePayRate = Double.parseDouble(input);
		
		//making a production worker object to use the toString method
		McAdooProdWorkerClass pw1 = new McAdooProdWorkerClass(names, employeeID, hireDate, newEmployeeShift, employeePayRate);
		
		 System.out.println(pw1.toString());
		 
		
		//quicker way to make string variables
		String n, id, hds;
		
		//declaring variables as empty strings here
		n = id = hds = "";
		
		//declaring variables to 0 
		int employeeShift = 0;
		double er = 0.0;
		
        n = JOptionPane.showInputDialog("Provide the employees name ");
		
        //input for id must look like the format in the parenthesis
        id = JOptionPane.showInputDialog("Provide the employees ID in the format of (XXX-L)");
		
        //input for hire date must be in the format in the parenthesis
        hds = JOptionPane.showInputDialog("Provide the employees hire date in the format of (MM-DD-YYYY)");
		
		String str = JOptionPane.showInputDialog(" Provide the employees shift ");
		employeeShift = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Provide the employees pay rate ");
		er = Double.parseDouble(str);
		
		
		//making a production worker object to use the toString method
		McAdooProdWorkerClass pw2 = new McAdooProdWorkerClass(n, id, hds, employeeShift, er);
		
		System.out.println(pw2);
		
		
		//making a production worker object to use the toString method
		//this object is already made 
		//no input requested from the user on this object
		McAdooProdWorkerClass pw3 = new McAdooProdWorkerClass("Jayden McAdoo", "456-J", "01-30-2017", 1, 40.00);
		
		 System.out.println(pw3);
		 
		//making a supervisor object in order to use the toString method
		 //this object is already created as well
		 McAdooShiftSupClass ss = new McAdooShiftSupClass("Kevin McAdoo", "199-I", "09-09-1998", 90000.50);
		 
		 System.out.println(ss);
		 
		 //two methods from the prodWorkerClass are being pulled as objects
		 pw1.calculatedBonus();
		 pw2.calculatedBonus();
		 
		 //boolean method that is tested in the if statement
		 boolean goodSoFar = true;
		 
		//the bonus to the employee is provided if the requirements are met
		 if (goodSoFar && newEmployeeShift == 1 && employeeShift == 2 || newEmployeeShift == 2 && employeeShift == 1) {
			 
			 //calling the methods from the ss object in the McAdooShiftSupClass
			 ss.calculatedBonus();	
			 
		 }
		 
		 //else is for the boolean statement to be made false
		 //also shows no dollar amount for bonus
		 else {
			 
			 
              goodSoFar = false;
              System.out.println("Bonus: ");
             
			 
		 }
		
		 //close the sc object
		 sc.close();	 
		 
	}

}
