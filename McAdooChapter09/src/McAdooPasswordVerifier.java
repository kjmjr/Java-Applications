/*
Kevin McAdoo
*Purpose: The homework assignment for password verifier
* 4-02-2018
*/

import javax.swing.JOptionPane;
public class McAdooPasswordVerifier {

	public static void main(String[] args) {
		
		
		String passwordInput;
	
		
		//making a set of word count variables
		int wordlength, uppercasecount, lowercasecount, digitcount, letters;
	
		
		passwordInput = JOptionPane.showInputDialog("Enter a password: ");
		
	   
		
		//initializing variables to 0
		wordlength = uppercasecount = lowercasecount = digitcount = letters = 0;
		
	      for (int i = 0; i <= passwordInput.length(); i++) {
	    	  if (passwordInput.charAt(i) >= 6 || passwordInput.charAt(i) >= 10) {
	    		  
	    		//the program asks the user to input a password longer than 6 characters to proceed
	    		    while (passwordInput.charAt(i) < 6) {
	    					
	    					passwordInput = JOptionPane.showInputDialog("Password Invalid" + " \n " +  "Enter a password that is 6 or more characters long please! ");
	    					
	    					 i = passwordInput.charAt(0);
	    						
	    				}
	    		    
	    		  
	    		  wordlength++;
	    		  
	    	  }
	    	  
	    
	    	  
	    	  if (Character.isUpperCase(passwordInput.charAt(i))) { 
	    		  
	    		  //keeps count of the upper case letters in the password
	    		  uppercasecount++;
	    		  
	    	  }
	    	 
	    	  
	    	  
	    	  else if (Character.isLowerCase(passwordInput.charAt(i))) {
	    		  
	    		  
	    		  //keeps count of the lower case letters in the password
	    		  lowercasecount++;
	    		  
	    	  }
	    	   
	    	  
	    	  
	    	  else if(Character.isDigit(passwordInput.charAt(i))) {
	    		  
	    		  //keeps count of the digits in the password
	    		  digitcount++;
	    		  
	    	  }
	    	  
	    	 
	      
	          else if  (uppercasecount < 1){
    		  

    		  //this while statement makes the loop continuous until user enters a password with a upper case letter
    		  //the ! symbol says if the input does not contain an upper case keep going until it does 
    		    while (uppercasecount < 1){
    			  
    			  passwordInput = JOptionPane.showInputDialog("Password Invalid" + " \n " +  "Enter a password that contains a uppercase letter please! ");
					
    			  i = passwordInput.charAt(0);
    			  
    			 
    		  }
    		  
    	  }
    	  
    	   else if (lowercasecount < 1){
   		   
	    		 //this while statement makes the loop continuous until user enters a password with a lower case letter
		    		  //the ! symbol says if the input does not contain an upper case keep going until it does 
		    		  while (lowercasecount < 1){
		    			  
		    			  passwordInput = JOptionPane.showInputDialog("Password Invalid" + " \n " +  "Enter a password that contains a lowercase letter please! ");
	  					
		    			  i = passwordInput.charAt(0);
		    			  
		    			  
		    		  }
	    		   
	    		   
	    	   }
    	  
    	  else if (digitcount < 1) {
    		  
    		//this while statement makes the loop continuous until user enters a password with a lower case letter
    		  //the ! symbol says if the input does not contain an upper case keep going until it does 
    		  while (digitcount < 1){
    			  
    			  passwordInput = JOptionPane.showInputDialog("Password Invalid" + " \n " +  "Enter a password that contains a lowercase letter please! ");
					
    			  i = passwordInput.charAt(0);
    			  
    			  
    		  }
		   
    		  
    		  
    	  }
	      
	      
	    //array of chars with the variable name array
			char [] array =  { '!', '@', '#', '$', '%','^', '&', '*', '.', '?'};
			
	      //converting the array to a char of arrays
	        array = passwordInput.toCharArray();
	      
	        //making a for loop for the array of characters above
	      for (int start = 0; start <= array.length; start++) {
	    	  
	    	  if (Character.isLetter(array[start])) {
	    		  
	    		  letters++; 
	    		  
	    	  }
	    	  
	    	  else if (letters < 1){
	    		  
	    		  while (letters < 1){
	    			  
	    			  passwordInput = JOptionPane.showInputDialog("Password Invalid" + " \n " +  "Enter a password that contains a special character please! ");
						
	    			  i = passwordInput.charAt(0);
	    		  
	    		  
	    		  
	    	  }
	      }
	    	  
	      //the if statement that test if password is strong
	    	  else if (passwordInput.charAt(i) >= 10 && letters == 2){
	    		  
	    		  
	    		  JOptionPane.showMessageDialog(null, "Password contains: " + wordlength + " characters, " + uppercasecount + " Upper Case letters " + lowercasecount + " lower Case letters"
	    		      		+ " \n " + digitcount + " digits and " + letters + " special characters " + " \n " + " Password Strong! ");
	    	  }
	    	   
	    	 //exiting the for loop	
		    }  
	      
	      //if password is not strong then it will be printed out as accepted
	      JOptionPane.showMessageDialog(null, "Password contains: " + wordlength + " characters, " + uppercasecount + " Upper Case letters " + lowercasecount + " lower Case letters"
	      		+ " \n " + digitcount + " digits and " + letters + " special characters " + " \n " + " Password Accepted! ");
	      
		System.exit(0);

			  
   }
       	
  }
}

