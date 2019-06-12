package OOPS_story1;


// never make these class as static 
// we will provide some features to our client student without giving them access to data

public class student {
	String name = "H";
	int age = 80 ;

	
//	default constructor
//	when a new student is formed in client it will be called if no values are passed to it
	public student() {
		
	}
	
	
	
//	when this function is called,it will copy name and age in current object..
//	we are changing the current object data indirectly..
	public student(String name, int age) {
		this.name = name ;
		this.age = age ;
	}
	
	
	
//	this function will print names..
//	this.name refers to the name of object through which it is called
//	and the name refers to the string which is passes and taken as name
	public void sayHi(String name) {
		System.out.println(this.name + " says hii to " + name);
	}

	
	
//	this function will print the name and year of the object through which it is called 
	public void IntroduceYourself() {
		System.out.println(this.name + " is " + this.age + " years old");
	}
}
