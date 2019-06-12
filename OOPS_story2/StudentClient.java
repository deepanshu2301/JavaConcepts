package OOPS_story2;

public class StudentClient {
	public static void main(String[] args){

		Student s = new Student();

		try {
			System.out.println("hello");
			s.setAge(-1);
//			after the exception is executed,it will leave try and will goto catch directly..leftover  try will not run if any exception arises
			System.out.println("bye");
		} 
		catch (Exception e) {
//			System.out.println("-");
			e.printStackTrace();
			System.out.println("catch executed successfully");
			
		} finally {
			System.out.println("in final");
		}
		
//		finally is always executed after try/catch
		
		
		System.out.println(s.getAge());
	}
}