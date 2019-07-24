//Kevin McAdoo
//2-1-2018
//Purpose: Find the speed of sound

//The command to import a text box
import javax.swing.JOptionPane;

public class speedOfSound
{

	public static void main(String[] args) 
	{
		
		double time;
		double distance;
		String inputStr;
		String output;
		String speed;
		
		//The command for user to enter test scores into the text box
		speed = JOptionPane.showInputDialog("Enter air, water, or steel: ");
		
if (speed=="air")) || (speed== "water") || (speed=="steel")))
     {		
	
		//The command for user to input a double as there distance number
		inputStr = JOptionPane.showInputDialog("To find out the speed of sound enter a number: ");
		  distance = Double.parseDouble(inputStr);	
	 
        //The if and else statements for users output
		if (speed == ("air"))  
		{
			time = distance / 1100;
			
			 output = String.format("The speed of sound by Air is: %,.1f", time); 
			       JOptionPane.showMessageDialog(null, output);		
	   }  
		
	   else if (speed == ("water")) 
	   {
			time = distance / 4900;
			 output = String.format("The speed of sound by Air is: %,.1f", time); 
			       JOptionPane.showMessageDialog(null, output);		
	   } 
		
	   else if (speed == ("steel")) 
	   {
			time = distance / 16400;
			 output = String.format("The speed of sound by Air is: %,.1f", time); 
			       JOptionPane.showMessageDialog(null, output);			   
	   }	
		
	   else 	
	   {		 
			 JOptionPane.showMessageDialog(null, distance);	   					 	     
	   }

    }

else
     {
	    JOptionPane.showMessageDialog(null, "SORRY INVALID INPUT");
     }	 
    
   }
}

