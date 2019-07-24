/* Name:
 * Date:
 * Purpose:
 */ 


import javax.swing.JOptionPane;
public class McadoosTestAverage {

	public static void main(String[] args) {
		// variables
		String inputStr;
		int test1, test2, test3;
		double testAvg;
		
		//input
		inputStr = JOptionPane.showInputDialog("Test 1 Score:");
				test1 = Integer.parseInt(inputStr);
		inputStr = JOptionPane.showInputDialog("Test 2 Score:");
				test2 = Integer.parseInt(inputStr);
		inputStr = JOptionPane.showInputDialog("Test 3 Score:");
				test3 = Integer.parseInt(inputStr);
		
		//output
		testAvg = (test1 + test2 + test3) / 3;
		System.out.println("Test scores:" +
		          test1 + " " + test2 + " " + test3);
		System.out.println("Test average: " + testAvg);
				

	}

}
