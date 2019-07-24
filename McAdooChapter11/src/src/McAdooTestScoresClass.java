
/*
 * Kevin McAdoo
 * Date: 4-13-2018
 * Purpose: Test Scores Class
 * 
 */
public class McAdooTestScoresClass {
	
	//making a private object array to hold scores
	private double [] scores;
	

	//here we are constructing the array
	public McAdooTestScoresClass(double [] s) {
		
		scores = s;
     
		
	}
	
	//returns an array of scores
	public double [] getArray(double [] s) {
		
		
	scores = new double [s.length];
	
	return scores;
	
}
	
	//method here runs a for loop to find the average
	//and returns the average
	public double getAverage(){
		
        double total, average;
        
        total = average = 0.0;
       
		
		for (int i = 0; i < scores.length; i++) {
			
			total +=scores[i];
		}
		
		
		average = total / scores.length; 
		
		return average;
		
	}

}
