/*
Kevin McAdoo
Purpose: The homework assignment for the rainfall class
3-15-2018
*/


import java.util.Scanner; //needed for creating the scanner class
public class McAdooChapter07RainFall {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in); //needed for creating the scanner keyboard
		double rainFallAmounts [] = new double [12]; //creating an array that holds doubles and has 12 items in it 		
		double total = 0.0; //created variable for the total
		
		//creating a string of months for the highest and lowest for loops 
		 String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November","December"};
		
		
		//running a for loop to receive 12 numbers
		for (int index = 0; index < rainFallAmounts.length; index++) {
			
			System.out.println("Enter a rainfall amount " + (index + 1) + "\n");
			
			rainFallAmounts [index] = keyboard.nextDouble();
			
			while (index < 0){
				
				if (index < 0){
				
				System.out.println("Enter a positive rainfall amount ");
				
				rainFallAmounts [index] = keyboard.nextDouble();
				}
				
			}
			
			
			//the array is adding on to the variable total 
			total += rainFallAmounts[index];
					
					
		}
		
		//equation to find the average
		double average = total/ 12;
		
		
		//variable that the array rainFallAmounts is stored in for highest amount
		double highNum = rainFallAmounts[0];
		//creating integer variable for highest month
		int highestMonth = 0;
		
		//the ran for loop for finding the highest rainfall amount 
		for (int index = 1; index < rainFallAmounts.length; index++) {
			
			if (rainFallAmounts[index] > highNum) {
				
				highNum = rainFallAmounts[index];
				highestMonth = index;
			}
			
			
		}
		
		//variable that the array rainFallAmounts is stored in for lowest amount
       double lowNum  = rainFallAmounts[0];
       //creating integer variable for lowest month
	   int lowestMonth = 0;
       
       //ran for loop for finding the lowest rainfall amount
		for (int index = 1; index < rainFallAmounts.length; index++) {
			
			if (rainFallAmounts[index] < lowNum) {
				
	
				lowestMonth = index;
				lowNum = rainFallAmounts[index];
		
			}
			
			
		}
		
		System.out.println("Results: ");
		//printing output for total and average 
		System.out.println("The Total rainfall amount is " + total );
		System.out.printf("The average rainfall amount is %.2f", average);
		System.out.println();
		//printing highest rainfall month
	    System.out.println("The highest rainfall month is " + months [highestMonth]);
	    //printing the highest rainfall amount
		System.out.println("The highest rainfall amount is " + highNum );
		//printing lowest rainfall month
		System.out.println("The lowest rainfall month is " + months [lowestMonth]);
		// printing lowest rainfall amount
		System.out.println("The lowest rainfall amount is " + lowNum);
		
		//closing the keyboard for scanner keyboard
		keyboard.close();
		
	}
}