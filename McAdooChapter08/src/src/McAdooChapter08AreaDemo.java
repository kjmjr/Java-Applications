/*
Kevin McAdoo
*Purpose: The Area Demo 
* 3-22-2018
*/

import javax.swing.JOptionPane; //needed for the text box 
public class McAdooChapter08AreaDemo {

	public static void main(String[] args) {
		
		double r;
		double radius = 0.0;
		double length = 0.0;
		double width = 0.0;
		int height= 0;
		String input;
		
		
		
		//introducing the program and asking for user to choose a number 
		input = JOptionPane.showInputDialog("Welcome to the Area Demo Program: " + "\n" +
		"Enter numbers 1-4 to proceed: " + "\n" + " 1. Circle \n" + "2. Rectangle \n" + "3. Cylinder \n" + "4. Quit");
		r = Double.parseDouble(input);
		
		//an if statements for if 4 is choose quit the program
	if (r == 4){
			
		//calling the quit method to quit the program
			quit();
		}
	
	//else run the program
	else {
		//validation purposes
		while (r < 0){
			
			input = JOptionPane.showInputDialog("SORRY POSTIVE NUMBERS ONLY" + "\n" +
					"Enter numbers 1-4 to proceed: " + "\n" + " 1. Circle \n" + "2. Rectangle \n" + "3. Cylinder \n" + "4. Quit");
					r = Double.parseDouble(input);
			
		}
		
		// while loop until user enters 4 or while the number is greater than 0
		while (r > 0 || input != "4"){
			
			input = JOptionPane.showInputDialog("What would you like to find? " + "\n" +
					"Enter numbers 1-4 to proceed: " + "\n" + " 1. Area of a Circle? \n" + "2. Area of a Rectangle? \n" + "3. Area of a Cylinder? \n" + "4. Quit");
					r = Double.parseDouble(input);
					
			//switch statement for input
			switch (input){
			
			case "1":
				
				
				input = JOptionPane.showInputDialog("Please enter a number as your radius ");
				radius = Double.parseDouble(input);
			
				//calling the McAdooChapter08AreaClass
				//Area is the object and r is the argument
				//the object is stored into area
				double area = McAdooChapter08AreaClass.Area(radius);
				
				//formatting the output
				String outputArea = String.format("The area of a circle is " + "%,.2f", area);
				
				//printing it
				JOptionPane.showMessageDialog(null, outputArea);
				
				
				break;
				
			case "2":
				
				input = JOptionPane.showInputDialog("Please enter a number as your length ");
				length = Double.parseDouble(input);
				
				input = JOptionPane.showInputDialog("Please enter a number as your width ");
				width = Double.parseDouble(input);
				
				//using 2 variables in the parentheses to make 2 objects from the McAdooChapter08AreaClass and storing the object in a double
				double areaOfRectangle = McAdooChapter08AreaClass.Area(length, width);
				
                String outputRectangle = String.format("The area of a Rectangle is " + "%,.2f", areaOfRectangle);
				
				JOptionPane.showMessageDialog(null, outputRectangle);
				
				break;
			case "3":
				
				input = JOptionPane.showInputDialog("Please enter a number as your radius ");
				radius = Double.parseDouble(input);
				
				input = JOptionPane.showInputDialog("Please enter a number as your height ");
				height = Integer.parseInt(input);
				
				//using 2 variables in the parentheses to make 2 objects from the McAdooChapter08AreaClass and storing the object in a double
				 double areaOfCylinder = McAdooChapter08AreaClass.Area(radius, height); 
				 
				 String outputCylinder = String.format("The area of a cylinder is " + "%,.2f", areaOfCylinder);
					
					JOptionPane.showMessageDialog(null, outputCylinder);
				 
				break;
				
			case "4":
				
				//quit  method is called
			          quit();
			          
			  System.exit(0);
			    break;
				
			default:
				
				//message method is called for any error
				message();
			}
		}

	}
  }
	
	//message that pops up if there are any bad input in the program
	public static void message() {
		
		JOptionPane.showMessageDialog(null, "ERROR");
		
	}
	
	//message shows at the end of the program
	public static void quit() {
		
		JOptionPane.showMessageDialog(null, "Thanks for participating in the program");
	}

}
