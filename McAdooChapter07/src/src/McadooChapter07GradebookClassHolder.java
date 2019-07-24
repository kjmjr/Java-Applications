/*
Kevin McAdoo
*Purpose: The homework assignment for Grade book class 
* 3-15-2018
*/

public class McadooChapter07GradebookClassHolder {
	
	
	//this sets the variables to private
		private String name;
		private int [] scores;
		private double average;
	
	//this creates a constructor with 2 arguments
	public McadooChapter07GradebookClassHolder(String n) {
		
		
		name = n;
		
	}
	
   public McadooChapter07GradebookClassHolder(int [] s) {
		

		scores = new int[s.length];
		
	}
	
	//method that sets the name to variable n 
    public void setName(String n) {
		
    	name = n;
	}
	
    //method that sets the scores to a variable s of an array
	public void setScores(int [] s) {
		
		for (int i = 0; i < s.length; i++) {
			
			scores[i] = s[i];
			
		}
		
	}
	
	//method that returns the name
	public String getName() {
		
		return name;
		
	}
	
	//method that returns the grade in an array 
	public int getScores(int [] s) {
		
		int grade = scores[0] + scores[1]+ scores[2] + scores[3];
		
		return grade;
	}

	public double getAverage(int grade) {
		
	
		average = (grade)/ 4;
		return average;
	}
}



