/*
 * Kevin McAdoo
 * Date: 4-5-2018
 * Purpose: This class inherits from the employee class with having a morning and night shift
 */


//the key word extends is used to inherit from the McAdooEmployeeClass
public class McAdooProdWorkerClass extends McAdooEmployeeClass{
	
	//these private final int variables can not be changed
	private final int shift1 = 1;
	private final int shift2 = 2;
	
	private int shift;
	private double emp_payrate;
	
	//In this no arg constructor we are calling a new method called super
  public McAdooProdWorkerClass(){
		
	  //the key word super is used in the no arg constructor as a empty method
		super();
		shift = 0;
		emp_payrate = 0;
	}
	

//In this constructor we have 3 arguments pulled from the employee class and 2 new arguments from this class
  public McAdooProdWorkerClass(String n, String empID, String hd, int s, double e){
		
	  //the key word super is pulling the objects from the employee class made before as this class is extended from the EmployeeClass
		super(n, empID, hd);
		shift = s;
		emp_payrate = e;
	}
  
 
  //for the 2 methods we are getting and returning the variables of shift and pay rate
  public int getShift() {
	  
	  return shift;
  }
  
  public double getEmpPay() {
	  
	  return emp_payrate;
  }
  
  public void setShift(int s) {
	  
	   shift = s; 
  }
  
  public void setPayRate(double e) {
	  
	   emp_payrate = e;
  }
  
  //overriding with using the super method to store that into the new string
  public String toString() {
	  
	  //formating the employees pay and setting it to the variable output
	  String output = String.format("$%,.2f", emp_payrate);
	  
	  //Initializing the string message to empty quotes
	  String message = "";
	  
	  //the words of rst and nd are tested in the if else statement
	  //if getShift() method is 1 then rst will be printed
	  //else getShift() method equal to 2 then nd will be printed
	  if (getShift() == shift1) {
		  
		   message = super.toString() + "Shift: " + getShift() + "rst shift "+ "\nPay rate: "
			  		+ output + " an hour " + "\n";
	  }
	  
	  else {
		  
		   message = super.toString() + "Shift: " + getShift() + "nd shift "+ "\nPay rate: "
			  		+ output + " an hour " + "\n";
		  
	  }
	  
			   return message;
	  
  }
 
//here we are overriding
 //in this method we are using boolean statements in the if statements to see if the input that is created in the demo will pass through
public void calculatedBonus() {
	
	  boolean both = true;
	  if (shift1 == shift && shift2 == shift && both) {
		  
		  both = true;
		 
	  }
	  
	  else {
		  
		  both = false;
	  }
	  
  }
  
}
	
