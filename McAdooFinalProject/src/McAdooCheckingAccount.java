/*
 * Name: Kevin McAdoo
 * Date: 4-23-2018
 * Purpose: This class is used as an extended class of the BankAccount class to hold information for a checking account
 */
public class McAdooCheckingAccount extends McAdooBankAccount {
	
	
	
	private int checkingAccountNumber;
	private double checkBalance;
	
	//here we are setting the variables deposits and withdraws to private to hold an array of doubles
	private double [] deposits;
	private double [] withdraws;
	
	
	//a no arg constructor is made for checkBalance to start at 0.0
     public McAdooCheckingAccount() {
		
    	checkBalance = 0.0;
		
	}
    
     //here we are making 2 for loops to go through the array of deposits and withdraws
     public McAdooCheckingAccount(double [] d, double [] w) {
 		
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
     //also demonstrating overloaded methods- same name different signature in the methods
	public McAdooCheckingAccount(String names, int ages, String ad, String pn, int CAN, double cb){
		
		super(names,ages, ad, pn, cb);
		checkingAccountNumber = CAN;
		checkBalance = cb;
		
		
	}
	
	//the getter methods return the variables and can be used later on in the class
	public int getCheckingAccountNumber() {
		
		return checkingAccountNumber;
	}
	
	
	//the setters methods are used for the two
	public void setCheckingAccountNumber(int CAN) {
		
		
		checkingAccountNumber = CAN;
		
	}
	

	//sets the check Balance variable as a double
   public void setCheckBalance(double cb) {
		
		
	checkBalance = cb;
		
	}
	
   public double getCheckBalance(){
	   

		return checkBalance;
	}
	
	
   //the toString method returns the message in which the super.toString method is inherited from the BankAccount class
	public String toString() {
		
		
		String message = super.toString() + "\n Checking Account Number: " + getCheckingAccountNumber();
		
		
		return message;
		
		
	}
	

	//no interest rates are required for checking accounts
	//only returns the private variable 
	public double getInterestRates() {
		
		
		return checkBalance;
		
		
	}

}
