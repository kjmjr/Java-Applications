/*
Kevin McAdoo
*Purpose: This program demonstrates the countable class 
* 3-21-2018
*/

public class McAdooChapter08StaticDemo {

	public static void main(String[] args) {
		
		int objectCount;
		
		//create three instances of the Countable class
		McAdooChapter08ClassCountable object1 = new McAdooChapter08ClassCountable();
		//McAdooChapter08ClassCountable object2 = new McAdooChapter08ClassCountable();
		//McAdooChapter08ClassCountable object3 = new McAdooChapter08ClassCountable();
		
		//Get the number of instances from the class's static field
		objectCount = object1.getInstanceCount();
		System.out.println(objectCount + " instances of the class " + "were created.");
		
	

	}

}
