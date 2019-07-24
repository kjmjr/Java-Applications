/*
 * Kevin McAdoo
 * Date: 4-13-2018
 * Purpose: Test Scores Demo
 * 
 */


//needed for the text box
import javax.swing.JOptionPane;

//needed class for catching exceptions
import java.util.*;
public class McAdooTestScoresDemo {

	public static void main(String[] args) {
		
		//initialized boolean statement
		 boolean valid = true;
		
		 //initialized variable for number of scores set to 0
		int numScores = 0;
		
		String input;
		
		
		  
		  //this while loop has a boolean statement that tells while user types in the wrong input keep going and catching the exception until user puts in the right input
		//and program will continue to loop until user enters quit
		  while (valid) {
			   
		 
	//the new key word try is used to test the program as a validation	  
		  try {
			  
			   input = JOptionPane.showInputDialog("Welcome to the average calculater! " + "\n This program will take however many test scores you provide, only between numbers 2 and 10, " + 
			   "\n Calculate them and give you the average your scores. " + "\n How many test scores do you have today? "
					   + "\n Type how many test scores you have in the box or type quit to exit the calculater ");
			   
			   
			   
			 //.equalsIgnoreCase is a method used for if user types quit or QUIT
			   //this if statement has to be before the input variable is parsed to perform like it needs 
				  if (input.equalsIgnoreCase("quit")) {
					  
					  //calling the quit method
					  quit();
					  
					  System.exit(0);
				  }
					 
			  
			  numScores = Integer.parseInt(input);
			 
			  
			  //continuous loop until user enters the proper number
			  while (numScores < 2 || numScores > 10) {
				  
				  
				  input = JOptionPane.showInputDialog(" PROGRAM ONLY ACCEPTS NUMBERS (2-10) "+ "\n ENTER A NUMBER BETWEN 2 AND 10");
				  
				  numScores = Integer.parseInt(input);
				  
				  
			  }
		  
		   
			  
				 
			  //this initialization is storing the input of numScores into an array of TestScores
			  double [] TestScores = new double [numScores]; 
			  
			 try {
			
			  //the for loop stops at the number of test scores user puts in
			  for (int i = 0; i < numScores; i++) {
				  
				  input = JOptionPane.showInputDialog(" Enter test score number " + (i+ 1) + ": ");
				  
					  
					  //continuous loop for test score to be between 0-100
					  while (TestScores[i] < 0 || TestScores[i] > 100 ) {
						  
						  
						  input = JOptionPane.showInputDialog("PROGRAM ONLY ACCEPTS A TEST SCORE NUMBER BETWEEN (0-100) " + "\n ENTER A TEST SCORE HIGHER THAN 0 AND LESS THAN 100 ");
						  
						  TestScores[i] = Double.parseDouble(input);
						  
						  
					  }
					  
					  TestScores[i] = Double.parseDouble(input);
					  
			  }
			  
			  
			  if (valid) {
				   //an object is made from the McAdooTestScoresClass with the array TestScores as the constructor
					  McAdooTestScoresClass grade = new McAdooTestScoresClass(TestScores);
					  
					  //the object is being formatted with the String.format method drawing the getAverage() from the McAdooTestScoresClass 
					  //setting it to a new variable
					  String output = String.format("%.2f", grade.getAverage());
					  
					 JOptionPane.showMessageDialog(null, " The average of the test scores you entered is: " + output);
					  
					 }
			} 
				
				  //the catch is suppose to catch any invalid input
				  //while loop up top helps this catch block to repeat until user enters correct input
				  //@IllegalFormatException
				  catch(IllegalFormatException e){
					  
					
					  JOptionPane.showMessageDialog(null, "SORRY PROGRAM ONLY ACCEPTS NUMBERS FOR TEST SCORES " + "\n PLEASE TRY AGAGIN ");
					 
					  
					  //statement is true once user enters the right input
					  valid = true;
					  
					  
				  }
				  
				  catch(NumberFormatException e) {
					  
                      JOptionPane.showMessageDialog(null, " SORRY PROGRAM ONLY ACCEPTS NUMBERS FOR TEST SCORES " + "\n PLEASE TRY AGAGIN ");
					  
                      valid = true;
					  
					  
				  }
				  
				 
				  
			  
			  
			
		  }
		  
		/*
		 * the catch is suppose to catch any invalid input
		 * also has two statements in this catch as well to print the same message
		 * @NumberFormatException
		 * @InputMismatchException
		 */
		  catch(NumberFormatException e ){
			  
				  
				JOptionPane.showMessageDialog(null, " SORRY PROGRAM ONLY ACCEPTS NUMBERS FOR NUMBER OF TEST SCORES " + "\n PLEASE TRY AGAGIN ");
				
				
				 //statement is true once user enters the right input
				valid = true;
				 
			  
		  }
		  
		  catch(InputMismatchException e) {
			  
			  JOptionPane.showMessageDialog(null, " SORRY PROGRAM ONLY ACCEPTS NUMBERS FOR NUMBER OF TEST SCORES " + "\n PLEASE TRY AGAGIN ");
				

			  
		  }
		 }
	
		 
  }
	
	//void message will show when user quits the program
	public static void quit() {
		
		
		JOptionPane.showMessageDialog(null, "Thanks for running the program! ");
	}
}
