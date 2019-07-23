/*
 * Name: Kevin McAdoo
 * Purpose: This class is an abstract class in which 3 other class inherit from
 * Date: 5-4-2018
 */
public abstract class McAdooBankAccount {

	
	private String name;
	private int age;
	private String address;
    private double balance;
    private String number;
	
	//new public methods used can not be changed for the program 
    //the static reference helps the variable be called from anywhere	
	public final static int formatted = 13;
	public final static int unformatted = 10;
	
	
	
	public McAdooBankAccount() {
		
		balance = 0.0;
		
	}
	//constructing the variables 
	public McAdooBankAccount(String n, int a, String location, String pn, double startBalance) {
		
		name = n;
		age = a;
		address = location;
		balance = startBalance;
		number = pn;
	
		
		
	}
	
	//all of the getters in this class can be used in the main demo class but is stored here for access
	//this method gets a name and returns it
	public String getName() {
		
		return name;
		
	}
	
	public int getAge() {
		
		
		return age;
	}
	
	//this method gets an address and returns it
	public String getAddress() {
		
		return address;
	}
	
	
	//these two method returns a double of balance added on or withdraw from the account
	public double deposit(double startBalance) {
		
		   
		return balance += startBalance;
		
	}
	
	
	public double withdraw(double startBalance) {
		
		return balance -= startBalance;
		
		
	}
	
	public void setBalance(double startBalance) {
		
		balance = startBalance;
		
	}
	
    public double getBalance() {
		
		
		return balance;
	}
	
	
	
	//this method returns a boolean in which is test for if the string of the date is properly formatted
		public static boolean isFormattedNumber(String pn){
			
			
			// a boolean flag is made for seeing if statement passes true
			boolean correct = true; 
			
			
			//the charAt method tests for a character in that string
			if (pn.length() == formatted && pn.charAt(0) == '(' && pn.charAt(4) == ')' && pn.charAt(8) == '-') {
				
				
				correct = true;
			}
			
			else {
				
				correct = false;
			}
			
			
			
			return correct;
			
			
		}
		
		//this method is going to use the string builder to convert whatever input passes through the method to the correct format
		//and return the string in the proper format
		public static String NumberFormatter(String i){
			
			
			//the String Builder method is initialized here
			StringBuilder strbN = new StringBuilder(i);
			
			//the  that was initialized at the top is used to test in this if statement for length
			//the insert method is used in this if statement to insert what needs to be needed for the format of the date
			if (i.length() == unformatted) {
				
				//at position 0 the character will be inserted into the string
				strbN.insert(0, '(');
				
				//at position 4 the character will be inserted into the string
				strbN.insert(4, ')');
				
				//at position 8 the character will be inserted into the string
				strbN.insert(8, '-');
				
				
			}
			
			
			
			return strbN.toString();
		}
		
	
	
	
	//the next 5 methods represent setters for setting variables in this class
	public void setName(String n){
		
		name = n;
		
	}
	
	public void setAge(int a) {
		
		age = a;
	}
	
	public void setAddress(String location) {
		
		address = location;
	}
	
	public void setNumber(String pn) {
		
		number = pn;
	}
	
   public String getNumber() {
		
		return number;
	}	
	
	public String toString() {
		
		
		//here we are formatting balance and setting it to the variable output	
		String output = String.format("$%,.2f", getBalance());
				
		
		
		 String message = "\n Name: " + name + "\n Age: " + getAge() + "\n Number: " +  getNumber() + "\n Address: " + address + "\n Starting Balance: " + output; 
		
		 return message;
		

	}
	

/*
 * the key word abstract is going to be used in other classes so that this 
 *class is being inherited by other classes that uses the keyword abstract in the method	
*/
	
 public abstract double getInterestRates();
 
 
}
