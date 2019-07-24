/*
 * Kevin McAdoo
 * Date: 8-28-2018
 * Purpose: Recursive Homework
 * 
 */

//needed JOptionPane library
import javax.swing.JOptionPane;
public class recursiveHW {

	public static void main(String[] args) {
		
		
		int base, expo;
		
		
		
		String input;
		
		input = JOptionPane.showInputDialog("Plese input a number");
		
		base = Integer.parseInt(input); 
		
		input = JOptionPane.showInputDialog("Plese input a second number");
		
		expo = Integer.parseInt(input); 
	
		
	
		
		//printed message drawing the recursive method
		JOptionPane.showMessageDialog(null, "The power of " + base + " to " + expo + " is " + 
				exponents(base,expo));
		
		

	}//end main
	
	
	//making a recursion method that passes two numbers
	public static int exponents(int baseNumber, int exponentNumber) {
		
		
		if (exponentNumber == 0) {
			
			return 1;
			
			
		}
		
		else {
			
			//in this else statement we are storing the recursing method and the math.pow method into the variable result
			int result = 0;
			
			result = exponents(baseNumber, exponentNumber -1 );
			
			result = (int) Math.pow(baseNumber, exponentNumber);
			
			return  result;
		}
			
		}
		

}//end class
