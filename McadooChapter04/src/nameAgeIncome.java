/*
 * Kevin McAdoo
 * 1-26-2018
 *  Purpose: Using dialogs to display users name age and income
*/


import javax.swing.JOptionPane;
public class nameAgeIncome {

	public static void main(String[] args) {
	
		//the variables being used for this program
		String inputStr;
		String name;
		int age;
		double annualIncome;
		
		// user input
		name = JOptionPane.showInputDialog("Type your full name into the box");
		inputStr = JOptionPane.showInputDialog("Type your age into the box");
		age = Integer.parseInt(inputStr);
		inputStr = JOptionPane.showInputDialog("Type your annual income each year into the box");
		annualIncome = Double.parseDouble(inputStr);
			
		//users results
		JOptionPane.showMessageDialog(null,
		"Hey " + name + "\n" + 
		"You are " + age + " years old" + "\n" +
		"Wow! You make $" + annualIncome + " each year");
		
		
		

	}

}
