package generics;

import java.util.Comparator;

public class generics {

	public static void main(String[] args) {

		// int[] arr = { 10, 20, 30, 40 };
		// bubblesort(arr);
		// bubblesort(car);

		cars[] car = new cars[5];
		car[0] = new cars(100, 1000, "blue");
		car[1] = new cars(200, 2000, "black");
		car[2] = new cars(300, 3000, "violet");
		car[3] = new cars(400, 4000, "red");
		car[4] = new cars(500, 5000, "green");
//		we will pass the type of comparator 
		bubblesort(car, new carspricecomparator());
		System.out.println();
		bubblesort(car, new carsspeedcomparator());
		System.out.println();
		bubblesort(car, new carscolorcomparator());
		
		System.out.println("==============================");
		linkedlistgeneric<cars> list = new linkedlistgeneric<>();
		list.addFirst(car[0]);
		list.addFirst(car[1]);
		list.addFirst(car[2]);
		list.addFirst(car[3]);
		list.addFirst(car[4]);
		
		list.display();

	}

	
	
	
//	generic values can accept any value so that some function nnedn't be written for different data types.
//	no the same function can accept any type of value.  
//  we will make t such that only comparable values can enter i.e by writing extends comparable
//	t is just a representation any letter can be used.
	
	public static <T extends Comparable<T>> void bubblesort(T[] arr) {
		for (int counter = 0; counter <= arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				// it needs the basis on which it should compare the two values
				// as T can have values like an object
				if (arr[j + 1].compareTo(arr[j]) < 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		display(arr);
	}

	public static <T> void bubblesort(T[] arr, Comparator<T> comp) {
		for (int counter = 0; counter <= arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (comp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		display(arr);
	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val);
		}
	}

}
