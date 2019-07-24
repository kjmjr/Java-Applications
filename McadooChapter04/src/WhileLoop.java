//Kevin McAdoo
//Purpose: Practice with while loops notes
// 2-6-2018


public class WhileLoop {

	public static void main(String[] args) {
		
		int value = 3;
		while (value!= 0) {
			
			System.out.println("My value is " + value);
			value--;
			//pre-test loop
		}
		
		
		//post loop-does the check after it completes the loop once
		do {
			
			System.out.println("My value is " + value);
			value--;
		} while (value <=5);
		   value++;
	
		   
		// initialization, test, upgrade condition
		//Find the even numbers up to 10
	      for (int num= 0; num <=5; num = +2){
	    	  System.out.println(num *2);
	    	  
	      }
		   
			
	}

}
