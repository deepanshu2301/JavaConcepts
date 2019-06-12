package OOPS_story3;

public class Client {

	public static void main(String[] args) {

		System.out.println("-- Case 1--");
		P obj1 = new P();

		// P have the blueprint to be copied
		// obj1 is default
		// new assigns it a new location
		// p()sets the new values

		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.Fun();
		obj1.Fun1();
		// obj1.Fun2(); // don't make any sense as fun2 don't exist

		System.out.println("-- Case 2--");
		P obj2 = new C();
		// p ka data copy hoga obj2 and secondary is c
		// this is valid as data member of p are present in c as c is inherited
		System.out.println(obj2.d);
		System.out.println(((C) obj2).d);
		// typecasting to make p type to c type

		System.out.println(obj2.d1);
		// System.out.println(obj2.d2);
		System.out.println(((C) obj2).d2);
		// if nothing is specified then reference is used as the values
		// typecasting to be used only in memebers and not functions

		obj2.Fun();
		((P) obj2).Fun();
		obj2.Fun1();
		((C) obj2).Fun2();
		// but in functions only primary is refered if func don't exist in that
		// then only secondary is considered.

		System.out.println("-- Case 3--");
		// C obj3 = new P();
		// it is not possible as the variables like d2 don't exist in the memory of P

		System.out.println("-- Case 4--");
		C obj4 = new C();
		System.out.println(obj4.d);
		System.out.println(((P) obj4).d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);

		// for function collision first the blueprint of the passed class is
		// checked and then if the function is present
		// it is taken and returned.

		// FOR FUNCTION COLLISIONS TYPECASTING DON'T WORK
		obj4.Fun();
		((P) obj4).Fun();
		obj4.Fun1();
		obj4.Fun2();

	}

}
