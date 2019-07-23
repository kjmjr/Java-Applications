/*
 * Kevin McAdoo
 * Date: 7-19-2018
 * Practice program
 *  Formula BMI = Weight * 703 / Height squared
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pounds, inches, BMI = 0.0;
		
		String input, name;
		
		
		
		name = JOptionPane.showInputDialog("Hello, my name is Jarvis and I am the artificail intelligence of Tony Stark" + "\nI will be instructing you through the Body Mass Index program"
		 + "\nPlease follow instructions" + "\nStart by providing your name in the box please");
		
		input = JOptionPane.showInputDialog("How much do you weigh" + "\nPlease enter into the box" + "\nExample: 60.5");
		
		pounds = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("How tall are you" + "The height will be calculated in inches" + "\nPlease enter into the box"+ "\nExample: 65 inches = 5.5 feet");
		
		inches = Double.parseDouble(input);
		
		while (inches < 0 || pounds < 0) {
			
			System.out.println("SORRY NO NEGATIVE INPUT" + "\nTRY AGAIN PLEASE");
			
		}
		
		
        BMI = pounds * 703 / Math.pow(inches, 2.0);
        
        String output = String.format("%,.2f", BMI);
        
        if (BMI > 18.5 && BMI < 25.0) {
        	
        	//optimal
        	
        	JOptionPane.showMessageDialog(null, "Thanks for your input!" + "\n" + name + " your Body Mass Index is " + output
        			+ "\nYou have a optimal weight");
        	
        	
        }
        
        else if (BMI < 18.5) {
        	
        	//underweight
        	
        	
        	
        	JOptionPane.showMessageDialog(null, "Thanks for your input!" + "\n" + name + " your Body Mass Index is " + output
        			+ "\nYou are underweight");
        	
        	
        }
        
        else if (BMI > 25) {
        	
        	//overweight
        	
        	JOptionPane.showMessageDialog(null, "Thanks for your input!" + "\n" + name + " your Body Mass Index is " + output
        			+ "\nYou are overweight");
        }
        
        

		
		
		sc.close();
		
		
	}

}
