/*
Kevin McAdoo
*Purpose: The Parking Ticket Simulator class
* 3-22-2018
*/

public class ParkedCar {
	
	   private String make;          // The car's make
	   private String year;         // The car's model
	   private String color;         // The car's color
	   private String licenseNumber; // The car's license number
	   private int minutesParked;    // Minutes parked

		   /**
		      Constructor
		      @param mk The car's make.
		      @param mod The car's model.
		      @param col The car's color.
		      @param lic The car's license number.
		      @param min The number of minutes parked.
		   */

		   public ParkedCar(String mk, String yr, String col, String lic, int min) {
		      make = mk;
		      year = yr;
		      color = col;
		      licenseNumber = lic;
		      minutesParked = min;
		   }

		   /**
		      Copy constructor
		      @param car2 A reference to a ParkedCar object to copy.
		   */

		   public ParkedCar(ParkedCar car2) {
		      make = car2.make;
		      year = car2.year;
		      color = car2.color;
		      licenseNumber = car2.licenseNumber;
		      minutesParked = car2.minutesParked;
		   }

		   /**
		      setMake method
		      @m The car's make.
		   */

		   public void setMake(String m) {
		      make = m;
		   }

		   /**
		      setModel method
		      @m The car's model.
		   */

		   public void setModel(String yr) {
		      year = yr;
		   }

		   /**
		      setColor method
		      @c The car's color.
		   */

		   public void setColor(String c) {
		      color = c;
		   }

		   /**
		      setLicenseNumber method
		      @lic The car's license number.
		   */

		   public void setLicenseNumber(String lic) {
		      licenseNumber = lic;
		   }

		   /**
		      setMinutesParked method
		      @m The number of minutes parked.
		   */

		   public void setMinutesParked(int m) {
		      minutesParked = m;
		   }

		   /**
		      getMake method
		      @return The car's make.
		   */

		   public String getMake() {
		      return make;
		   }

		   /**
		      getModel method
		      @return The car's model.
		   */

		   public String getYear() {
		      return year;
		   }

		   /**
		      getColor method
		      @return The car's color.
		   */

		   public String getColor() {
		      return color;
		   }

		   /**
		      getLicenseNumber method
		      @return The car's license number.
		   */

		   public String getLicenseNumber() {
		      return licenseNumber;
		   }

		   /**
		      getMinutesParked method
		      @return The number of minutes parked.
		   */

		   public int getMinutesParked() {
		      return minutesParked;
		   }

		   /**
		      toString method
		      @return A string stating the car's make, model,
		              color, license number, and minutes parked.
		   */

		   public String toString() {
		      // Build a state string.
		      String str = String.format("Make: %s\n" +
		                                 "Year: %s\n" +
		                                 "Color: %s\n" +
		                                 "License Number: %s\n" +
		                                 "Minutes Parked: %d\n",
		                                 make, year, color,
		                                 licenseNumber, minutesParked);

		      // Return the string.
		      return str;
		   }
		}
     
