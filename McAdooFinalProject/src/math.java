/*
 * Kevin McAdoo
 * Date: 7-20-2018
 * Random Math problem class
 * 
 */

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class math{

	public static void main(String[] args) {
		
		
		String name, input;
		
		int firstNumber, secondNumber, choice, sum, difference, product, quotient;
		
	 double yourAnswer;
		
		//declares two different objects one
		//one scanner class and other random class
		Scanner keyboard = new Scanner(System.in);
		Random randomNumberGenerator = new Random();
		
		
		name = JOptionPane.showInputDialog("Hi there" + "\nI am the Random math problem game" + "\nIn this program"
				+ " you will choose which math operation you would like to do and the program will provide two random numbers and you have to calculate the problem and "
				+ " the program will tell you if you are right or wrong" + "\nServes as a math tutor, Let's begin shall we!" + "\nFirst please provide your name to the program please");
		
		
		
		input = JOptionPane.showInputDialog("Choose a number 1-5" + "\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication" + "\n4. Divison" + "\n5. Quit");
		
		//converting input as a string to a integer (choice)
		choice = Integer.parseInt(input);
		
		if (choice == 1){
			
			
			
			firstNumber = randomNumberGenerator.nextInt(100);
			secondNumber = randomNumberGenerator.nextInt(100);
			
			input = JOptionPane.showInputDialog("Your answer to this equation?" + "\n" + firstNumber + " + " + secondNumber + "= ?");
			
			 yourAnswer = Double.parseDouble(input);
			
			sum = firstNumber + secondNumber;
			
			if (yourAnswer == sum) {
				
				JOptionPane.showMessageDialog(null, name + " your answer is correct");
				
				
			}
			
			else {
				
				JOptionPane.showMessageDialog(null, name + " your answer is wrong");
			}
			
		}
		
		else if (choice == 2) {
			
		
			
			firstNumber = randomNumberGenerator.nextInt(100);
			secondNumber = randomNumberGenerator.nextInt(100);
			
			 input = JOptionPane.showInputDialog("Your answer to this equation?" + "\n" + firstNumber + " - " + secondNumber + "= ?");
				
			 yourAnswer = Double.parseDouble(input);
			 
			 difference = secondNumber - firstNumber;
				
				if (yourAnswer == difference) {
					
					JOptionPane.showMessageDialog(null,name + " your answer is correct");
					
					
				}
				
				else {
					
					JOptionPane.showMessageDialog(null,name + " your answer is wrong");
				}
			 
		}
		
		else if(choice == 3) {
			
			
			firstNumber = randomNumberGenerator.nextInt(100);
			secondNumber = randomNumberGenerator.nextInt(100);
			
			input = JOptionPane.showInputDialog("Your answer to this equation?" + "\n" + firstNumber + " * " + secondNumber + "= ?");
			
			 yourAnswer = Double.parseDouble(input);
			
			product = firstNumber * secondNumber;
			
			if (yourAnswer == product) {
				
				JOptionPane.showMessageDialog(null,name + " your answer is correct");
				
				
			}
			
			else {
				
				JOptionPane.showMessageDialog(null,name + " your answer is wrong");
			}
			
		}
		
		else if(choice == 4) {
			
			
			
			
			firstNumber = randomNumberGenerator.nextInt(100);
			secondNumber = randomNumberGenerator.nextInt(100);
			
			 input = JOptionPane.showInputDialog("Your answer to this equation?" + "\n" + firstNumber + " / " + secondNumber + "= ?");
			 
				
			 yourAnswer = Double.parseDouble(input);
			 
			  quotient = secondNumber / firstNumber;
				
				if (yourAnswer == quotient) {
					
					JOptionPane.showMessageDialog(null,name + " your answer is correct");
					
					
				}
				
				else {
					
					JOptionPane.showMessageDialog(null,name + " your answer is wrong");
				}
			 
		}
		
		else if(choice == 5) {
			
			//calling the message method
			message();
		}
		
		else {
			
			
			JOptionPane.showMessageDialog(null, "Sorry but numbers 1-5 are only excepted in the program");
		}
		
		
		
		
		keyboard.close();
		
		

	}
	
	//quit message put into the method
	public static void message() {
		
		JOptionPane.showMessageDialog(null, "Thanks for your participation" + "\nHave a great day!");
		
		
	}

}
