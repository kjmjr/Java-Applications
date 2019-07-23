/*
 * Name: Kevin McAdoo
 * Date: 4-23-2018
 * Purpose: This class is used to create a bank account drawing needed information from other inherited classes
 */

//imported library for the text box
import javax.swing.JOptionPane;

//imported library for the console display
import java.util.Scanner;

//imported library for exceptions
/*imported library for reading, writing, appending files 
*in the public static void main (string[] args) it the key word throws and the word IOException 
*is needed as well for files
*/
import java.io.*;

//this is needed to import the random class for account numbers
import java.util.Random;

public class McAdooBankAccountCreator {

	public static void main(String[] args) throws IOException{
		
		
		//creating the scanner class
		 Scanner sc = new Scanner(System.in);
		 char again;
		 
		 
		 do {
		
		String input = JOptionPane.showInputDialog("Welcome to the Bank of BB&T " + "\n Where Customers are our main priority" +
				  "\n Which account best fits your needs today? " + "\n Choose the following options (1-4) to proceed"
			   + "\n 1. Checking Account" + "\n 2. Savings Account" + "\n 3. Credit Card Account" + "\n 4. Sorry no account today ");
			
		//the try method trys to parse the input while catching any exceptions in the  program
		try {
			
			
		//here we are making a do while loop
		
			 
		 
		   //the switch statement is great to use for which whatever number as a string is typed by the user then program carries on
		   switch(input) {
		   
		   
		   case "1":
			   
			   	//this method calls a method with the variable input passed into the method and same goes for case 2 and case 3		    
			    CheckingAccount(input);
			   
			   //the break statement stops the program from running through every case
			   break;
			   
		   case "2":
			   
			   SavingsAccount(input);
			   
			   break;
			   
		   case "3":
			   
			   CreditCardAccount(input);
			   
			   break;
			   
		   case "4":
			   
			   quit();
			 //program ends
			 System.exit(0);
				   
			   break;
		
		//this serves as an else statement
		 default:
			   
			   {
				   JOptionPane.showMessageDialog(null, "INVALID INPUT PLEASE TRY AGAIN");
				   
			   }
		   
		   }
		   
		    		 
	}
		 
		
		
		
		//this catch is supposed to catch any input put in as words and not meant to be
		catch(NumberFormatException e){
			
			JOptionPane.showMessageDialog(null, "SORRY BUT WORDS ARE ONLY ACCEPTED");
			
		}
		
        catch (IllegalArgumentException ex) {
			
			
			JOptionPane.showMessageDialog(null, "SORRY BUT WORDS ARE NOT ACCEPTED");
			
			
		}
		
		catch(FileNotFoundException i){
			
			JOptionPane.showMessageDialog(null, "File not found");
			
		}
		
		
		
		//closing the scanner class
		sc.close();
		
	   input = JOptionPane.showInputDialog("Would you like to make another account with us" + "\n Type y or n");
	   again = input.charAt(0);
	   
	   
		 } while (again == 'y' || again == 'Y');

}		
		

	
	public static void quit() {
		
		JOptionPane.showMessageDialog(null, "Always remember BB&T has it all!!" + "\n Thanks for banking with us and bye bye!!");
		
	}
	
