/*
Kevin McAdoo
*Purpose: The program is the Area class
* 3-22-2018
*/

public class McAdooChapter08AreaClass {

	//The area class is demonstrated using 3 overloaded static methods
	//This method will return the area of a circle
	 public static double Area(double r) {
			
		 
			return Math.PI * Math.pow(r, 2);  
		}
	 
	//This method will return the area of a rectangle
	 public static double Area(double l, double w) {
			
		    
			return l * w;  
		}
	 
	 //This method will return the area of a cylinder
	 public static double Area(double r, int h) {
			
		 
			return Math.PI * r * r * h;  
		}
		
	

}
