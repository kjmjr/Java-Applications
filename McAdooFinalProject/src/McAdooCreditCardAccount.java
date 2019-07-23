/*
 * Name: Kevin McAdoo
 * Date: 4-23-2018
 * Purpose: This class is used as an extended class of the BankAccount class to hold information for a Credit Card account
 */
public class McAdooCreditCardAccount extends McAdooBankAccount{
	
	
	//the key word final is used to declare the variable interestRate and can not be changed
	       private final double interestRate = 1.5;
	
			private int creditCardAccountNumber;
			private double creditCardBalance;
			
			//here we are setting the variables deposits and withdraws to private to hold an array of doubles
			private double [] deposits;
			private double [] withdraws;
			
			
			public McAdooCreditCardAccount() {
				
				creditCardBalance = 0.0;
			}
			
			 //here we are making 2 for loops to go through the array of deposits and withdraws
			public McAdooCreditCardAccount(double [] d, double [] w) {
				
		 		
				//declaring the variables to hold length of the array
		    	 deposits = new double[d.length];
		    	 
		    	 withdraws = new double[w.length];
		    	 
		    	 for (int index = 0; index < d.length; index++) {
		    		 
		    		 deposits[index] = d[index];
		    		 
		    	 }
		    	 
		    	 for (int index = 0; index < w.length; index++) {
		    		 
		    		 
		    		 withdraws[index] = w[index];
		    		 
		    		 
		    	 }
		 		
		 	}		
		    
			//this constructor passes 7 variables 
		    //passes 5 of these variables to the super method 
		    //the other 2 are passed variables from the private declaration
			public McAdooCreditCardAccount(String names, int ages, String ad, String pn, int CCAN, double ccb){
				
				super(names,ages, ad, pn, ccb);
				creditCardAccountNumber = CCAN;
				creditCardBalance = ccb;
				
				
			}
			
			//the getter methods return the variables and can be used later on in the class
			public int getCreditCardAccountNumber() {
				
				return creditCardAccountNumber;
			}
		
			
			
			//the setters methods are used for the two
			public void setCreditCardAccountNumber(int CCAN) {
				
				
				creditCardAccountNumber = CCAN;
				
			}
			
			
			
		   public void setCreditCardBalance(double ccb) {
				
				
			   creditCardBalance = ccb;
				
			}
		   
		   public double getCreditCardBalance() {
				
				return creditCardBalance;
			}
			
			
		 //the toString method returns the message in which the super.toString method is inherited from the BankAccount class
			public String toString() {
				
				
				String message = super.toString() + "\n Credit Card Account Number: " + getCreditCardAccountNumber();
				
				
				return message;
				
				
			}
			
			
			//the credit card account has an interest rate
		    //and returns the interest rate of the credit card account
			public double getInterestRates(){
				
				
				return interestRate;

		}

}




