//Kevin McAdoo
//Date: 7-17-2018
//Purpose: Random project

//imported librarys
import javax.swing.JOptionPane;
import java.util.Scanner;
	
public class RandomProgram {
	
	public static void main(String[] args) {
		
		//initialized variables
		String name, input;
		int age = 0;
		double bankBalance = 0.0;
		boolean goodSoFar = true;
		
		//scanner class object
		Scanner sc = new Scanner(System.in);
		
		while (goodSoFar) {
		
		name = JOptionPane.showInputDialog("Please provide your name");
		
		input = JOptionPane.showInputDialog("How old are you? ");
		
		try {
			
	
		
		//if validation
		if (age < 0) {
			
			JOptionPane.showMessageDialog(null, "There is no such thing as a negative age");
		}
		
		else {
			
			age = Integer.parseInt(input);
			
		}
		
		while (age < 0 || age > 110) {
			
			JOptionPane.showInputDialog("PLEASE ENTER AN AGE VALUE THAT IS GREATER THAN ZERO OR LESS THAN ONE HUNDRED AND TEN");
		}
	
		
		input = JOptionPane.showInputDialog("What is your bank account balance?");
		
		if (bankBalance < 0) {
			
			JOptionPane.showMessageDialog(null, "There is no such thing as negative money");
		}
		
		else {
			
			bankBalance = Double.parseDouble(input);
			
			
		}
		
		while (bankBalance < 0) {
			
			JOptionPane.showInputDialog("PLEASE INPUT MONEY THAT IS NOT LESS THAN ZERO");
			
		}
		
	
		System.out.printf("Name: " + name + "\nAge: " + age + " years old" + "\nBank Account Balance: " + "%,.2f", bankBalance);
		
		
		
		sc.close();
	
		}
	  
		
		catch(NumberFormatException e){
			
			JOptionPane.showMessageDialog(null, "SORRY BUT WORDS ARE NOT ACCEPTED");
			
			
		}
		
        catch(IllegalArgumentException i){
        	
        	JOptionPane.showMessageDialog(null, "SORRY BUT NUMBERS ARE NOT ACCEPTED");
			
			
		}
	 }
	}

}
