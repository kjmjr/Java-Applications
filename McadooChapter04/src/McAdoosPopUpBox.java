
/* Purpose Illustrate the use of dialog boxes to read input
*/


import javax.swing.JOptionPane;
public class McAdoosPopUpBox {

	public static void main(String[] args) {
		//local variables
		String inputStr;
		String name;
		int age;
		double wage;
		
		//input
		name = JOptionPane.showInputDialog("What is your name?");
		inputStr = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(inputStr);
		inputStr = JOptionPane.showInputDialog("How much do you make per hour?");
		wage = Double.parseDouble(inputStr);
		
		//output
		JOptionPane.showMessageDialog(null,
				"Hello " + name + "\n" + 
		        "Your age is " + age + "\n" +
				"You make $ " + wage + " per hour");
		
		
		
	}

}
