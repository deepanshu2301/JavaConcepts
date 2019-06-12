package EXTRA_GYAN;


//   why an arraylist have diamond brackets in their declaration
//		ans=> to make a class accept all the arguments of all the type we need to specify the type of data which is going to be entered.
//		public class genericpair<K>{
//			K a;
//			K b;
//		}
//    here k is of single type and it will act as int if int is passed and as float if that is passed.



//		 why are we having two types of arguments
//		eg- int and Integer
//		eg- double and Double
//		Double (the bigger versions) are the class which is already comparable and can be passed as well as for the comparison.
//      ans=> the smaller version is the type of primitive data type and cannot be made to implement comparable.
//		ArrayList<Integer> needs comparison so only Integer can be passed as int is not implementing comparable.
//		in diamond brakcets only the bigger versions are used.




//		the use of final
//		the keyword final is used when
// 		(a) variable is made to have constant value. once it gets the value it can't be changed.
//		(b) function can't be changed/overwrite.
//		(c) class can't be inherited.
//		but we have to assign the value to the variable either at the passing time or the time at the calling of the constructor.



//		what is static.
//		ans=> the property which belongs to the whole class and not to a particular instance is made static.
//		space is not allocated to static variables.
//		when they get the value for the first time they update it for the whole class
//		when we will access them next time they will be updated autom.
//		way of referring static variable is s1.a;
//		static functions cannot access this. as every instance has it's own this. and static function belongs to the whole class.
//		they cannot access the non-static members as this can't be accessed.
//		though non-static members can access a static member.
//		main is itself a static function so all the function called in the main should be static
//		static function can't be declared in the function where function may be static/non-static.
//		they can be inherited also.

