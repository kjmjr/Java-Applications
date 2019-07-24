/*
 * Kevin McAdoo
 * 2-15-2018
 *  Purpose: retail price calculator homework assignment
*/

//importing the javax.swing.JOptionPane for text box to appear
import javax.swing.JOptionPane;
public class RetailPriceCalculator {

	public static void main(String[] args) {
		
		//Our initialized variables for the program
		double wholeSaleCost = 0.0;
		int  markupPercentage = 0;
		String input;
		double retailPrice = 0.0;
		
		
		// part where user enters input into the text box
		 input = JOptionPane.showInputDialog("How much is your item? /n" + "(Type your price in the box)");
		 wholeSaleCost = Double.parseDouble(input);
		  		  
		 input = JOptionPane.showInputDialog("Enter a number as your markup percentage in the box");
		 markupPercentage = Integer.parseInt(input);
		
	
        // an if statement for validation
		 if (wholeSaleCost > 0 || markupPercentage > 0) {
		 
			 //calling the calculatorRetail function if input is successful
			 retailPrice = calculatorRetail (wholeSaleCost, markupPercentage);
			 
			 String output = String.format("The price of your item is $" + wholeSaleCost + " \n The markup percentage you entered is $" + markupPercentage + 
			   "\n The Final Retail Price of your item is " + "$%,.2f", retailPrice); 
			 JOptionPane.showMessageDialog(null,output);
		 }
	}
        // the public static double calculatorRetail name for the function and double value1 and int value2 is what is passed down to the function 
		 public static double calculatorRetail (double value1, int value2) {
			 
			 //The math calculations for the finding the retail price
			 double markupAmount;
			 markupAmount = value1 * value2 / 100;
			 
			 double result;
			 result = value1 + markupAmount;
			 
			 //return function for returning the answer
			 return result;
			 
		 }
     		
}



