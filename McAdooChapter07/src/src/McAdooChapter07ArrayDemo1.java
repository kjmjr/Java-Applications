
/*
Kevin McAdoo
*Purpose: This program shows values being stored in an array
* 3-10-2018
*/

import javax.swing.JOptionPane; //needed for importing the text box
public class McAdooChapter07ArrayDemo1 {

	public static void main(String[] args) {
		
		final int EMPLOYEES = 3; //Number of employees
		int[] hours = new int[EMPLOYEES];  //Array of hours
		
		
		JOptionPane.showMessageDialog(null, "Enter the hours worked by "
				+ EMPLOYEES + " employees. ");
		
		
		//Get the hours worked by employee 1.
		String input = JOptionPane.showInputDialog("Employee 1: ");
		hours[0] = Integer.parseInt(input);
		
		//Get the hours worked by employee 2.
		String inputStr = JOptionPane.showInputDialog("Employee 2: ");
		hours[1] = Integer.parseInt(inputStr);
				
		//Get the hours worked by employee 3.
		String inputString = JOptionPane.showInputDialog("Employee 3: ");
	    hours[2] = Integer.parseInt(inputString);
	    
	    //Display the values entered
	    JOptionPane.showMessageDialog(null, "The hours you entered are: " + hours[0] + " hours "
	    		+ hours[1] + " hours " + hours[2] + " hours ");
				
		
		
		
		

	}

}
