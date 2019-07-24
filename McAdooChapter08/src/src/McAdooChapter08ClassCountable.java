/*
Kevin McAdoo
*Purpose: This class demonstrates a static field
* 3-21-2018
*/

public class McAdooChapter08ClassCountable {
	
	private static int instanceCount = 0;
	
	 /*
	 * The Constructor increments the static field instanceCount. This keeps track of the number of instances of this 
	 * class that are created
	 */

	public McAdooChapter08ClassCountable() {
	
		instanceCount++;
		
		/*
		 * The getInstanceCount method returns the number of instances of the class
		 * that have been created.
		 * @return The value in the instanceCount field.
		 */
		
	}
	
	public int getInstanceCount()
	{
		return instanceCount;
	}

}
