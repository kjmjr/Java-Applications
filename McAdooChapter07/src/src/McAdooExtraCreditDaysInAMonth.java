/*
Kevin McAdoo
Purpose: Extra credit Days in a month homework assignment
3-21-2018
*/

import java.util.Scanner; //needed for creating the scanner class
public class McAdooExtraCreditDaysInAMonth {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in); //needed for creating the scanner keyboard
		int year;
		int month;
		
		
		
		System.out.println("Enter a number (1-12): ");
		month = keyboard.nextInt();
		
		System.out.println("Enter a year: ");
		year = keyboard.nextInt();
		
		McAdooExtraCredit constructor = new McAdooExtraCredit(year, month); 
		
		String [] months = {"January", "February", "March", "April", "May","June","July", "August", "September", "October", "November", "December"};
		
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	if (year / 100 == 0 || year / 400 == 0){
		
		if (month == 1) {
			
			System.out.println(months[0] + constructor.getYear() + " has " + constructor.getNumberOfDays());
			
		}
		
		else if (month == 2) {
			
			System.out.println(months[1] + constructor.getYear() + " has " + constructor.getNumberOfDays());
		}
		
        else if (month == 3) {
        	
        	System.out.println(months[2] + constructor.getYear() + " has" + constructor.getNumberOfDays());
			
		}
		
        else if (month == 4) {
        	
        	System.out.println(months[3] + constructor.getYear() + " has " + constructor.getNumberOfDays());
			
		}
		
        else if (month == 5) {
        	
        	System.out.println(months[4] + constructor.getYear() + " has " + constructor.getNumberOfDays());
		
	   }
		
        else if (month == 6) {
        	
        	System.out.println(months[5] + constructor.getYear() + " has " + constructor.getNumberOfDays());
		
	   }
		
        else if (month == 7) {
        	
        	System.out.println(months[6] + constructor.getYear() + " has " + constructor.getNumberOfDays());
		
	   }
		
       else if (month == 8) {
    	   
    	   System.out.println(months[7] + constructor.getYear() + " has " + constructor.getNumberOfDays());
		
	  }
		
      else if (month == 9) {
    	  
    	  System.out.println(months[8] + constructor.getYear() + " has " + constructor.getNumberOfDays());
		
	  }
		
      else if (month == 10) {
    	  
    	  System.out.println(months[9] + constructor.getYear() + " has "+ constructor.getNumberOfDays());
 		
	  }
		
      else if (month == 11) {
    	  
    	  System.out.println(months[10] + constructor.getYear() + " has " + constructor.getNumberOfDays());
 		
	  }
		
      else if (month == 12) {
    	  
    	  System.out.println(months[11] + constructor.getYear() + " has " + constructor.getNumberOfDays());
 		
	  }
		
      else {
    	  
    	  System.out.println("error");
      }
	}	
	
 else {
		
	  System.out.println("error");
	}
		
		keyboard.close();
		

	}

}
