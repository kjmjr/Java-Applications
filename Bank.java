import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Kevin McAdoo
 * Date: 9-18-2018
 * Purpose: Bank Account Assignment
 * 
 */

//In the main program call the account object from the abstract
//For the savings account make sure withdraws don't allow the balance to go below $10 - is disallowed
//add interest to the account

//For the checking account make sure withdraws are used with checks and only 3 per month are for free then a $2 deduction from the next withdraws balance
//account can not get under -10 (overdraft)
//run a for loop possibly for amount of checks used
//or run an array through number of checks used

public class Bank extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnSavingsAccount;
	private JButton btnCheckingsAccount;
	private JButton exitButton;
	
	private JLabel titleLabel;
	private JLabel label;
	
	private JPanel titlePanel;
	private JPanel labelPanel;
	private JPanel buttonPanel;
	
	//here we are building the JFrame
	public Bank() {
		
		setTitle("WELCOME TO BB&T");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		titleLabel = new JLabel("BB&T");
		label = new JLabel("What type of account would you like to create today?");
		
		btnSavingsAccount = new JButton("Savings Account");
		btnSavingsAccount.setPreferredSize(new Dimension(160,35));
		btnSavingsAccount.addActionListener(new SavingsAccountButton());
		
		
		btnCheckingsAccount = new JButton("Checkings Account");
		btnCheckingsAccount.setPreferredSize(new Dimension(160,35));
		btnCheckingsAccount.addActionListener(new CheckingsAccountButton());
		
		exitButton = new JButton("Exit");
		exitButton.setPreferredSize(new Dimension(160,35));
		exitButton.addActionListener(new ExitListener());
		
		titlePanel = new JPanel();
		labelPanel = new JPanel();
		buttonPanel = new JPanel();
		
		titlePanel.add(titleLabel);
		labelPanel.add(label);
		buttonPanel.add(btnSavingsAccount);
		buttonPanel.add(btnCheckingsAccount);
		buttonPanel.add(exitButton);
		
		
		  //add panels to main panel
		getContentPane().add(titlePanel, BorderLayout.NORTH);
		getContentPane().add(labelPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		
			 	
		
	}
	
	//if the savings account button is pushed method will be called
	private class SavingsAccountButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnSavingsAccount) {
				
				savingsAccountMethod();
			}
		}
		
		
	}
	
	//if the checkings account button is pushed method will be called
	private class CheckingsAccountButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
         if(e.getSource() == btnCheckingsAccount) {
        	 
        	    checkingsAccountMethod();
				
			}
		}
		
		
	}
	
	private class ExitListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {


			System.exit(0);
			
		}
	}
	
	       

	public static void main(String[] args){
		
		//use BAC to reference everything in the class up above
		Bank BAC = new Bank();
		BAC.setSize(800,500);
		BAC.setVisible(true);
	
		
	
	}//end main
	
	public static void savingsAccountMethod(){
		
		 String name = "";
		 String input = "";
		 double deposit = 0.0;
		 String again = "y";
		 double rate = 0.0;
		
		  	 
		 
		try {
			
			
		     
		     
		     name = JOptionPane.showInputDialog("New Savings Account!" + "\n Please give me your name");
			 
			 input = JOptionPane.showInputDialog("Start off by making a deposit" + "\n How much money are we starting off with?");
			 
			 deposit = Double.parseDouble(input);
			
			  //creating an object for the SavingsAccount class one for deposits and one for withdraws
		     Account savingsAccountMaker = new SavingsAccount(name, deposit);	
		  
			 
					while(deposit < 10) {
						
						input = JOptionPane.showInputDialog("FOR A SAVINGS ACCOUNT YOU HAVE TO START OFF WITH A INITIAL DEPOSIT OF $10 AND KEEP $10 AS THE MINIMUM" + "\n TRY AGAIN");
						
						deposit = Double.parseDouble(input);
						
					}
					
					while(deposit < 0) {
						
						input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
						
						deposit = Double.parseDouble(input);
						
					}//end while
					
					//shows the reciept before heading into the loop
					JOptionPane.showMessageDialog(null, savingsAccountMaker.toString(name, deposit));
					
					again = JOptionPane.showInputDialog("Type y to make a deposit " + "\n Type n to cancel");	
					
					while("y".equalsIgnoreCase(again)) {
						
						
								
					  input = JOptionPane.showInputDialog("How much? ");	
							
					  deposit = Double.parseDouble(input);		
					  						
					  savingsAccountMaker.deposit(deposit);
							
					  again = JOptionPane.showInputDialog("Another deposit?" + "\n Type y or n");	
					  
					
					  while(deposit < 0) {
							
							input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
							
							deposit = Double.parseDouble(input);
							
						}//end while
						
					}//end while
					
					//rate calculates balance and returns it
					savingsAccountMaker.addInterest(rate);
					
					JOptionPane.showMessageDialog(null, savingsAccountMaker.toString(name, deposit));
					
					
					
					again = JOptionPane.showInputDialog("Type y to make a withdraw " + "\n Type n to cancel");	
					
					while("y".equalsIgnoreCase(again)) {
						
						
								
					  input = JOptionPane.showInputDialog("How much? ");	
							
					  deposit = Double.parseDouble(input);	
					  			  		      			  		      
				      	   			    	  
				    	  savingsAccountMaker.withdraw(deposit);
				    	  			  
				    	  
				    	  again = JOptionPane.showInputDialog("Another withdraw?" + "\n Type y or n");	
										  	    	  
				    	  while(deposit < 0) {
								
								input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
								
								deposit = Double.parseDouble(input);
								
							}//end while      		            
				    		      		   														              	                  	                 	             																									  					
				
				}//end while
					
					
					
					JOptionPane.showMessageDialog(null, "Thank you for creating a Savings Account with us today!" + "\n" + 
					savingsAccountMaker.toString(name, deposit) + "\nHave a Great Day!");
					
					
					
																 																		
		
	}//end try
		
		
		catch(Exception ex) {
			
			ex.getMessage();
		}//end catch
	     
	   
		
	}//end savingsAccountMethod
	
	
	public static void checkingsAccountMethod() {
		
		
		 String name = "";
		 String input = "";
		 double deposit = 0.0;
		 String YesAgain = "";
		 String CheckAgain = "";
	
		try {
			
			
             name = JOptionPane.showInputDialog("New Checkings Account!" + "\n Please give me your name");
			 
			 input = JOptionPane.showInputDialog("Start off by making a deposit" + "\n How much money are we starting off with?");
			 
			 deposit = Double.parseDouble(input);
			
			
			 //creating an object for the CheckingsAccount class
		    Account checkingsAccountMaker = new CheckingsAccount(name, deposit);
		    
		    JOptionPane.showMessageDialog(null, checkingsAccountMaker.toString(name, deposit));
		    
		    while(deposit < 1) {
				
				input = JOptionPane.showInputDialog("FOR A CHECKING ACCOUNT YOU HAVE TO DEPOSIT MORE THAN $1 INTO THE ACCOUNT");
				
				deposit = Double.parseDouble(input);
				
			}
		    
		    while(deposit < 0) {
				
				input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
				
				deposit = Double.parseDouble(input);
				
			}//end while
		    
		    
		    YesAgain = JOptionPane.showInputDialog("Type y to make a deposit " + "\n Type n to cancel");	
			
			while("y".equalsIgnoreCase(YesAgain)) {
				
				
						
			  input = JOptionPane.showInputDialog("How much? ");	
					
			  deposit = Double.parseDouble(input);		
			  						
			  checkingsAccountMaker.deposit(deposit);
			  
					
			  YesAgain = JOptionPane.showInputDialog("Another deposit?" + "\n Type y or n");	
			  
			  while(deposit < 0) {
					
					input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
					
					deposit = Double.parseDouble(input);
					
				}//end while
				
				
			}//end while			
			
			JOptionPane.showMessageDialog(null, checkingsAccountMaker.toString(name, deposit));
			
			
			
			 JOptionPane.showMessageDialog(null, "A Checking account requires you to withdraw either directly or with a check"
					  + "\n However be aware that you only get 3 free checks and after that they are not free to use " + "\n Your account can not "
					  + " exeed below -10 as this is considered an overdraft" + "\n Follow instructions by the following ");
			 
			YesAgain = JOptionPane.showInputDialog("Type y to withdraw the regualar way or n to not");
			  		  
			if("y".equalsIgnoreCase(YesAgain)) {
				
				while("y".equalsIgnoreCase(YesAgain)) {
					
					
					
					   input = JOptionPane.showInputDialog("How much? ");	
							
					   deposit = Double.parseDouble(input);	
					  													
					   checkingsAccountMaker.withdraw(deposit);
					   
					   YesAgain = JOptionPane.showInputDialog("Type y or n to withdraw directly");
					   
					   while(deposit < 0) {
							
							input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
							
							deposit = Double.parseDouble(input);
							
						}//end while
									
					  			  				
					}//end while
				
				
			}
			
			CheckAgain = JOptionPane.showInputDialog("Type check to withdraw using a check" + "\nExit the program by typing anything");
			
			if(CheckAgain.equalsIgnoreCase("check")) {
				
				  while(CheckAgain.equalsIgnoreCase("check")) {
					  
					  input = JOptionPane.showInputDialog("How much? ");
					  
					  deposit = Double.parseDouble(input);	
					  
					  
					  //method that withdraws using checks
					  checkingsAccountMaker.withdrawUsingCheck(deposit);
					  				
					  CheckAgain = JOptionPane.showInputDialog("Type check to withdraw " + "\nType anything to exit the program");
					  
					  while(deposit < 0) {
							
							input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE AMOUNTS " + "\n PLEASE TRY AGAIN");
							
							deposit = Double.parseDouble(input);
							
						}//end while
					  
						
					boolean resetChecks = true;
					
					//if user breaks out of the loop to keep withdrawing then reset the checks
					if(resetChecks) {
							  
					checkingsAccountMaker.getChecksUsed();
					
					//method that resets the checks
					checkingsAccountMaker.resetChecksUsed();
					
					}//end if  
									
					  
				  }//end while
				
				
			}//end else if statment
			
			
			JOptionPane.showMessageDialog(null, "Thank you for creating a Checkings Account with us today!" + "\n" + 
					checkingsAccountMaker.toString(name, deposit) + "\nHave a Great Day!");
				    	     
			
		}
		catch(Exception ex) {
			
			ex.getMessage();
		}
	}//end of checkingsAccountMethod

}//end of bankAccountCreation class


	//superclass
	abstract class Account{
		
		protected String _id = "";
		protected double _balance = 0.0;
		
		
	
		public Account(String id, double balance){
			
			_id =  id;
			 _balance = balance;
			 //_percent = rate;
			
		}//end constructor 
		
		public String getID(String id) {
			
			return _id;
			
		}//end of getID method
		
		public double getBalance(double balance) {
			
			
			return _balance;
			
		}//end of getBalance method
		
		public String toString(String id, double balance) {
			
			//formating the variable balance and storing it into the string variable output
			String output = String.format("ID: " + _id + "," + " Balance: " + "$%,.2f", _balance);
			
			return output;
		}
		
		public double addInterest(double rate) {
			
			return rate;
		}
		
		public boolean withdrawUsingCheck(double balance) {
			
			boolean ChecksUsed = true;
			
			return ChecksUsed;
		}
		
		public int getChecksUsed(){
			
			int numberOfChecksUsed = 0;
			return numberOfChecksUsed;
		}
		
		//empty constructor for the abstract
		public void resetChecksUsed() {
			
			
		}
		
		//used in subclass
	    public abstract boolean withdraw(double amount);	
			
		public abstract void deposit(double amount);
		
		
		
			
		
	}//end of superclass Account
	
	
	
	
	//subclass
	 class SavingsAccount extends Account{
		
		
		 
		public SavingsAccount(String id, double initialDeposit) {
			
			super(id, initialDeposit);
			
				
			
			//this if statement serves as the special promotion for $200 bonus
			if(initialDeposit > 10000) {
				
				JOptionPane.showMessageDialog(null, "Thanks to your input, your balance was incremented by $200 as part of our ongoing promotion");
				
				_balance = _balance + 200;
			}
			
		}//end constructor
		
		
		public boolean withdraw(double amount) {
			
			boolean transactionFee;
			
			_balance = _balance - amount;
			
			if(_balance > 10) {
				
				
	              _balance = _balance - 2;
				 
				 String output = String.format("ID: " + _id + "," + " Balance: " + "$%,.2f", _balance);
					
				
				JOptionPane.showMessageDialog(null, output);
				
				transactionFee = true;		
				
				
					
			}
			
			else{
				
				JOptionPane.showMessageDialog(null, "BALANCE CAN NOT GET LOWER THAN $10");
				transactionFee = false;
				
			}
			
			
			
			return transactionFee;
			
		}//end of boolean method
		
		public void deposit(double amount) {
			
			
			try {
				
				String input = "";
				
		        while(amount < 0) {
					
					input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE BALANCES " + "\n PLEASE TRY AGAIN");
					
					amount = Double.parseDouble(input);
				}
		       	             	      	   
		        
		        if (amount > 0) {
		        	
		        	
		        	_balance = _balance + amount;
		        }
		        
		      //formating the variable balance and storing it into the string variable output
				String output = String.format("ID: " + _id + "," + " Balance: " + "$%,.2f", _balance);
				    
		        JOptionPane.showMessageDialog(null, output);
		        
				
				
			}
			catch(Exception ex){
				
				ex.getMessage();
			}
			
			
	        
			
		}//end of deposit method
		
		public double addInterest(double rate) {
			
			
			double interest = 0.00;
			rate = 0.25;
			
			interest = _balance * rate / 100;
			
			_balance = _balance + interest;
			
			return _balance;
			
		}//end of addInterest method
		
		public String toString(String id, double balance) {
			
			//formating the variable balance and storing it into the string variable output
			String output = String.format("ID: " + _id + "," + " Balance: " + "$%,.2f", _balance);
			
			return output;
		}
		
		
		
	}//end savingsAccount subclass
	
	 //subclass
	 class CheckingsAccount extends Account{
		
		 //make a for loop as a run on total for checks used
		private int numberOfChecksUsed;
		 
		public CheckingsAccount(String id, double initialDeposit) {
			
			super(id, initialDeposit);
			
		}//end constructor
		
		 
		
		public boolean withdraw(double amount) {
			
			boolean transactionFee;
			
			
			if(amount > 0) {
			
				 _balance = _balance - amount;
				 
				 _balance = _balance - 1;
				 
				//formating the variable balance and storing it into the string variable output
					String output = String.format("ID: " + _id + "," + " Balance: " + "$%,.2f", _balance);
					    
			        JOptionPane.showMessageDialog(null, output);
			        
			    	transactionFee = true;
					
			}
			
			else {
				
				transactionFee = false;
			}
			
			return transactionFee;
			
		}//end of boolean withdraw method
		
		public void deposit(double amount) {
			
			try {
				
				
				String input = "";
				
		        while(amount < 0) {
					
					input = JOptionPane.showInputDialog("SORRY BUT PROGRAM DOES NOT EXCEPT NEGATIVE BALANCES " + "\n PLEASE TRY AGAIN");
					
					amount = Double.parseDouble(input);
				}
		        
				if(amount > 0){
					
					 _balance = _balance + amount;
				
			}
				
				 //formating the variable balance and storing it into the string variable output
				String output = String.format("ID: " + _id + "," + "Balance: $%,.2f", _balance);
				    
		        JOptionPane.showMessageDialog(null, output);
				
			}//end try
			
			catch(Exception ex) {
				
				ex.getMessage();
			}//end catch
			
			
			
		}//end of deposit method
		
		
		
		
		//methods for number of checks being used
		public void resetChecksUsed() {
			
			if(numberOfChecksUsed <= 3 && _balance > -10) {
				
				numberOfChecksUsed = 0;
				
			}
			
			
		}//end of resetChecksUsed method
		
		public int getChecksUsed() {
			
			//first 3 checks in a month are free
			//after that there is a fee for $2 each withdraw transaction
			if(numberOfChecksUsed > 3 && _balance < -10 ) {
				
				JOptionPane.showMessageDialog(null, "CHECK USE IS DISALLOWED");
			}
			
			
			return numberOfChecksUsed;
			
		}//end of getChecksUsed method
		
		public boolean withdrawUsingCheck(double amount) {
			
			boolean ChecksUsed;
			
			if(amount > -10 && numberOfChecksUsed <= 3) {
				
				_balance = _balance - amount;
				
				if(numberOfChecksUsed > 3 && amount > -10) {
					
					
					_balance = _balance - 2;
					
				}//end if
				
				 String output = String.format("ID: " + _id + "," + " Balance: " + "$%,.2f", _balance);
					
					
					JOptionPane.showMessageDialog(null, output);
					
				
				ChecksUsed = true;
				
			}//end if
			
			
			
			else {
						
				
				ChecksUsed = false;
				
				JOptionPane.showMessageDialog(null, "OOPS LOOKS LIKE YOU HAVE A OVERDRAFT");
				
			}//end else
			
			return ChecksUsed;
			
		}//end of boolean withdrawsUsingCheck method
		
		
	}//end checkingAccount subclass
	
	 
	 
