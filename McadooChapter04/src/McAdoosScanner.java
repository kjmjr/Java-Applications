import java.util.Scanner;

// Kevn McAd
// Date: 1-23-2018
// Purpose: use the scanner nput to read 
public class McAdoosScanner {

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		int age;
		String name;
		
		double wage;
		
		System.out.println("what is your name?" );
		name = keyboard.nextLine();
		System.out.println("How old are you");
		age = keyboard.nextInt();
		
		System.out.println("How much is your hourly wage?");
		wage = keyboard.nextDouble();
		
		System.out.println("Your name is " + name);
		System.out.println("You are " + age);
		System.out.println("Your wage is " + wage);

	}

}
