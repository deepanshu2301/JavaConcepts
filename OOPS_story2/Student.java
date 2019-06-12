package OOPS_story2;


//never make these class as static 
//we will provide some features to our client student without giving them access to data


public class Student {
	
//	private will deny the access to the selected data
	private int age ;
	private String name ;
	
	
//	this function will set the age of the student referred by taking the parameter 
//	throws exception is written so that a error is given if the value doesn't fulfill the required criteria
//	this here is used to refer students data and pass it
	public void setAge(int age) throws Exception{
		
		if(age < 0) {
			throw new Exception("Age cannot be -ve") ;
		}
		
		this.age = age ;
	}
	
	public int getAge() {
		return this.age ;
	}
}
