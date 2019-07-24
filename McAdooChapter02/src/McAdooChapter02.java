// Author: Kevin McAdoo
// Date: January 16,2018
// Purpose: This class demonstrates Java fundamentals

public class McAdooChapter02 {

	public static void main(String[] args) {
	
	int ageYears = 19;     //my age 
	int days = 365;        //number of days in one year
	int hours = 24;        //number of hours in one day
	int minutes = 60;      //number of minutes in one hour
	
	//calculate age in minutes
	int ageMinutes = 
			ageYears * days * hours * minutes;
	
	//print results to console
	System.out.print("I am ");
	System.out.print(ageYears);
	System.out.println(" years old");
	System.out.print("My age in minutes is:  ");
	System.out.println(ageMinutes);
	
	//This is a true or false statement and print it out
	boolean amIolderThanYou;
	int ageofLeif = 15;
	amIolderThanYou = (ageYears > ageofLeif);
	System.out.println (amIolderThanYou);
	
	// Days divided by minutes and printed out
	int newNumber = days/minutes;
	System.out.println("Days divided by minutes is: ");
	System.out.println(newNumber);
	
	//Days module to minutes and printed out
	int newRemainder = days%minutes;
	System.out.print("The remainder is: ");
	System.out.println(newRemainder);
      
	}

}
