package OOPS_story1;

public class studentclient {
	
	

	public static void main(String[] args) {

		student s1 = new student();
//		new student s1 is called in the heap
//		it will refer to the student class and will be assigned the values there
		System.out.println(s1.name);
		System.out.println(s1.age);

//		values of s1 parameters will be changed
		s1.name = "Amit";
		s1.age = 10;
		System.out.println(s1.name);
		System.out.println(s1.age);

		
//		a student s2 will be created in the stack which will be assigned the address of s1
		student s2 = s1;

//		values of s2 parameters will be changed but it was looking at s1. so there will be change at address of s1
//		which was common to both
		s2.age = 30;
		s2.name = "Ram";

//		values of s1 parameters will be changed, s2 will be affected as it shares the same address
		s1.name = "A";
		s1.age = 10;

		System.out.println(s1.age + " " + s1.name);
		System.out.println(s2.age + " " + s2.name);

//		new is used, so a new student s3 will be created in the heap with the same data referred by student class
		student s3 = new student();
//		values of only s3 will be changed 
		s3.age = 10;
		s3.name = "A";

//		new is used, so a new student s4 will be created in the heap with the same data referred by student class
		student s4 = new student();
//		values of only s4 will be changed	
		s4.age = 20;
		s4.name = "B";

		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);
		 Test2(s3, s4);
		System.out.println("==");
//		no change in s3,s4 is noticed as test forms it own classes and change that one 
		System.out.println(s3.age + " " + s3.name);
		System.out.println(s4.age + " " + s4.name);

		int myAge = 30;
		String myName = "C";

		Test3(s3, s4.age, s4.name, myAge, myName);
		
//		since s3 is passed as a whole so there will be a change ins3
		System.out.println(s3.age + " " + s3.name);
		
//		only the values are passed so s4 will not be changed
		System.out.println(s4.age + " " + s4.name);
		System.out.println(myAge + " " + myName);
		
		System.out.println("================================================");
		s1.sayHi("C");
		s1.IntroduceYourself();

//		if no value is passed in student column then it will call student2 and will give default values
		student s10 = new student("I", 90);
		// s10.name = "I" ;
		// s10.age = 90 ;
		s10.IntroduceYourself();

//		only a new student will be created
		student s11 = new student();

		
		student2 s50 = new student2();
		s50.name = null ;
		s50.age = -10 ;
		System.out.println(s50.name);	
		System.out.println(s50.age);
		System.out.println("================================================");
		
		
	}

	public static void Test3(student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}

	public static void Test2(student s1, student s2) {

//		no change in passed instance will be noticed as new objects are formed in the test2 
		s2 = new student();
		int tempa = s1.age;
		s1.age = s2.age;
		s2.age = tempa;

		s1 = new student();
		String tempn = s1.name;
		s1.name = s2.name;
		s2.name = tempn;
	}

	public static void Test1(student s1, student s2) {
		
//		data of both the students will be swapped
//		no changes in called values
		student temp = s1;
		s1 = s2;
		s2 = temp;
	}
}
