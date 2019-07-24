/*
Kevin McAdoo
*Purpose: The homeword assignment for Backward String
* 4-02-2018
*/

import javax.swing.JOptionPane;
public class McAdooBackwardString {

	public static void main(String[] args) {
		
		
		String startInput, name;   
		//initializing the string reverse
		String reverse = "";
		
		try {
		name = JOptionPane.showInputDialog("Please enter your name in the text box");
		
		startInput = JOptionPane.showInputDialog("Type a word or a sentence into the box: ");
		 
		//setting the length as an int for the for loop
		int length = startInput.length();
		
		//running a for loop for each character
		for (int index = length-1; index > -1; index--) {
			
			//using the charAt method to set the input to reverse
			reverse = reverse + startInput.charAt(index);
		}
		
		

		//converts the reverse variable to char
		char ch = reverse.charAt(0);
		
	//testing to see if input is a palendrone and using the white space method to test the string as well because spaces effect the output
		//using the .equals method to compare strings
		//and using the Character.isWhitespace method to test for whitespace
			if (startInput.equals(reverse) || Character.isWhitespace(ch)) {
				
				JOptionPane.showMessageDialog(null, name + " your input is a palendrone" + "\nDefinition: A Palendrone is a word or phrase that looks exactly "
						+ "the same both originally and backwards"
				+ "\nOriginal: " + startInput + "\nBackwards: " + reverse);	
				
			}
			
			
			else {
				
				JOptionPane.showMessageDialog(null, name + " your input is not a palendrone" + "\nThe reason why is because"
						+ " your input is not able to be displayed originally and backwards "
						+ "in the same form"
				+ "\nOriginal: " + startInput + "\nBackwards: " + reverse);
				
				
			}
		
		
		
	}
		
		catch(NumberFormatException e){
			
			boolean correct = true;
			
			while (!correct) {
				
				name = JOptionPane.showInputDialog("PROGRAM ONLY EXCEPTS LETTERS" + "\n TYPE YOUR NAME PLEASE");
				
				startInput = JOptionPane.showInputDialog("PROGRAM ONLY EXCEPTS LETTERS" + "\n TYPE A SENTENCE PLEASE");
				
				
			}
			
		}
		
		
	}
}	
	

