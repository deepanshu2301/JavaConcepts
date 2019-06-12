package generics;

public class cars implements Comparable<cars> {

	int speed;
	int price;
	String color;

	public cars(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	
	
//	if the priority of this function is greater than then it must return a positive value
//	so we should subtract the values according to the sign 
	
	
	
	public int compareTo(cars other) {
		
		// on the basis of price
//		 return other.price - this.price;
		 
		 
		 
		// on the basis of speed
		 return other.speed-this.speed;
	
		 
		 
//		 on the basis of color
//		 return this.color.compareTo(other.color);
	}

	@Override
	public String toString() {
		return "s:" + this.speed + " p:" + this.price + " c:" + this.color;
	}
}
