// Kevin McAdoo
// Date: 1-26-2018
// Purpose: User is using the console scanner in order to receive the receipt to his restaurant bill 


//command for importing scanner
import java.util.Scanner;
public class restBill {

	private static Scanner keyboard;

	public static void main(String[] args) {
	
		keyboard = new Scanner(System.in);
		
		// here is the variables that will perform the calculations to the equation
		double taxAmount = 0.0675;
		double tipAmount = 0.2;
		double bill;
		double subTotal;
		double total;
		
		//here user will type in his bill
		System.out.println("Type in your bill and the computer will process it" );
		bill = keyboard.nextDouble();
		
		//Math calculations that computer will figure out
		subTotal = (bill * taxAmount) + bill;
		
		total = (subTotal * tipAmount) + subTotal;
		
		// All the things that will be printed on to the receipt
		System.out.println("Mcadoo's Kitchen");
		System.out.println("Receipt information here:");
		System.out.println("Order #67   Table 3:");
		
		//command for rounding to two decimal places shown in line 34 and line 38
		System.out.printf("SubTotal: $" + "%.2f\n", bill);
		System.out.println("Sales tax: " + taxAmount + "%");
		System.out.println("Tip: " + tipAmount + "%");	
		System.out.printf("Total: $" + "%.2f", total);
	
		
	}

}
