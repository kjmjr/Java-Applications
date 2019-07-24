/*
Kevin McAdoo
*Purpose: The Parking Ticket Simulator Demo
* 3-22-2018
*/

import javax.swing.JOptionPane; //needed for the text box
public class McAdooParkingDemo {
	
	public static void main(String[] args) {
		
		//5 different ticket objects are made for the program 
	
		
		
		//making a ParkedCar object that holds 5 arguments 
		//the 40 symbolizes the length of time that someone has parked
		ParkedCar car1 = new  ParkedCar("Toyota", "2008", "Red", "DIH - 9078", 70);
		
		//making a ParkingMeter object that holds the argument for meter time
		ParkingMeter meter1 = new ParkingMeter(10);
		
		//making a PoliceOfficer object
		PoliceOfficer officer1 = new PoliceOfficer("Officer Justin", "13");

	    //making a ParkingTicket object
		ParkingTicket Ticket1 = new ParkingTicket(car1, officer1, meter1.getMinutesPurchased());
		
		//printing Ticket1
		JOptionPane.showMessageDialog(null, Ticket1);
		
		
		
		
		ParkedCar car2 = new  ParkedCar("Jaguar", "2018", "Gray", "EZK - 9085", 80);
				
		
		ParkingMeter meter2 = new ParkingMeter(20);
				
		
		PoliceOfficer officer2 = new PoliceOfficer("Officer Bob", "20");
		
		
		ParkingTicket Ticket2 = new ParkingTicket(car2, officer2, meter2.getMinutesPurchased());
		
		//printing Ticket2
		JOptionPane.showMessageDialog(null, Ticket2);
		
		
		
		
		ParkedCar car3 = new  ParkedCar("Lexus", "2015", "White", "AKJ - 0543", 90);
				
		
		ParkingMeter meter3 = new ParkingMeter(30);
				
		
		PoliceOfficer officer3 = new PoliceOfficer("Officer James", "30");
				
		
		ParkingTicket Ticket3 = new ParkingTicket(car3, officer3, meter3.getMinutesPurchased());
		
		//printing Ticket3
		JOptionPane.showMessageDialog(null, Ticket3);
		
		
		
		
		ParkedCar car4 = new  ParkedCar("Mercedes - Benz", "2017", "Yellow", "YUI - 4523", 100);
						
		
		ParkingMeter meter4 = new ParkingMeter(40);
						
		
		PoliceOfficer officer4 = new PoliceOfficer("Officer Jeff", "40");
						
		
		ParkingTicket Ticket4 = new ParkingTicket(car4, officer4, meter4.getMinutesPurchased());
		
		//printing Ticket4
		JOptionPane.showMessageDialog(null, Ticket4);
		
		
		
		
		ParkedCar car5 = new  ParkedCar("Porche", "2018", "Green", "COP - 1289", 120);
						
		
		ParkingMeter meter5 = new ParkingMeter(60);
						
		
		PoliceOfficer officer5 = new PoliceOfficer("Officer Ricky", "67");
						
		
		ParkingTicket Ticket5 = new ParkingTicket(car5, officer5, meter5.getMinutesPurchased());
		
		//printing Ticket5
		JOptionPane.showMessageDialog(null, Ticket5);
		
	

		

	}

}
