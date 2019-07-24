// Kevn McAd
// Date: 1-23-2018
// Purpose: use the scanner input to read the user input 

import java.util.Scanner;
public class McAdoosScanner2 {

	public static void main(String[] args) {
	
		//local variable
		Scanner Keyboard = new Scanner(System.in);
		int age;
		String name;
		//float for a decimal
		double wage;
		
		//ask the user his/her age
		System.out.println ("What is your name?");
		name = Keyboard.nextLine();
		
		System.out.println("How old are you?");
		age = Keyboard.nextInt();
		
		System.out.println("How much is your hourly wage?");
		wage = Keyboard.nextDouble();
		
		//Console Output
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		System.out.println("Your wage is " + wage);
		

	}

}
