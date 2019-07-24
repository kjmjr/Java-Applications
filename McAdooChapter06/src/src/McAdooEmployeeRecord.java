/*
Kevin McAdoo
*Purpose: new class for employee record
* 2-26-2018
*/

//the class needed for employee records
public class McAdooEmployeeRecord {

//the variables set to private in this form 
	private String name;
	private int idNumber = 0;
	private String department;
	private String position;
	
	// public McAdooEmployeeRecord is made 3 times for 3 constructors
	public McAdooEmployeeRecord (String n, int id, String dept, String pos){
	
	   name = n;
	   idNumber = id;
	   department = dept;
	   position = pos;
	}
	
	//empty strings are assigned to the next 2 employee records
	public McAdooEmployeeRecord (String employeeN, int employeeId){
	
	  name = employeeN;
	  idNumber = employeeId;
	  department = "";
	  position = "";
	  
	}
	
	//0 is assigned to id number
	public McAdooEmployeeRecord (){
	
	 name = "";
	 idNumber = 0;
	 department = "";
	 position = "";
	 
	}
	//the public void for 4 of the variables are set variables
	public void setName(String n) {
	  	
		 name = n;
	}
	
	public void setIdNumber (int id) {
		
		idNumber = id;
	}
	
	public void setDepartment (String dept) {
		
		department = dept;
	}
	
	public void setPosition(String pos) {
		
		position = pos;
	}

//the next 4 variables are returning the variables using public get(variable)	
	public String getName() {
		
		return name;
	}
	
	public int getIdNumber () {
		
		return idNumber;
	}
	
	public String getDepartment() {
		
		return department;
	}
	
    public String getPosition() {
		
		return position;
	}
	
    
	
}


