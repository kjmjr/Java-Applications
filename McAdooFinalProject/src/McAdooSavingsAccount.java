/*
 * Name: Kevin McAdoo
 * Date: 4-23-2018
 * Purpose: This class is used as an extended class of the BankAccount class to hold information for a Savings account
 */
public class McAdooSavingsAccount extends McAdooBankAccount{
	
	    
	//the key word final is used to declare the variable interestRate and can not be changed
	    private final double interestRate = 1.0;
		
		private int savingsAccountNumber;
		private double saveBalance;
		
		//here we are setting the variables deposits and withdraws to private to hold an array of doubles
		private double [] deposits;
		private double [] withdraws;
		
		
		
		public McAdooSavingsAccount() {
			
			saveBalance = 0.0;
		}
		
		 //here we are making 2 for loops to go through the array of deposits and withdraws
		public McAdooSavingsAccount(double [] d, double [] w) {
			
	 		
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
		public McAdooSavingsAccount(String names, int ages, String ad, String pn, int SAN, double sb){
			
			super(names,ages, ad, pn, sb);
			savingsAccountNumber = SAN;
			saveBalance = sb;
			
			
		}
		
		//the getter methods return the variables and can be used later on in the class
		public int getSavingsAccountNumber() {
			
			return savingsAccountNumber;
			
		}
		
					
		
			//the setters methods are used for the two
		public void setSavingsAccountNumberNumber(int SAN) {
				
				
				savingsAccountNumber = SAN;
				
			}
			
		public void setSaveBalance(double sb) {
				
				
			   saveBalance = sb;
				
			}
		   
		public double getSaveBalance() {
				
				return saveBalance;
			}
			
			
		//the toString method returns the message in which the super.toString method is inherited from the BankAccount class	
	    public String toString() {
				
				
				
				String message = super.toString() + "\n Savings Account Number: " + getSavingsAccountNumber();
				
				
				return message;
				
				
			}
			
			
		//the savings account has an interest rate
	    //and returns the interest rate of the savings account
		public double getInterestRates() {
			
		
				
			return interestRate;
	
		}
	
}

