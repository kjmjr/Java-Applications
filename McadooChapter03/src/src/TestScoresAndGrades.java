

//Kevin McAdoo
//2-1-2018
//Purpose: Get the test scores and display the average

//The command to import a text box
import javax.swing.JOptionPane;

public class TestScoresAndGrades {

			public static void main(String[] args) {

				//The many variables used in this program
			String inputStr;
			String output;
			int testOne;
			int testTwo;
			int testThree;
			double total;
			double average;
			
			//The command for user to enter test scores into the text box
			inputStr = JOptionPane.showInputDialog("Enter your first test score");
			testOne = Integer.parseInt(inputStr);
			
			inputStr = JOptionPane.showInputDialog("Enter your second test score");
			testTwo = Integer.parseInt(inputStr);
			
			inputStr = JOptionPane.showInputDialog("Enter your third test score");
			testThree = Integer.parseInt(inputStr);
			
			//The math equation for solving the average
			total = testOne + testTwo + testThree;
			average = total / 3;
			
			//The if and else if command is used in this program to determine what grade they fall in
			//The program will show the end results in a text box using the provided JOptionPane command 
			//The string.format command is used for this program as well to receive a 0.0 output
			if (average >= 90) {
				
				 output = String.format("Congratulations! \n Letter grade: A \n"
				 		+ "Test Average: %,.1f", average);
				 
				 JOptionPane.showMessageDialog(null, output);
			 }
			
			else if (average >= 80) {
				
				output = String.format("Good Job! \n Letter grade: B \n"
				 		+ "Test Average: %,.1f", average);
				 
				 JOptionPane.showMessageDialog(null, output);
			
			}
			
			else if (average >= 70) {
				
				output = String.format("Keep trying kid! \n Letter grade: C \n"
				 		+ "Test Average: %,.1f", average);
				 
				 JOptionPane.showMessageDialog(null, output);
				
			 }
			
			else if (average >= 60) {
				
				output = String.format("Don't give up! \n Letter grade: D \n"
				 		+ "Test Average: %,.1f", average);
				 
				 JOptionPane.showMessageDialog(null, output);
				
			 }
			
			else  {
				
				output = String.format("WOULD YOU LIKE TO TAKE THE TEST OVER? \n Letter grade: F \n"
				 		+ "Test Average: %,.1f", average);
				 
				 JOptionPane.showMessageDialog(null, output);
				 
			 }		
		  
	}

}
