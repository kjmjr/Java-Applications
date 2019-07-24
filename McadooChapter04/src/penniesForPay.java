/* 
 * Kevin McAdoo
* Purpose: pennies for pay homework assignment
* 2-8-2018
*/ 

//The command for importing the text box and the console Scanner
import javax.swing.JOptionPane;
import java.util.Scanner;
public class penniesForPay {

	private static Scanner keyboard;

	public static void main(String[] args) {
		
	//Variables strings, integers, and doubles that are used for the program 
	 keyboard = new Scanner (System.in);
	 int inputDays;
	 String inputStr;
     double total;
	   
 
   //user inputs how many days he/she has worked
	   inputStr = JOptionPane.showInputDialog("How many days have you worked? ");		
	   inputDays = Integer.parseInt(inputStr);	
	   
 
   // The while loop that test for input validation
    while (inputDays <=1 || inputDays >= 30) {
		
          JOptionPane.showInputDialog(null, "Sorry but your input needs to be 1-30");   
	   }  
    
 /*
 * while the input is good validation 
 * the for loop is suppose to make a run on total of income that is made after 
 * the user puts in how many days he/she has worked   	   
  */
    
    while (inputDays >=1 || inputDays <= 30) { 
    	
  /*
   *The for loop is suppose to make a run on for how many days worked	   
   */
    	     for (int count = 1; count <= inputDays; count++)
    	     {   		               	  
    	    	       
    	        System.out.println("You have worked " + inputDays + " days");
    	        inputDays = keyboard.nextInt();
    	    }       
    /*
     *  The for loop is suppose to keep a run on total with pay, doubling 
     *  everyday plus previous
     */
             total = keyboard.nextDouble();
             for (int pay = 0; pay <= total; total++) {

            //The math for total	 
	         total = (total + total) * 2;
	   
	         System.out.printf("Total: $%.2f",total);	 
       } 
		
      }
	}
}
