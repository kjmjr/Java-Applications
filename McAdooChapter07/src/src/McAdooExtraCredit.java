/*
Kevin McAdoo
Purpose: Extra credit Days in a month homework assignment
3-21-2018
*/

public class McAdooExtraCredit {
	
	
	private int year;
	private int months; 
	
	

	public McAdooExtraCredit(int daysInAMonth, int inputYear) {
		
		months = daysInAMonth;
		year = inputYear;
		
	}

	
	public int getNumberOfDays() {
		
		return months;
	}
	
	public int getYear() {
		
		return year;
	}
}
