import java.util.Scanner;

public class McAdooAverageGrade {

	public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
       int numScores = 0, test1 = 0 , test2 = 0, test3 = 0;
       String name;
       double testAverage = 0.0;
       
       System.out.println("What is your name?");
       name = keyboard.nextLine();
       System.out.println("How many scores do you have? (1-3)");
       numScores = keyboard.nextInt();
	 
 

     for (int counter = 1; counter <= numScores; counter++) {
	   switch (counter) {
	   case 1:
		   System.out.println("What is test score #1?");
		   test1 = keyboard.nextInt();	   
		   break;
		 
	   case 2:
		   System.out.println("What is test score #2?");
		   test2 = keyboard.nextInt();
		   break;
		   
	   case 3:
		   System.out.println("What is test score #3?");
		   test3 = keyboard.nextInt();
		   break;
	  default:
		   System.out.println("Sorry I can only get 3 scores");
	   }
    }
     
     
     if (numScores == 1)
    	 testAverage = calcAvg(test1);
     else if (numScores == 2)
    	testAverage = calcAvg(test1, test2);
     else if (numScores == 3)
    	 testAverage = calcAvg(test1, test2, test3);
     
       displayAverage (numScores, testAverage); 
       
       keyboard.close();
       
	}	
	
       public static int getScore(int myCounter) {
    	   Scanner keyboard = new Scanner (System.in);
    	   int myScore;
    	   System.out.println("What is test score #" + myCounter + "?" );
		   myScore = keyboard.nextInt();
    	   return myScore;
       }
       
       public static double calcAvg (int test1) {
    	   double average = test1;
    	   return average;
    	   
       }
       
       public static double calcAvg (int test1, int test2) {
    	   double average = (test1 + test2) / 2.0;
    	   return average;
    	   
       }
       
       public static double calcAvg (int test1, int test2, int test3) {
    	   double average = (test1 + test2 + test3) / 3.0;
    	   return average;
    	   
       }
       
       public static void displayAverage (int num, double avg) {
    	   System.out.print("The average of your " + num + " scores is ");
    	   System.out.printf("%.2f", avg);
    	 
         }
       }
	

        



