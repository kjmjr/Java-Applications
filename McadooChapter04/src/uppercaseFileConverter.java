/*
Kevin McAdoo
*Purpose: program reads a file and converts input on the file to upper case in a new written file
* 2-8-2018
*/

/*
 * Command for importing a text box, imported files and a console Scanner
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class uppercaseFileConverter {

	private static String ch;
	private static File inputfile;
	private static Scanner keyboard;

	public static void main(String[] args)  throws IOException {
		
		// Variable string names used for the program
		String filename;
		String filenames;
		
		// The dialog text box used for users input asking for two different files
		filename = JOptionPane.showInputDialog("In the text box type in myinfile.doc");
		
		filenames = JOptionPane.showInputDialog("In the text box type in myoutput.doc");
		
		//Setting the keyboard Scanner
		setKeyboard(new Scanner (System.in));
		
		//Setting the input file  
		setInputfile(new File(filename));
		
		//Making a print writer for the output file
		PrintWriter outputFile = new PrintWriter(filenames);
		
		//Setting a new scanner for the input file
		Scanner inputFile = new Scanner(filename);
		
		// Using a for loop to read 3 lines of text in the program
		for (int i = 1; i <= 3; i++) {

		//reading next line
		String line = inputFile.nextLine();
		ch = null; 
		
		outputFile.write(ch.toUpperCase());
		
		//writing next line
		outputFile.println();
		
		//prints the lines 3 times
		System.out.println(line);
		}	
		
        //This prints my name in the output file for writing
		outputFile.println("Kevin McAdoo");
		
		//closes the input file
		inputFile.close();
		
		//closes the output file
	    outputFile.close();
	    
	    //final text box dialog message printed
	    JOptionPane.showMessageDialog(null, "Your file has been written");
		
	}

	// public static and public static void Scanners for keyboards
	public static Scanner getKeyboard() {
		return keyboard;
	}

	public static void setKeyboard(Scanner keyboard) {
		uppercaseFileConverter.keyboard = keyboard;
	}

	public static File getInputfile() {
		return inputfile;
	}

	public static void setInputfile(File inputfile) {
		uppercaseFileConverter.inputfile = inputfile;
	}
}
