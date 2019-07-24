/*
Kevin McAdoo
*Purpose: Chapter 6 assignment employee 
* 2-26-2018
*/


import java.util.Scanner; //needed for importing the scanner 

import javax.swing.JOptionPane; //needed for the text box

public class McAdooEmployee {

	public static void main(String[] args) { //needed for reading files
		
		
		//creation of the scanner keyboard for input
		Scanner keyboard = new Scanner(System.in);
		McAdooEmployeeRecord object = new McAdooEmployeeRecord("",  0, "",  ""); //creating 3 objects for the McAdooEmployeeRecord class
		McAdooEmployeeRecord object2 = new McAdooEmployeeRecord("", 0);
		McAdooEmployeeRecord object3 = new McAdooEmployeeRecord();
		
		
		//12 different text box's for dialog input
		JOptionPane.showInputDialog(null, "Type employee name");
		//12 different objects are set for each of the 3 objects made above
		object.setName("susan meyers");
		
		JOptionPane.showInputDialog(null, "Type employee name ");
		object2.setName("mark jones");
		 
		JOptionPane.showInputDialog(null, "Type employee name ");
		object3.setName("joy rogers");
		 
		JOptionPane.showInputDialog(null, "Type in id number");
	    object.setIdNumber(47899);
		  
		JOptionPane.showInputDialog(null, "Type in id number ");
		object2.setIdNumber(39119);
		
		JOptionPane.showInputDialog(null, "Type id number");
		object3.setIdNumber(81774);
		
		JOptionPane.showInputDialog(null, "Type in department");
		object.setDepartment("Accounting");
		 
		JOptionPane.showInputDialog(null, "Type in department");
		object2.setDepartment("IT");
		
		JOptionPane.showInputDialog(null, "Type in department ");
		object3.setDepartment("Manufacturing");
		
		JOptionPane.showInputDialog(null, "Type in position");
		object.setPosition("Vice President");
		
		JOptionPane.showInputDialog(null, "Type in position");
		object2.setPosition("Programmer");
		
		JOptionPane.showInputDialog(null, "Type in position");
		object3.setPosition("Engineer");
		
		//printing your output from the McAdooEmployeeRecordClass
		 System.out.println ("Name" + "\t\t" + "ID Number " + "\t" + "Department" + "\t" + "Position" 
		  + "\n" + object.getName() + "\t" + object.getIdNumber() + "\t\t" + object.getDepartment() +  "\t" 
				 + object.getPosition() + "\n" +  object2.getName() + "\t" + object2.getIdNumber() +  "\t\t"
				 + object2.getDepartment() + "\t\t" + object2.getPosition() + "\n" + object3.getName()  + "\t"
				 + object3.getIdNumber() + "\t\t" + object3.getDepartment() + "\t" + object3.getPosition() + "\t");
		//closes the Scanner keyboard
		keyboard.close();
	  } 
	}


