/*
Kevin McAdoo
*Purpose: The homework assignment for Grade-book
* 3-15-2018
*/

import java.util.Scanner; //needed for creating the scanner class

import javax.swing.JOptionPane; //needed for creating the text box
public class McAdooChapter07Gradebook {


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); //needed for creating the scanner keyboard
		 int scores = 4;
		//the word final is used for the integer variables that can not be changed
		 int  size = 5;
		
		
		int [] grades = new int [scores]; //created array for grades
		String [] letters = {"A", "B", "C", "D", "F"}; //created an array string for letters
		String input;
		
		//A for loop that asks the user for the names of 5 students
		for (int start = 0; start < size; start++ ) {
			
			input = JOptionPane.showInputDialog("\n" + "Enter student # "  + (start+1) + ": ");
			
			McadooChapter07GradebookClassHolder names = new McadooChapter07GradebookClassHolder(input);
			System.out.println("Student # " + (start+ 1) + ":" + names.getName());
		}
			
		
		//for loop that asks for 4 test scores
			for (int index = 0; index < scores; index++) {
		
			input = JOptionPane.showInputDialog("\n" + "Enter test score # " + (index +1) + ": ");
			scores = Integer.parseInt(input);
			
			//program creates an object at the end
		    McadooChapter07GradebookClassHolder grade = new McadooChapter07GradebookClassHolder(grades);
		    
	       
			
			//the if statement is given in case there is a negative input
			if (scores < 0) {
				
				//calling the validation statement
				validation();
				
			}
			
			
			//an else if statement is made for if the number falls in the category print the array of the letter grade for the entire program 
			if (scores >= 90) {
					
				//letters[0] is the first element to the array and so forth letters[1][2][3][4] in the program
				System.out.println("Letter Grade: " + letters[0]);
				
			}
			
            else if (scores >= 80) {
 					
				
				System.out.println("Letter Grade: " + letters[1]);
			
				
			}
			
            else if (scores >= 70) {
				
				System.out.println("Letter Grade: " + letters[2]);
				
				
			}
			
            else if (scores >= 60) {
				
        		
				System.out.println("Letter Grade: " + letters[3]);		
				
			}
			
            else if (scores < 60) {		
				
				System.out.println("Letter Grade: " + letters[4]);
				
				
			}
			
			//else statement for if the user enters a negative number into the program 
            else {
				//calling the validation function 
            	error();
			}
			
				
			 //displays made object in the console here
	         System.out.println("\n" + "Test Score  " + (index +1) + ":" + grade.getScores(grades));
			
			}		
			
			
			keyboard.close();//needed to close the keyboard	
		}
	
				
	//voided message that is printed in the if statement
	public static void validation() {
		
		JOptionPane.showMessageDialog(null, "There is no such thing as negative grades try again ");
	}
	
	//voided message that is printed in the else statement
	public static void error() {
			
			JOptionPane.showMessageDialog(null, "INVALID INPUT  ");
		}
		

}