	//the throws IOException has to be thrown in this method to proceed on appending files
	//and will be thrown for the remaining methods down below
	public static void CheckingAccount (String i) throws IOException{
		
		
		int age, checkAccountNumber;
		
		age = checkAccountNumber = 0;
		
		double Balance = 0.0;
		
		String name, address, reason, input, phoneNumber;
		
		name = address = i = input = reason = phoneNumber= "";
		boolean goodSoFar = true;
	  
		
		
		//this statement declares that we are about to append to this file
		FileWriter fwriter = new FileWriter("McAdooBankAccountStorage.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		
		try {
			
			
		  JOptionPane.showMessageDialog(null, "To set up a Checking Account" + "\n Please provide your" + "\n Name " + "\n Age" + "\n Phone number" + "\n Address "
		  		+ "\n Reasoning for account " + "\n How much you want to start off as a deposit" + "\n **Aditional Requirments is that if your under 14 you must have a legal gurdian sign for you"
		  		+ "\n Press enter to proceed");
		  
			
		 name = JOptionPane.showInputDialog("Provide a Name");
		 
		
		 input = JOptionPane.showInputDialog("Provide an Age");
		 

		 phoneNumber = JOptionPane.showInputDialog("Provide a 10 digit phone number");
		
		 	 
		 address = JOptionPane.showInputDialog("Provide an Address");
		 
		 
		 reason = JOptionPane.showInputDialog("Provide a reasoning for banking with us today ");
		 
		 
		 i =  JOptionPane.showInputDialog("Thankyou, all of your information has been stored in our system! " + "\nHow much money would you like to put into your new account? ");
		 
		 
		  Balance = Double.parseDouble(i);
		 
          if (age > 14 || age > 0 || age < 100) {
			 
			 goodSoFar = true;
			 
			 age = Integer.parseInt(input);	 
			 
		 }
          
         //testing for if the date is formatted in this else if statement
 		  else if (McAdooBankAccount.isFormattedNumber(phoneNumber)){
 			 
 			 goodSoFar = true;
 			 
 			 
 		 }
        
		 
		 else {
			 
			 goodSoFar = false;
			 
		 }
		 
		 
		 while (age < 0 || age > 100 ||!goodSoFar) {
			 
			 input = JOptionPane.showInputDialog("PLEASE PROVIDE A AGE BETWEEN 0 AND 100 ");
			 
			 age = Integer.parseInt(input);
			 goodSoFar = true;
			 
			 
		 }
		 
		 while (Balance < 0 || !goodSoFar) {
			 
			 
			 i =  JOptionPane.showInputDialog( "NEGATIVE NUMBERS ARE NOT ACCEPTABLE" + "\nTHIS COULD MEAN YOU HAVE NO MONEY TO DEPOSIT"
			 + "\n TRY AGAIN PLEASE ");
			 
			 
			//the variable balance is set as users money and is deposited into the account object
			 Balance = Double.parseDouble(i);
			 goodSoFar = true;
			 
		 }
		 
			
             while (age < 14 || !goodSoFar){
            	 
				 
				 name = JOptionPane.showInputDialog("Please provide the name of your legal guardian");
				 
					//here we are writing the variable input for legal guardian to the file
					 outputFile.println("Legal guardian signature: " + name);
				 
			     goodSoFar = true;
			     age = Integer.parseInt(input);
			     
			     
			
		     }
		  
		 
		 //creating a random generator for account numbers here 
		 Random randomAccountNumber = new Random();
		 
		 //the argument in the parentheses will generate a random number between 1,000,000 and store it as the check account number 
		 checkAccountNumber = randomAccountNumber.nextInt(1000000);
		 
		 
		 i = JOptionPane.showInputDialog("Thanks for your service" + "\n Would you like to view your account information? "+ "\n Type yes to proceed or no to proceed");

		 
		 //an if statement is placed for if user enters no or No
		 //and the message will print and quit the program
		 if (i.equalsIgnoreCase("no")) {
			 
			 goodSoFar = false;
			 JOptionPane.showMessageDialog(null, "Thankyou for making an account with BB&T" + "\n Have a great day!");
			 System.exit(0);
			 
			 
		 }
		 
		 else {
			 
			 goodSoFar = true;
			 
			//making the object account that holds 6 variables as objects
			 McAdooCheckingAccount account = new McAdooCheckingAccount(name, age, address, McAdooBankAccount.NumberFormatter(phoneNumber) , checkAccountNumber, Balance);
			 
			 
			 //in this else statement by the time the code is executed all of the variables for input will be written and 
			 //appended to the McAdooBankAccount file
			 outputFile.println(name);
			 outputFile.println(age);
			 outputFile.println(phoneNumber);
			 outputFile.println(address);
			 outputFile.println(reason);
			 outputFile.println(checkAccountNumber);	 
			 outputFile.println(Balance);
			 
			//here we are closing the file
			outputFile.close();
			 
			 
			//extra printed lines for neatness
			 System.out.print("============================================");
			 //this prints a empty line
			 System.out.println();
		
			//the toString() method draws from the McAdooCheckingAccount class and prints whatever is in that class 
			System.out.println(account.toString() + "\n Reason: " + reason);
			 
			System.out.println();
	
			System.out.print("==============================================");
			
		 }
			i = JOptionPane.showInputDialog("Choose options (1-3) to expand on your new account! " + "\n 1. Make a few deposits" + "\n 2. Make a few withdraws"
			+ "\n 3. quit ");
			
			
			int number = 0;
			
			switch (i) {
				
				
			case "1":
				
				 i = JOptionPane.showInputDialog("\n How many deposits would you like to make ? ");
					
					number = Integer.parseInt(i);
					
				while (number < 0) {
					
					i = JOptionPane.showInputDialog("NEGATIVE NUMBERS NOT ACCEPTABLE" + "\n TRY AGAIN");
					
					number = Integer.parseInt(input);

					
				}
				
				
				//taking the number variable and storing it into an array of doubles
				 double [] array = new double [number];
				
	
				for (int l = 0; l < array.length; l++) {
					
					
					 i = JOptionPane.showInputDialog(" Enter Deposit number " + (l+ 1) + ": ");
					 
					 array[l] = Double.parseDouble(i);
					 
					 //this array is making a add on total to the variable Balance
					 Balance += array[l];
					 
					
					 
					 //this statement gets printed as the user types		 
					 System.out.printf("\n Deposit# " + (l+1) + ": $%,.2f",  array[l]);
					 System.out.println();
					 
				}
				
				
				
				//this statement declares that we are about to append to this file
	   			FileWriter check = new FileWriter("McAdooBankAccountStorage.txt", true);
	   			PrintWriter checkDepositFile = new PrintWriter(check);
	     	    
	     	    //this line is just printed for neatness
	     	    System.out.println("=========================================");
	     	    
	     	    System.out.println("BB&T");
	     	    
	     	    System.out.println("===================Receipt=======================");
	     	    
	     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
	     	    
	     	    System.out.println("Account: Checkings");
	     	    
	     	    System.out.printf("New Balance: $%,.2f", Balance);
	     	    
	     	    System.out.println();
	     	    
	     	    System.out.println("=========================================");
	     	    
	     	    //everything printed on the console will be written to a file
	     	  checkDepositFile.println("==============");
	     	  checkDepositFile.println("BB&T");
	     	  checkDepositFile.println("==============");
	     	  checkDepositFile.println("Checkings Account Receipt");
	     	  checkDepositFile.println("New Balance: " + Balance);
	     	  checkDepositFile.println("==============");
	     	  checkDepositFile.close();
	     	
	     	  break;  
			  
				
			case "2": 
				
				 i = JOptionPane.showInputDialog("How many withdraws would you like to make? ");
					
					number = Integer.parseInt(i);
					
				while (number < 0) {
					
					i = JOptionPane.showInputDialog("NEGATIVE NUMBERS NOT ACCEPTABLE" + "\n TRY AGAIN");
					
					number = Integer.parseInt(input);

					
				}	
				
				
				 double [] newArrays = new double [number];
				 //double answer = 0.0;
				 
				
				for (int l = 0; l < newArrays.length; l++) {
					
					
					 i = JOptionPane.showInputDialog(" Enter Withdraw number " + (l+ 1) + ": ");
					 
					 newArrays[l] = Double.parseDouble(i);
					 
					 Balance -=newArrays[l];
					 
					 
					 //this statement gets printed as the user types
					 System.out.printf("\n Withraw# " + (l+1) + ":  $%,.2f", newArrays[l] );
					 System.out.println();
					 
				}
				
				
				//this statement declares that we are about to append to this file
	   			FileWriter c = new FileWriter("McAdooBankAccountStorage.txt", true);
	   			PrintWriter checkWithdrawFile = new PrintWriter(c);
	     	    
	     	    //this line is just printed for neatness
	     	    System.out.println("=========================================");
	     	    
	     	    System.out.println("BB&T");
	     	    
	     	    System.out.println("===================Receipt=======================");
	     	    
	     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
	     	    
	     	    System.out.println("Account: Checkings");
	     	    
	     	    System.out.printf("New Balance: $%,.2f",  Balance);
	     	    
	     	    System.out.println("=========================================");
	     	    
	     	    //everything printed on the console will be written to a file
	     	checkWithdrawFile.println("==============");
	     	checkWithdrawFile.println("BB&T");
	     	checkWithdrawFile.println("==============");
	     	checkWithdrawFile.println("Checkings Account Receipt");
	     	checkWithdrawFile.println("New Balance: " + Balance);
	     	checkWithdrawFile.println("==============");
	     	checkWithdrawFile.close();
			
	     	  break;  
	     	  			
			case "3":
				
				JOptionPane.showMessageDialog(null, "Thanks for banking with BB&T!");
				
				System.exit(0);
				break;
				
			default:
			{
				
				JOptionPane.showMessageDialog(null, "INVALID INPUT");
			}
		 
			}
		}
	 
			
		 
		
			
		//void methods for the 2 catch statements give a cleaner program
		catch(NumberFormatException e){
			
			
			numberFormatExceptionMessage();
			
		}
		
		catch (IllegalArgumentException ex) {
			
			
			IllagalArgumentException();
			
			
		}
		
		
	}     
	
	       public static void SavingsAccount (String i) throws IOException{
			
			
			int age, SavingsAccountNumber;
			
			age= SavingsAccountNumber = 0;
			
			double Balance = 0.0;
			String name, address, reason, input ,phoneNumber;
			
			name = address = i = input = reason = phoneNumber= "";
			boolean goodSoFar = true;
			

			//this statement declares that we are about to append to this file
			FileWriter fwriter = new FileWriter("McAdooBankAccountStorage.txt", true);
			PrintWriter outputFile = new PrintWriter(fwriter);
			
			
			try {
				
				
			  JOptionPane.showMessageDialog(null, "To set up a Savings Account" + "\n Please provide your Name, Age, Phone number and Address" +
			  "\n And how much money you are going to deposit" + "\n Benefits: Your account will be multiplyed by a 0.01% interest rate if you make 3 or more deposits to this account" +
					 "\n Example: If your balance is $500 and you make 3 deposits of $100 your new balance will be $808 " +
					  "\n **Aditional Requirments is that if your under 14 you must have a legal gurdian sign for you" + "\n Press enter to proceed");
				
			 name = JOptionPane.showInputDialog("Provide a Name");
			 
			 
			 input = JOptionPane.showInputDialog("Provide an Age");
			 
			 
			 
			 phoneNumber = JOptionPane.showInputDialog("Provide a 10 digit phone number");
			 
			
			 
			 address = JOptionPane.showInputDialog("Provide an Address");
			 
			 
			 reason = JOptionPane.showInputDialog("Provide a reasoning for banking with us today ");
			 
			
			 i =  JOptionPane.showInputDialog("Thankyou, all of your information has been stored in our system! " + "\nHow much money would you like to put into your new account? ");
			 
			 Balance = Double.parseDouble(i);
			 
			 if (age > 14 || age > 0 || age < 100) {
				 
					
					goodSoFar = true;	
					//the method try is trying to parse input by turning sting input into a integer and string i into a double 
					 age = Integer.parseInt(input);
					
				}
			 

			 //this brings the object from the bank account class to test if the format of date of birth is true
			else if (McAdooBankAccount.isFormattedNumber(phoneNumber)) {
				  
				  goodSoFar = true;
				 
			}	
			
				 
		   else {
					 
					 goodSoFar = false;
					 	 
					 
				 }
			 
			 //runs a while loop to pass until user puts in the proper age
			 while (age < 0 || age > 100 || !goodSoFar) {
				 
				 input = JOptionPane.showInputDialog("PROVIDE A AGE THAT IS BETWEEN 0 AND 100");
				 
				 age = Integer.parseInt(input);
				 
				 goodSoFar = true;
			 }
			 
			 //runs the while loop until user types a balance greater than 0
			 while (Balance < 0 || !goodSoFar) {
				 
				 
				 i =  JOptionPane.showInputDialog( "NEGATIVE NUMBERS ARE NOT ACCEPTABLE FOR MONEY DEPOSITS" + "\nTHIS COULD MEAN YOU HAVE NO MONEY TO DEPOSIT"
				 + "\nTRY AGAIN PLEASE ");
				 
				 
				//the variable balance is set as users money and is deposited into the account object
				 Balance = Double.parseDouble(i);
				 
				 goodSoFar = true;
				 
			 }
			 
			 //runs the while loop until user puts in a age older than 14
			 while (age < 14 || !goodSoFar) {
				 
				 input = JOptionPane.showInputDialog("Please provide the name of your legal guardian");
				 
					//here we are writing the variable input for legal guardian to the file
					 outputFile.println(input);
					 
					 goodSoFar = true;
					 age = Integer.parseInt(input);
				 
			 }
			  
			 
			 //creating a random generator for account numbers here 
			 Random randomAccountNumber = new Random();
			 
			 //the argument in the parentheses will generate a random number between 1,000,000 and store it as the check account number 
			 SavingsAccountNumber = randomAccountNumber.nextInt(1000000);
			 
			 
			 
			 i = JOptionPane.showInputDialog(" Thanks for your service" + "\n Would you like to view your account information? "+ "\n Type yes to proceed or no to quit");
	
			 
			 //an if statement is placed for if user enters no or No
			 //and the message will print and quit the program
			 if (i.equalsIgnoreCase("no")) {
				 
				 goodSoFar = false;
				 JOptionPane.showMessageDialog(null, " Thankyou for making an account with BB&T" + "\n Have a great day!");
				 System.exit(0);
				 
				 
			 }
			 
			 
			 else {
				 
				 goodSoFar = true;
				 
				//making the object account that holds 6 variables as objects
				 McAdooSavingsAccount account = new McAdooSavingsAccount(name, age, address, McAdooBankAccount.NumberFormatter(phoneNumber) , SavingsAccountNumber, Balance);
				 
				 //in this else statement by the time the code is executed all of the variables for input will be written and 
				 //appended to the McAdooBankAccount file
				 outputFile.println(name);
				 outputFile.println(age);
				 outputFile.println(phoneNumber);
				 outputFile.println(address);
				 outputFile.println(reason);
				 outputFile.println(SavingsAccountNumber);	 
				 outputFile.println(Balance);
				 
				//here we are closing the file
				 outputFile.close();
				 
				 
				 
				//extra printed lines for neatness
				 System.out.print("==============================================");
				 
				//this prints a empty line
				 System.out.println();
			

				//the toString() method draws from the McAdooSavingsAccount class and prints whatever is in that class 
				System.out.println(account.toString() + "\n Reason: " + reason);
				
				System.out.println();
					
				System.out.print("==============================================");
				
				

				i = JOptionPane.showInputDialog("Choose options (1-3) to expand on your new account! " + "\n 1. Make a few deposits" + "\n 2. Make a few withdraws"
				+ "\n 3. quit ");
				
				
				int number = 0;
				
				
				switch (i) {
				
				
				
				case "1":
					
					
					 i = JOptionPane.showInputDialog("\n How many deposits would you like to make ? ");
						
						number = Integer.parseInt(i);
						
					while (number < 0) {
						
						i = JOptionPane.showInputDialog("NEGATIVE NUMBERS NOT ACCEPTABLE" + "\n TRY AGAIN");
						
						number = Integer.parseInt(input);

						
					}
					
					//the number variable will be used inside of the array to hold doubles and used in the for loop 
					 double [] array = new double [number];
		     	     McAdooSavingsAccount Deposit = new McAdooSavingsAccount();
					
					for (int l = 0; l < array.length; l++) {
						
						
						 i = JOptionPane.showInputDialog(" Enter Deposit number " + (l+ 1) + ": ");
						 
						 array[l] = Double.parseDouble(i);
						 
						 Balance += array[l];
						 
						 //this statement gets printed as the user types		 
						 System.out.printf("\n Deposit# " + (l+1) + ":  $%,.2f", array[l] );
						 System.out.println();
					}
					
					
					//this statement declares that we are about to append to this file
		   			FileWriter save = new FileWriter("McAdooBankAccountStorage.txt", true);
		   			PrintWriter saveDepositFile = new PrintWriter(save);
		   			
						
		   			
		   			//if the length of the array is 3 or more then the program will take the number of deposits add that
		   			//along with the interest rate of 0.01%
		   		   if (array.length >= 3) {
		   					
		   			  double interestMultiple, interestBalance = 0.0;
		   			  
		   			  interestMultiple = Balance * 0.01;
		   			   
		   			  interestBalance = Balance + interestMultiple;
		   			  
		   			  
		   			//this line is just printed for neatness
			     	    System.out.println("=========================================");
			     	    
			     	    System.out.println("BB&T");
			     	    
			     	    System.out.println("===================Receipt=======================");
			     	    
			     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
			     	    
			     	    System.out.println("Account: Savings");
			     	    
			     	    System.out.printf("New Balance: $%,.2f", interestBalance);
			     	    
			     	    System.out.println();
			     	    
			     	    System.out.println("Interest Rates: " + Deposit.getInterestRates() + "%"); //this getInterestRates statement draws the return variable from the savings account class
			     	    
			     	    System.out.println("=========================================");
			     	    
			     	    //everything printed on the console will be written to a file
			     	saveDepositFile.println("==============");
			     	saveDepositFile.println("BB&T");
			     	saveDepositFile.println("==============");
			     	saveDepositFile.println("Savings Account Receipt");
			     	saveDepositFile.println("New Balance: " + interestBalance);
			     	saveDepositFile.println("==============");
			     	saveDepositFile.close();
	   				  
		   				
		   				
		   		   }
		   			
		   			  else {
		   				  
		   				//this line is just printed for neatness
				     	    System.out.println("=========================================");
				     	    
				     	    System.out.println("BB&T");
				     	    
				     	    System.out.println("===================Receipt=======================");
				     	    
				     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
				     	    
				     	    System.out.println("Account: Savings");
				     	    
				     	    System.out.printf("New Balance: $%,.2f",  Balance);
				     	    
				     	    System.out.println("=========================================");
				     	    
				     	    //everything printed on the console will be written to a file
				     	saveDepositFile.println("==============");
				     	saveDepositFile.println("BB&T");
				     	saveDepositFile.println("==============");
				     	saveDepositFile.println("Savings Account Receipt");
				     	saveDepositFile.println("New Balance: " + Balance);
				     	saveDepositFile.println("==============");
				     	saveDepositFile.close();
		   				  
		   				
		   			  }
		     	    
		     	    
		   		break;	
				 
				 
					
				case "2": 	
					
					 i = JOptionPane.showInputDialog("How many withdraws would you like to make? ");
						
						number = Integer.parseInt(i);
						
					while (number < 0) {
						
						i = JOptionPane.showInputDialog("NEGATIVE NUMBERS NOT ACCEPTABLE" + "\n TRY AGAIN");
						
						number = Integer.parseInt(input);

						
					}	
					
					//sticking the number of times to withdraw into the array called newArray which will hold doubles
					 double [] newArray = new double [number];
					
					 
					
					for (int l = 0; l < newArray.length; l++) {
						
						
						 i = JOptionPane.showInputDialog(" Enter Withdraw number " + (l+ 1) + ": ");
						 
						 newArray[l] = Double.parseDouble(i);
						 
						 Balance -= newArray[l];
						 //this statement gets printed as the user types		 
						 System.out.printf("\n Withdraw# " + (l+1) + ":  $%,.2f", newArray[l] );
						 System.out.println();
						 
					}
					
				
					
					//this statement declares that we are about to append to this file
		   			FileWriter s = new FileWriter("McAdooBankAccountStorage.txt", true);
		   			PrintWriter saveWithdrawFile = new PrintWriter(s);
		     	    
		     	    //this line is just printed for neatness
		     	    System.out.println("=========================================");
		     	    
		     	    System.out.println("BB&T");
		     	    
		     	    System.out.println("===================Receipt=======================");
		     	    
		     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
		     	    
		     	    System.out.println("Account: Savings");
		     	    
		     	    System.out.printf("New Balance: $%,.2f",  Balance);

		     	    
		     	    System.out.println("=========================================");
		     	    
		     	    //everything printed on the console will be written to a file
		     	saveWithdrawFile.println("==============");
		     	saveWithdrawFile.println("BB&T");
		     	saveWithdrawFile.println("==============");
		     	saveWithdrawFile.println("Savings Account Receipt");
		     	saveWithdrawFile.println("New Balance: " + Balance);
		     	saveWithdrawFile.println("==============");
		     	saveWithdrawFile.close();
		     	   	  
		     	break;	
				
				
				case "3":
	            	
	            	
	            	JOptionPane.showMessageDialog(null, "Thanks for banking with BB&T" + "\n Bye Bye!!");
	            	
	            	System.exit(0);
					
				break;	
				
			 
			 default:
			 
			 {
				 
				 JOptionPane.showMessageDialog(null, "INVALID INPUT");
	            	
			 }
		}	 
	}		 
}		
			
		
			//void methods for the 2 catch statements give a cleaner program
			catch(NumberFormatException e){
				
				
				numberFormatExceptionMessage();
				
			}
			
			catch (IllegalArgumentException ex) {
				
				
				IllagalArgumentException();
				
				
			}
			
			
		}
	      
	    public static void CreditCardAccount (String i) throws IOException{
		
		
		int age, creditCardAccountNumber;
		
		age= creditCardAccountNumber = 0;
		
		double Balance = 0.0;
		String name, address, reason, input ,phoneNumber;
		
		name = address = i = input = reason = phoneNumber= "";
		boolean goodSoFar = true;
		
		//this statement declares that we are about to append to this file
		FileWriter fwriter = new FileWriter("McAdooBankAccountStorage.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		
		
		try {
			
			
		  JOptionPane.showMessageDialog(null, "To set up a Credit Card Account" + "\n Please provide your Name, Age, Phone number and Address " + 
		  "\n And how much money you would like to start off with" + "\n Benefits: If your balance is betwen $500 and $3000 " + 
				  " and you make 3 or more deposits your balance multiplys by an interest rate of 0.015%" +  
		  "\n **Additional Requirments: Please note that you must be 18 to have a credit card account**" + "\n Press enter to proceed");
			
		 name = JOptionPane.showInputDialog("Provide a Name");
		 
		 
		 input = JOptionPane.showInputDialog("Provide an Age");
		 
		//the method try is trying to parse input by turning sting input into a integer and string i into a double 
		 age = Integer.parseInt(input);
		 
		 
		 //this if statement checks for age validation with a credit card account
         if (age > 18) {
			 
			 
        	 goodSoFar = true;
			
			 
		 }
         
       //testing for if the date is formatted in this else if statement
		 else if (McAdooBankAccount.isFormattedNumber(phoneNumber)){
			 
			 goodSoFar = true;
			 
			 
		 }
		 
		 else {
			 
			 goodSoFar = false;
			 
				 
			 }
         
         while(age < 18 || !goodSoFar) {
			 
				input = JOptionPane.showInputDialog("The age to own a credit card account is 18 " + "\n Sorry but you do not qualify"
							+ " for this account" + "\nPlease enter a age that is valid");
				 
				 
				goodSoFar = true;
				 age = Integer.parseInt(input);
				 
			 
		 }
         
        while (age < 0 || age > 100 || !goodSoFar) {
			 
			 input = JOptionPane.showInputDialog("PLEASE PROVIDE A AGE THAT IS BETWEEN 0 AND 100");
			 
			 age = Integer.parseInt(input);
			 
			 goodSoFar = true;
			 
		 }
		 
		 
		 phoneNumber = JOptionPane.showInputDialog("Provide a 10 digit phone number "); 
		 
		 address = JOptionPane.showInputDialog("Provide an Address");
		 
		 
		 reason = JOptionPane.showInputDialog("Provide a reasoning for banking with us today");
		 
		
		 i =  JOptionPane.showInputDialog("Thankyou, all of your information has been stored in our system!" + "\nHow much money would you like to put into your new account? ");
		 
		 Balance = Double.parseDouble(i);
		 
		 
		 while (Balance < 0 || !goodSoFar) {
			 
			 
			 i =  JOptionPane.showInputDialog( "NEGATIVE NUMBERS ARE NOT ACCEPTABLE FOR MONEY DEPOSITS" + "\nTHIS COULD MEAN YOU HAVE NO MONEY TO DEPOSIT"
			 + "\n TRY AGAGIN PLEASE");
			 
			 
			//the variable balance is set as users money and is deposited into the account object
			 Balance = Double.parseDouble(i);
			 
			 goodSoFar = true;
			 
		 }
		 	 
		 
		 //creating a random generator for account numbers here 
		 Random randomAccountNumber = new Random();
		 
		 //the argument in the parentheses will generate a random number between 1,000,000 and store it as the check account number 
		 creditCardAccountNumber = randomAccountNumber.nextInt(1000000);
		 
		 
		 
		 i = JOptionPane.showInputDialog("Thanks for your service" + "\n Would you like to view your account information? "+ "\n Type yes to proceed or no to proceed");
	
		 
		 //an if statement is placed for if user enters no or No
		 //and the message will print and quit the program
		 if (i.equalsIgnoreCase("no")) {
			 
			 
			 goodSoFar = false;
			 JOptionPane.showMessageDialog(null, "Thankyou for making an account with BB&T" + "\n Have a great day!");
			 System.exit(0);
			 
			 
		 }
		 
		 else {
			 
			 goodSoFar = true;
			 
			//making the object account that holds 6 variables as objects
			 McAdooCreditCardAccount account = new McAdooCreditCardAccount(name, age, address, McAdooBankAccount.NumberFormatter(phoneNumber) , creditCardAccountNumber, Balance);
			 
			//in this else statement by the time the code is executed all of the variables for input will be written and 
			 //appended to the McAdooBankAccount file
			 outputFile.println(name);
			 outputFile.println(age);
			 outputFile.println(phoneNumber);
			 outputFile.println(address);
			 outputFile.println(reason);
			 outputFile.println(creditCardAccountNumber);	 
			 outputFile.println(Balance);
			 
			//here we are closing the file
			 outputFile.close();
			 
			 
			//extra print line for neatness
			 System.out.print("==============================================");
			 
			//this prints a empty line
			 System.out.println();
		
			
			//the toString() method draws from the McAdooCreditCardAccount class and prints whatever is in that class 
			System.out.println(account.toString() + "\n Reason: " + reason);
			
			System.out.println();
				
			System.out.print("==============================================");
			

			i = JOptionPane.showInputDialog("Choose options (1-3) to expand on your new account! " + "\n 1. Make a few deposits" + "\n 2. Make a few withdraws"
			+ "\n 3. quit ");
			
			
			int number = 0;
			
			
			switch(i) {
			
		
			case "1": 
				
				
				 i = JOptionPane.showInputDialog("\n How many deposits would you like to make ? ");
					
					number = Integer.parseInt(i);
					
				while (number < 0) {
					
					i = JOptionPane.showInputDialog("NEGATIVE NUMBERS NOT ACCEPTABLE" + "\n TRY AGAIN");
					
					number = Integer.parseInt(input);

					
				}
				
				 double [] array = new double [number];
				 
				//a created empty constructor object is made to hold the deposit object  
				 McAdooCreditCardAccount Deposit = new McAdooCreditCardAccount();
	     	       	  
	     	
				for (int l = 0; l < array.length; l++) {
					
					
					 i = JOptionPane.showInputDialog(" Enter Deposit number " + (l+ 1) + ": ");
					 
					 array[l] = Double.parseDouble(i);
					 
					 Balance += array[l];
					 
					//this statement gets printed as the user types		 
					 System.out.printf("\n Deposit# " + (l+1) + ":  $%,.2f", array[l] );
					 System.out.println();
				}
				
				
				//this statement declares that we are about to append to this file
	   			FileWriter credit = new FileWriter("McAdooBankAccountStorage.txt", true);
	   			PrintWriter creditCardDepositFile = new PrintWriter(credit);
	   			
	   			
	   			//for the credit card account if the array length is 3 or more deposits and the deposits total is between 500 and 3000
	   			//then the interest rate will be multiplied to the balance
	   			if (array.length >= 3 && Balance>= 500 || Balance <= 3000) {
	   				
	   				
	   			  double interestMultiple, interestBalance = 0.0;
	   			  
	   			  interestMultiple = Balance * 0.015;
	   			   
	   			  interestBalance = Balance + interestMultiple;
	   				
	   			//this line is just printed for neatness
		     	    System.out.println("=========================================");
		     	    
		     	    System.out.println("BB&T");
		     	    
		     	    System.out.println("===================Receipt=======================");
		     	    
		     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
		     	    
		     	    System.out.println("Account: Credit Card");
		     	    
		     	    System.out.printf("New Balance: $%,.2f", interestBalance);
		     	    
		     	    System.out.println();
		     	    
		     	    System.out.println("Interest Rates: " + Deposit.getInterestRates() + "%");//this getInterestRates statement draws the return variable from the credit card account class
		     	    
		     	    System.out.println("=========================================");
		     	    
		     	    //everything printed on the console will be written to a file
		     	creditCardDepositFile.println("==============");
		     	creditCardDepositFile.println("BB&T");
		     	creditCardDepositFile.println("==============");
		     	creditCardDepositFile.println("Credit Card Account Receipt");
		     	creditCardDepositFile.println("New Balance: " + Deposit.getInterestRates());
		     	creditCardDepositFile.println("==============");
		     	creditCardDepositFile.close();
	   				
	   				
	   			}
	     	    
	   			
	   			else {
	   				
	   				
	   			//this line is just printed for neatness
		     	    System.out.println("=========================================");
		     	    
		     	    System.out.println("BB&T");
		     	    
		     	    System.out.println("===================Receipt=======================");
		     	    
		     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
		     	    
		     	    System.out.println("Account: Credit Card");
		     	    
		     	    System.out.printf("New Balance: $%,.2f",  Balance);
		     	    
		     	    System.out.println("=========================================");
		     	    
		     	    //everything printed on the console will be written to a file
		     	creditCardDepositFile.println("==============");
		     	creditCardDepositFile.println("BB&T");
		     	creditCardDepositFile.println("==============");
		     	creditCardDepositFile.println("Credit Card Account Receipt");
		     	creditCardDepositFile.println("New Balance: " + Balance);
		     	creditCardDepositFile.println("==============");
		     	creditCardDepositFile.close();
	   				
	   				
	   				
	   			}
	     	    
	     	
			 
			 break;
				
			case "2":	
				
				 i = JOptionPane.showInputDialog("How many withdraws would you like to make? ");
					
					number = Integer.parseInt(i);
					
				while (number < 0) {
					
					i = JOptionPane.showInputDialog("NEGATIVE NUMBERS NOT ACCEPTABLE" + "\n TRY AGAIN");
					
					number = Integer.parseInt(input);
					

					
				}	
				
				 double [] newArray = new double [number];
				 
				 
				for (int l = 0; l < newArray.length; l++) {
					
					
					 i = JOptionPane.showInputDialog(" Enter Withdraw number " + (l+ 1) + ": ");
					 
					 newArray[l] = Double.parseDouble(i);
					 
					 Balance -= newArray[l];
					 
					//this statement gets printed as the user types		 
					 System.out.printf("\n Withdraw# " + (l+1) + ":  $%,.2f", newArray[l] );
					 System.out.println();
				}
				
				//this statement declares that we are about to append to this file
	   			FileWriter c = new FileWriter("McAdooBankAccountStorage.txt", true);
	   			PrintWriter creditCardWithdrawFile = new PrintWriter(c);
	     	    
	     	    //this line is just printed for neatness
	     	    System.out.println("=========================================");
	     	    
	     	    System.out.println("BB&T");
	     	    
	     	   System.out.println("===================Receipt=======================");
	     	    
	     	    System.out.println("Address: 351 S Churton st, Hillsbourgh NC 27278");
	     	    
	     	    System.out.println("Account: Credit Card");
	     	    
	     	    System.out.printf("New Balance: $%,.2f",  Balance);
	     	    
	     	    System.out.println("=========================================");
	     	    
	     	    //everything printed on the console will be written to a file
	     	creditCardWithdrawFile.println("==============");
	     	creditCardWithdrawFile.println("BB&T");
	     	creditCardWithdrawFile.println("==============");
	     	creditCardWithdrawFile.println("Credit Card Account Receipt");
	     	creditCardWithdrawFile.println("New Balance: " + Balance);
	     	creditCardWithdrawFile.println("==============");
	     	creditCardWithdrawFile.close();
	     	   	  
	     	  break;
			
			
			case "3": 
            	
            	
            	JOptionPane.showMessageDialog(null, "Thanks for banking with BB&T" + "\n Bye Bye!!");
            	
            	System.exit(0);
				
				
			break;
			
			default:
				
			{
				JOptionPane.showMessageDialog(null, "INPUT INVALID");
            	
				
			}
			
			 
		 }
		 
	 }
}
		
		//these 2 catches handles the program with a message if the input is invalid
		//also has void methods inside of the catch for cleaner outlook
		catch(NumberFormatException e){
			
			
			numberFormatExceptionMessage();
			
		}
		
		catch (IllegalArgumentException ex) {
			
			
			IllagalArgumentException();
			
			
		}
		
	}
	    
	    public static void numberFormatExceptionMessage() {
	    	
	    	
	    	JOptionPane.showMessageDialog(null, "SORRY, BUT NUMBERS ARE NOT ACCEPTED FOR NAME, ADDRESS, PHONE NUMBER OR REASONINGS");
	    	
	    }
	    
	    public static void IllagalArgumentException() {
	    	
	    	JOptionPane.showMessageDialog(null, "SORRY BUT WORDS ARE NOT ACCEPTED FOR AGE, BALANCE, DEPOSITS OR WITHDRAWS");
	    	
	    	
	    }
	    
  }
